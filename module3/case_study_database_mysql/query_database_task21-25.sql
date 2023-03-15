USE furama_database;
-- 21.	Tạo khung nhìn có tên là v_nhan_vien để lấy được thông tin của tất cả các nhân
-- viên có địa chỉ là “Đà Nẵng” và đã từng lập hợp đồng cho một hoặc nhiều khách hàng
-- bất kì với ngày lập hợp đồng là “tháng 4 2021”.
CREATE VIEW v_nhan_vien AS
SELECT nv.* 
FROM nhan_vien nv 
JOIN hop_dong hd ON hd.ma_nhan_vien = nv.ma_nhan_vien
WHERE nv.dia_chi LIKE '% Đà Nẵng'
AND MONTH(hd.ngay_lam_hop_dong) = 4 AND YEAR(hd.ngay_lam_hop_dong)=2021;
DROP VIEW v_nhan_vien;

-- 22.	Thông qua khung nhìn v_nhan_vien thực hiện cập nhật địa chỉ thành “Liên Chiểu”
--  đối với tất cả các nhân viên được nhìn thấy bởi khung nhìn này.

SET SQL_SAFE_UPDATES = 0;
UPDATE nhan_vien nv 
SET 
    nv.dia_chi = 'Liên Chiểu'
WHERE
    ma_nhan_vien IN (SELECT 
            *
        FROM
            (SELECT 
                v_nhan_vien.ma_nhan_vien
            FROM
                v_nhan_vien) AS x);
                
-- 23.	Tạo Stored Procedure sp_xoa_khach_hang dùng để xóa thông tin của một khách hàng
-- nào đó với ma_khach_hang được truyền vào như là 1 tham số của sp_xoa_khach_hang
	DELIMITER //
    CREATE PROCEDURE sp_xoa_khach_hang (ma_khach INT)
    BEGIN
		DELETE FROM khach_hang
        WHERE ma_khach_hang = ma_khach;
	END //
    DELIMITER ;
    
    CALL sp_xoa_khach_hang(1);
    
-- 24.	Tạo Stored Procedure sp_them_moi_hop_dong dùng để thêm mới vào bảng hop_dong
-- với yêu cầu sp_them_moi_hop_dong phải thực hiện kiểm tra tính hợp lệ của dữ liệu bổ sung,
-- với nguyên tắc không được trùng khóa chính và đảm bảo toàn vẹn tham chiếu đến các bảng liên quan.
    
    DELIMITER //
    CREATE PROCEDURE sp_them_moi_hop_dong(ma_hd INT,ngay_lam DATETIME,ngay_ket_thuc DATETIME,tien_coc DOUBLE, ma_nv INT,ma_kh INT,ma_dich_vu INT )
    BEGIN
    SET FOREIGN_KEY_CHECKS = 0; 
    INSERT INTO hop_dong(ma_hop_dong,ngay_lam_hop_dong,ngay_het_thuc,tien_dat_coc,ma_nhan_vien,ma_khach_hang,ma_dich_vu)
		VALUE(ma_hd,ngay_lam,ngay_ket_thuc,tien_coc,ma_nv,ma_kh,ma_dich_vu);
    SET FOREIGN_KEY_CHECKS = 1;     
	END //
    DELIMITER ;
    CALL sp_them_moi_hop_dong(13,'2022-12-08','2022-12-09',0,3,1,3);
    
 -- 25.	Tạo Trigger có tên tr_xoa_hop_dong khi xóa bản ghi trong bảng
 -- hop_dong thì hiển thị tổng số lượng bản ghi còn lại có trong bảng hop_dong
 -- ra giao diện console của database.
-- Lưu ý: Đối với MySQL thì sử dụng SIGNAL hoặc ghi log thay cho việc ghi ở console.
CREATE TABLE `history`(ma_hop_dong INT,ngay_xoa_hop_dong DATETIME,tong_con_lai INT);
DROP TABLE `history`;
DELIMITER //
CREATE TRIGGER tr_xoa_hop_dong
AFTER DELETE ON hop_dong
FOR EACH ROW
BEGIN
SET FOREIGN_KEY_CHECKS = 0; 
INSERT INTO `history` VALUE(old.ma_hop_dong,NOW(),(SELECT COUNT(ma_hop_dong) FROM hop_dong));
SET FOREIGN_KEY_CHECKS = 1; 
END  //
DELIMITER ;
DELETE FROM hop_dong WHERE ma_hop_dong = 10;
-- MYSQL> DELETE FROM hop_dong WHERE ma_hop_dong = 8;
-- MYSQL> SELECT COUNT(ma_nhan_vien) FROM hop_dong ;
DROP TRIGGER tr_xoa_hop_dong;
SET FOREIGN_KEY_CHECKS = 0; 
SET FOREIGN_KEY_CHECKS = 1; 


TRUNCATE hop_dong;
TRUNCATE dich_vu;





    
    
  

    
    
    
    
    
