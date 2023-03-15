USE furama_database;
-- 11.	Hiển thị thông tin các dịch vụ đi kèm đã được sử dụng bởi
-- những khách hàng có ten_loai_khach là “Diamond” và có dia_chi ở “Vinh” hoặc “Quảng Ngãi”.
SELECT 
    dvdk.ma_dich_vu_di_kem,
    dvdk.ten_dich_vu_di_kem
FROM
    dich_vu_di_kem dvdk
	JOIN hop_dong_chi_tiet hdct ON dvdk.ma_dich_vu_di_kem = hdct.ma_dich_vu_di_kem
    JOIN hop_dong hd ON hdct.ma_hop_dong = hd.ma_hop_dong
    JOIN khach_hang kh ON hd.ma_khach_hang = kh.ma_khach_hang
    JOIN loai_khach lk ON kh.ma_loai_khach = lk.ma_loai_khach
    WHERE lk.ten_loai_khach REGEXP('Diamond') AND (kh.dia_chi LIKE '% Vinh' OR kh.dia_chi LIKE '% Quảng Ngãi') 
    GROUP BY dvdk.ma_dich_vu_di_kem;
    
-- 12.	Hiển thị thông tin ma_hop_dong, ho_ten (nhân viên), ho_ten (khách hàng),
-- so_dien_thoai (khách hàng), ten_dich_vu, so_luong_dich_vu_di_kem (được tính dựa
-- trên việc sum so_luong ở dich_vu_di_kem), tien_dat_coc của tất cả các dịch vụ đã từng được khách 
-- hàng đặt vào 3 tháng cuối năm 2020 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2021.
SELECT
	hd.ma_hop_dong,
    nv.ho_ten,
    kh.ho_ten,
    kh.so_dien_thoai,
    dv.ten_dich_vu,
    ifnull(SUM(hdct.so_luong),0)  AS so_luong_dich_vu_di_kem,
    hd.tien_dat_coc
FROM nhan_vien nv 
	JOIN hop_dong hd ON nv.ma_nhan_vien = hd.ma_nhan_vien
    JOIN khach_hang kh ON kh.ma_khach_hang = hd.ma_khach_hang
    JOIN dich_vu dv ON hd.ma_dich_vu = dv.ma_dich_vu
    LEFT JOIN hop_dong_chi_tiet hdct ON hdct.ma_hop_dong = hd.ma_hop_dong
WHERE hd.ma_hop_dong NOT IN (
SELECT ma_hop_dong
FROM hop_dong 
WHERE MONTH(ngay_lam_hop_dong) IN(1,2,3,4,5,6) AND YEAR (ngay_lam_hop_dong)='2021'
)
AND MONTH(hd.ngay_lam_hop_dong) IN(10,11,12) AND YEAR (hd.ngay_lam_hop_dong)='2020'
GROUP BY ma_hop_dong;

-- 13.	Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách
-- hàng đã đặt phòng. (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).
SELECT 
	dvdk.ma_dich_vu_di_kem,
    dvdk.ten_dich_vu_di_kem,
    SUM(hdct.so_luong) AS so_luong_dich_vu_di_kem
FROM dich_vu_di_kem dvdk
	JOIN hop_dong_chi_tiet hdct ON dvdk.ma_dich_vu_di_kem = hdct.ma_dich_vu_di_kem
GROUP BY ma_dich_vu_di_kem
HAVING SUM(so_luong) >= ALL (SELECT SUM(so_luong) FROM hop_dong_chi_tiet GROUP BY hop_dong_chi_tiet.ma_dich_vu_di_kem);
    
-- 14.	Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất.
-- Thông tin hiển thị bao gồm ma_hop_dong, ten_loai_dich_vu, ten_dich_vu_di_kem,
-- so_lan_su_dung (được tính dựa trên việc count các ma_dich_vu_di_kem).
SELECT 
hd.ma_hop_dong,
ldv.ten_loai_dich_vu,
dvdk.ten_dich_vu_di_kem,
COUNT(dvdk.ma_dich_vu_di_kem) AS so_lan_su_dung
FROM hop_dong hd
	JOIN dich_vu dv ON hd.ma_dich_vu = dv.ma_dich_vu
    JOIN loai_dich_vu ldv ON dv.ma_loai_dich_vu = ldv.ma_loai_dich_vu
    JOIN hop_dong_chi_tiet hdct ON hdct.ma_hop_dong = hd.ma_hop_dong
    JOIN dich_vu_di_kem dvdk ON dvdk.ma_dich_vu_di_kem = hdct.ma_dich_vu_di_kem
GROUP BY dvdk.ten_dich_vu_di_kem
HAVING so_lan_su_dung = 1
ORDER BY hd.ma_hop_dong;

-- 15.	Hiển thi thông tin của tất cả nhân viên bao gồm ma_nhan_vien, ho_ten,
-- ten_trinh_do, ten_bo_phan, so_dien_thoai, dia_chi mới chỉ lập được tối đa 3 hợp đồng từ năm 2020 đến 2021.
SELECT
	nv.ma_nhan_vien,
    nv.ho_ten,
    td.ten_trinh_do,
    bp.ten_bo_phan,
    nv.so_dien_thoai,
    nv.dia_chi
FROM nhan_vien nv
	JOIN trinh_do td ON nv.ma_trinh_do = td.ma_trinh_do
    JOIN bo_phan bp ON nv.ma_bo_phan = bp.ma_bo_phan
    JOIN hop_dong hd ON hd.ma_nhan_vien = nv.ma_nhan_vien
    WHERE ngay_lam_hop_dong BETWEEN '2020-01-01' AND '2021-12-31'
GROUP BY ho_ten
HAVING COUNT(hd.ma_hop_dong) <= 3









