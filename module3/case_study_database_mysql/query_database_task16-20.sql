USE furama_database;

-- 16.	Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2019 đến năm 2021.
SET SQL_SAFE_UPDATES = 0;

DELETE nv.*
FROM
    nhan_vien nv
WHERE
    nv.ma_nhan_vien NOT IN (
    SELECT*FROM(SELECT 
            ma_nhan_vien
        FROM
            hop_dong
        WHERE
            ngay_lam_hop_dong BETWEEN '2019-01-01' AND '2021-12-31') AS x
    );
SET SQL_SAFE_UPDATES = 1;


       
-- 17.	Cập nhật thông tin những khách hàng có ten_loai_khach từ
-- Platinum lên Diamond, chỉ cập nhật những khách hàng đã từng đặt
-- phòng với Tổng Tiền thanh toán trong năm 2021 là lớn hơn 10.000.000 Vview_dich_vuNĐ.
	CREATE VIEW v_khach_hang_diamond AS
			SELECT 
                kh.ma_khach_hang,
                    kh.ho_ten,
                    IFNULL(dv.chi_phi, 0) + SUM(IFNULL(dvdk.gia, 0) * IFNULL(hdct.so_luong, 0)) AS tong_tien,
                    lk.ma_loai_khach
            FROM
                khach_hang kh
			JOIN loai_khach lk ON lk.ma_loai_khach = kh.ma_loai_khach
			JOIN hop_dong hd ON hd.ma_khach_hang = kh.ma_khach_hang
            LEFT JOIN hop_dong_chi_tiet hdct ON hdct.ma_hop_dong = hd.ma_hop_dong
            LEFT JOIN dich_vu_di_kem dvdk ON dvdk.ma_dich_vu_di_kem = hdct.ma_dich_vu_di_kem
			JOIN dich_vu dv ON dv.ma_dich_vu = hd.ma_dich_vu
            WHERE
                YEAR(hd.ngay_lam_hop_dong) = 2021
                AND lk.ma_loai_khach = 2 ;
           
			UPDATE khach_hang 
            SET ma_loai_khach = 1
            WHERE ma_khach_hang =(SELECT 
            ma_khach_hang
            FROM v_khach_hang_diamond
            GROUP BY ma_khach_hang
            HAVING SUM(tong_tien)>1000000
            );
	
            
-- 18.	Xóa những khách hàng có hợp đồng trước năm 2021 (chú ý ràng buộc giữa các bảng).
	SET SQL_SAFE_UPDATES = 0;
	SET FOREIGN_KEY_CHECKS = 0;
DELETE kh . * FROM khach_hang kh 
WHERE
    kh.ma_khach_hang IN (SELECT 
        *
    FROM
        (SELECT 
            ma_khach_hang
        FROM
            hop_dong
        
        WHERE
            YEAR(ngay_lam_hop_dong) < '2021') AS x);
    
    SET FOREIGN_KEY_CHECKS =1;
    -- 19.	Cập nhật giá cho các dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2020 lên gấp đôi.
    
    SET SQL_SAFE_UPDATES =0;
    UPDATE dich_vu_di_kem 
SET 
    gia = gia * 2
WHERE
    ma_dich_vu_di_kem IN (SELECT 
            *
        FROM
            (SELECT 
                dvdk.ma_dich_vu_di_kem
			
            FROM
                dich_vu_di_kem dvdk
            JOIN hop_dong_chi_tiet hdct ON hdct.ma_dich_vu_di_kem = dvdk.ma_dich_vu_di_kem
			JOIN hop_dong hd ON hd.ma_hop_dong = hdct.ma_hop_dong
            WHERE
                YEAR(hd.ngay_lam_hop_dong) = 2020
            GROUP BY dvdk.ten_dich_vu_di_kem
            HAVING SUM(hdct.so_luong) > 10) AS x);
        
    SET SQL_SAFE_UPDATES =1;
    
  -- 20.	Hiển thị thông tin của tất cả các nhân viên và khách hàng có trong hệ thống,
  -- thông tin hiển thị bao gồm id (ma_nhan_vien, ma_khach_hang), ho_ten, email, so_dien_thoai, ngay_sinh, dia_chi.
  SELECT ma_nhan_vien, ho_ten, email,so_dien_thoai, ngay_sinh, dia_chi FROM nhan_vien
  UNION
  SELECT ma_khach_hang, ho_ten, email,so_dien_thoai, ngay_sinh, dia_chi FROM khach_hang;
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

	