package model;

public class BenhAn {
    private String idBenhAn;
    private String idBenhNhan;
    private String name;
    private String ngayNhap;
    private String ngayRa;
    private String lyDo;
    private String phuongPhapDieuTri;
    private String bacSi;

    public BenhAn() {
    }

    public BenhAn(String idBenhAn, String idBenhNhan, String name, String ngayNhap, String ngayRa, String lyDo, String phuongPhapDieuTri, String bacSi) {
        this.idBenhAn = idBenhAn;
        this.idBenhNhan = idBenhNhan;
        this.name=name;
        this.ngayNhap = ngayNhap;
        this.ngayRa = ngayRa;
        this.lyDo = lyDo;
        this.phuongPhapDieuTri = phuongPhapDieuTri;
        this.bacSi = bacSi;
    }


    public String getIdBenhAn() {
        return idBenhAn;
    }

    public void setIdBenhAn(String idBenhAn) {
        this.idBenhAn = idBenhAn;
    }

    public String getIdBenhNhan() {
        return idBenhNhan;
    }

    public void setIdBenhNhan(String idBenhNhan) {
        this.idBenhNhan = idBenhNhan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public String getNgayRa() {
        return ngayRa;
    }

    public void setNgayRa(String ngayRa) {
        this.ngayRa = ngayRa;
    }

    public String getLyDo() {
        return lyDo;
    }

    public void setLyDo(String lyDo) {
        this.lyDo = lyDo;
    }

    public String getPhuongPhapDieuTri() {
        return phuongPhapDieuTri;
    }

    public void setPhuongPhapDieuTri(String phuongPhapDieuTri) {
        this.phuongPhapDieuTri = phuongPhapDieuTri;
    }

    public String getBacSi() {
        return bacSi;
    }

    public void setBacSi(String bacSi) {
        this.bacSi = bacSi;
    }
}
