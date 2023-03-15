CREATE DATABASE IF NOT EXISTS quan_ly_vat_tu;
USE quan_ly_vat_tu;
CREATE TABLE phieu_xuat (
    so_phieu_xuat INT PRIMARY KEY,
    ngay_xuat DATE
);

CREATE TABLE phieu_nhap (
    so_phieu_nhap INT PRIMARY KEY,
    ngay_nhap DATE
);

CREATE TABLE sdt (
    sdt_id INT PRIMARY KEY,
    sdt VARCHAR(30)
);

CREATE TABLE nha_cung_cap (
    ma_nha_cung_cap INT PRIMARY KEY,
    ten_nha_cung_cap DATE,
    dia_chi VARCHAR(255),
    sdt_id INT,
    FOREIGN KEY (sdt_id)
        REFERENCES sdt (sdt_id)
);


CREATE TABLE don_dat_hang (
    so_don_dat_hang INT PRIMARY KEY,
    ngay_dat_hang DATE,
    sdt_id INT,
    FOREIGN KEY (sdt_id)
        REFERENCES sdt (sdt_id)
);

CREATE TABLE vat_tu (
    ma_vat_tu INT PRIMARY KEY,
    ten_vat_tu VARCHAR(50)
);

CREATE TABLE vat_tu_don_dat_hang (
    ma_vat_tu INT,
    so_don_dat_hang INT,
    PRIMARY KEY (ma_vat_tu , so_don_dat_hang),
    FOREIGN KEY (ma_vat_tu)
        REFERENCES vat_tu (ma_vat_tu),
    FOREIGN KEY (so_don_dat_hang)
        REFERENCES don_dat_hang (so_don_dat_hang)
);

CREATE TABLE vat_tu_phieu_xuat (
    ma_vat_tu INT,
    so_phieu_xuat INT,
    PRIMARY KEY (ma_vat_tu , so_phieu_xuat),
    FOREIGN KEY (ma_vat_tu)
        REFERENCES vat_tu (ma_vat_tu),
    FOREIGN KEY (so_phieu_xuat)
        REFERENCES phieu_xuat (so_phieu_xuat)
);

CREATE TABLE vat_tu_phieu_nhap (
    ma_vat_tu INT,
    so_phieu_nhap INT,
    PRIMARY KEY (ma_vat_tu , so_phieu_nhap),
    FOREIGN KEY (ma_vat_tu)
        REFERENCES vat_tu (ma_vat_tu),
    FOREIGN KEY (so_phieu_nhap)
        REFERENCES phieu_nhap (so_phieu_nhap)
);
