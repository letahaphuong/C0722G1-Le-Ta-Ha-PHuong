CREATE DATABASE IF NOT EXISTS QuanLyDiemThi;
USE QuanLyDiemThi;
CREATE TABLE hoc_sinh (
    ma_hs INT PRIMARY KEY,
    ten_hs VARCHAR(50),
    ngay_sinh DATE,
    lop VARCHAR(20),
    gt VARCHAR(20)
);

CREATE TABLE mon_hoc (
    ma_mm INT PRIMARY KEY,
    ten_mm VARCHAR(50),
    ma_gv INT,
    FOREIGN KEY (ma_gv)
        REFERENCES giao_vien (ma_giao_vien)
);

CREATE TABLE bang_diem (
    id_ma_hh INT,
    FOREIGN KEY (id_ma_hh)
        REFERENCES hoc_sinh (ma_hs),
    id_ma_mh INT,
    FOREIGN KEY (id_ma_mh)
        REFERENCES mon_hoc (ma_mm),
    diem_thi INT,
    ngay_kt DATE
);

CREATE TABLE giao_vien (
    ma_giao_vien INT PRIMARY KEY,
    ten_giao_vien VARCHAR(50),
    sdt VARCHAR(20)
);

