USE furama_database;

-- 2.	Hiển thị thông tin của tất cả nhân viên có trong
-- hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” 
-- và có tối đa 15 kí tự.
SELECT nhan_vien.* FROM nhan_vien
WHERE ho_ten 
LIKE'H%'OR ho_ten
LIKE'T%' OR ho_ten 
LIKE'K%' AND char_length(ho_ten)<15;

-- 3.	Hiển thị thông tin của tất cả khách hàng
-- có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
SELECT * FROM khach_hang AS KH
WHERE (KH.dia_chi LIKE '%Đà nẵng' OR KH.dia_chi LIKE '%Quảng Trị')
AND (year(curdate())-year(KH.ngay_sinh)) BETWEEN 18 AND 50; 

-- 4.	Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần.
-- Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng.
-- Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.
 
 SELECT kh.*,COUNT(hd.ma_hop_dong) AS so_lan_dat ,lk.ten_loai_khach
 FROM khach_hang kh 
 JOIN loai_khach lk ON kh.ma_loai_khach=lk.ma_loai_khach 
 JOIN hop_dong hd ON kh.ma_khach_hang = hd.ma_khach_hang
 GROUP BY ho_ten
 HAVING lk.ten_loai_khach = 'Diamond'
 ORDER BY so_lan_dat;
 
 -- 5.	Hiển thị ma_khach_hang, ho_ten, ten_loai_khach,
 -- ma_hop_dong, ten_dich_vu, ngay_lam_hop_dong,
 -- ngay_ket_thuc, tong_tien (Với tổng tiền được tính theo công thức như
 -- sau: Chi Phí Thuê + Số Lượng * Giá, với Số Lượng và Giá là từ bảng dich_vu_di_kem,
 -- hop_dong_chi_tiet) cho tất cả các khách hàng đã từng đặt phòng. (những khách hàng
 -- nào chưa từng đặt phòng cũng phải hiển thị ra).
    
CREATE VIEW view_hop_dong AS
    SELECT 
        hd.ma_hop_dong,
        dv.ten_dich_vu,
        hd.ngay_lam_hop_dong,
        hd.ngay_het_thuc,
        hd.ma_khach_hang,
        (dv.chi_phi + SUM(ifnull(hdct.so_luong,0) * ifnull(dvdk.gia,0))) AS tong_tien
    FROM
        hop_dong hd
            JOIN
        dich_vu dv ON hd.ma_dich_vu = dv.ma_dich_vu
            LEFT JOIN
        hop_dong_chi_tiet hdct ON hd.ma_hop_dong = hdct.ma_hop_dong
            LEFT JOIN
        dich_vu_di_kem dvdk ON dvdk.ma_dich_vu_di_kem = hdct.ma_dich_vu_di_kem
    GROUP BY hd.ma_hop_dong;

SELECT 
    kh.ma_khach_hang, kh.ho_ten, lk.ten_loai_khach, vhd.*
FROM
    khach_hang kh
        JOIN
    loai_khach lk ON kh.ma_loai_khach = lk.ma_loai_khach
        LEFT JOIN
    view_hop_dong vhd ON kh.ma_khach_hang = vhd.ma_khach_hang
ORDER BY kh.ma_khach_hang;

DROP VIEW view_hop_dong;

-- CREATE VIEW temp_view AS
-- SELECT kh.ma_khach_hang, kh.ho_ten,lk.ten_loai_khach,
-- hd.ma_hop_dong, dv.ten_dich_vu, hd.ngay_lam_hop_dong,
-- hd.ngay_het_thuc,(dv.chi_phi + hdct.so_luong * dvdk.gia) AS tong_tien
-- FROM khach_hang kh 
-- JOIN loai_khach lk ON kh.ma_khach_hang = lk.ma_loai_khach
-- JOIN hop_dong hd ON kh.ma_khach_hang = hd.ma_khach_hang
-- JOIN dich_vu dv ON hd.ma_dich_vu= dv.ma_dich_vu
-- JOIN hop_dong_chi_tiet hdct ON hd.ma_hop_dong = hdct.ma_hop_dong
-- JOIN dich_vu_di_kem dvdk ON hdct.ma_dich_vu_di_kem = dvdk.ma_dich_vu_di_kem
-- GROUP BY ma_hop_dong
 




