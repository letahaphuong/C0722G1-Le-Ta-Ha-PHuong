USE furama_database;

-- 26.	Tạo Trigger có tên tr_cap_nhat_hop_dong khi cập nhật ngày kết thúc hợp đồng, cần kiểm tra xem thời gian
-- cập nhật có phù hợp hay không, với quy tắc sau: Ngày kết thúc hợp đồng phải lớn hơn ngày làm hợp đồng ít nhất là 2 ngày.
-- Nếu dữ liệu hợp lệ thì cho phép cập nhật, nếu dữ liệu không hợp lệ thì in ra thông báo “Ngày kết thúc hợp đồng phải lớn
-- hơn ngày làm hợp đồng ít nhất là 2 ngày” trên console của database.
-- Lưu ý: Đối với MySQL thì sử dụng SIGNAL hoặc ghi log thay cho việc ghi ở console.


DELIMITER //
CREATE TRIGGER tr_cap_nhat_hop_dong
BEFORE UPDATE ON hop_dong
FOR EACH ROW
BEGIN
IF NEW.ngay_lam_hop_dong IS NULL AND NEW.ngay_ket_thuc IS NOT NULL THEN
	SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'ngay lam hop dong ko duoc de trong';
ELSEIF NEW.ngay_lam_hop_dong IS NOT NULL AND NEW.ngay_ket_thuc IS NULL THEN
	SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'ngay ket thuc ko duoc de trong';
ELSEIF DATEDIFF(NEW.ngay_ket_thuc,NEW.ngay_lam_hop_dong) > 2 THEN
	SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'ngay ket thuc phai lon hon ngay bat dau 2 ngay';
END IF;
END //
DELIMITER ;
DROP TRIGGER tr_cap_nhat_hop_dong;
-- 27.	Tạo Function thực hiện yêu cầu sau:
-- a.	Tạo Function func_dem_dich_vu: Đếm các dịch vụ đã được sử dụng với tổng tiền là > 2.000.000 VNĐ.
-- b.	Tạo Function func_tinh_thoi_gian_hop_dong: Tính khoảng thời gian dài nhất tính từ lúc bắt đầu làm
-- hợp đồng đến lúc kết thúc hợp đồng mà khách hàng đã thực hiện thuê dịch vụ (lưu ý chỉ xét các khoảng thời
-- gian dựa vào từng lần làm hợp đồng thuê dịch vụ, không xét trên toàn bộ các lần làm hợp đồng). Mã của khách hàng được truyền vào như là 1 tham số của function này.

-- a.
CREATE VIEW v_dem_dich_vu AS
SELECT
ma_dich_vu,
SUM(chi_phi_thue) AS tong_tien
FROM dich_vu
GROUP BY ten_dich_vu
HAVING tong_tien > 2000000;
DROP  VIEW v_dem_dich_vu;

DELIMITER //
CREATE FUNCTION func_dem_dich_vu ()
RETURNS INT
DETERMINISTIC
BEGIN 
DECLARE dem INT;
SET dem=(SELECT COUNT(tong_tien) AS dem FROM v_dem_dich_vu );
RETURN dem;
END//
DELIMITER ;
SET @x=func_dem_dich_vu();
SELECT @x;
DROP FUNCTION func_dem_dich_vu;

-- b.
DELIMITER //
CREATE FUNCTION func_tinh_thoi_gian_hop_dong(ma_kh  INT)
RETURNS INT
DETERMINISTIC
BEGIN
DECLARE max INT;
SET max = (SELECT MAX(DATEDIFF( hop_dong.ngay_ket_thuc,hop_dong.ngay_lam_hop_dong)) 
FROM hop_dong JOIN khach_hang ON khach_hang.ma_khach_hang=hop_dong.ma_khach_hang
WHERE khach_hang.ma_khach_hang = ma_kh);
RETURN max;
END //
DELIMITER ;
SET @x=func_tinh_thoi_gian_hop_dong(9);
DROP FUNCTION func_tinh_thoi_gian_hop_dong;

-- 28.	Tạo Stored Procedure sp_xoa_dich_vu_va_hd_room để tìm các dịch vụ được thuê bởi khách hàng với
-- loại dịch vụ là “Room” từ đầu năm 2019 đến hết năm 2020 để xóa thông tin của các dịch vụ đó
-- (tức là xóa các bảng ghi trong bảng dich_vu) và xóa những hop_dong sử dụng dịch vụ liên quan
-- (tức là phải xóa những bản gi trong bảng hop_dong) và những bản liên quan khác.
CREATE VIEW v_xoa_dich_vu_va_hd_room AS
SELECT 
hd.ma_hop_dong,
hd.ngay_lam_hop_dong, 
hd.ngay_ket_thuc,
dv.ma_loai_dich_vu
FROM hop_dong hd 
JOIN dich_vu dv ON hd.ma_dich_vu = dv.ma_dich_vu
WHERE dv.ma_loai_dich_vu = 3
	AND YEAR(hd.ngay_lam_hop_dong) IN (2019,2020) ;
    
TRUNCATE hop_dong;
DELIMITER //
CREATE PROCEDURE sp_xoa_dich_vu_va_hd_room ()
BEGIN
SET SQL_SAFE_UPDATES =0;
SET FOREIGN_KEY_CHECKS =0;
DELETE FROM hop_dong 
WHERE ma_hop_dong IN (SELECT * FROM(SELECT ma_hop_dong FROM v_xoa_dich_vu_va_hd_room ) AS a);
DELETE FROM dich_vu 
WHERE ma_dich_vu IN (SELECT * FROM(SELECT ma_dich_vu FROM v_xoa_dich_vu_va_hd_room ) AS b);
SET SQL_SAFE_UPDATES =1;
SET FOREIGN_KEY_CHECKS =1;
END //
DELIMITER ;
DROP PROCEDURE sp_xoa_dich_vu_va_hd_room;
CALL sp_xoa_dich_vu_va_hd_room();
SELECT * FROM hop_dong;
SELECT * FROM dich_vu;












