package case_study_module1.tempalte.model;

public abstract class Xe {
    private String bienSoxe;
    private String tenHangSanXuat;
    private int namSanXuat;
    private String chuSoHuu;

    public Xe() {
    }

    public Xe(String bienSoxe, String tenHangSanXuat, int namSanXuat, String chuSoHuu) {
        this.bienSoxe = bienSoxe;
        this.tenHangSanXuat = tenHangSanXuat;
        this.namSanXuat = namSanXuat;
        this.chuSoHuu = chuSoHuu;
    }

    public String getBienSoxe() {
        return bienSoxe;
    }

    public void setBienSoxe(String bienSoxe) {
        this.bienSoxe = bienSoxe;
    }

    public String getTenHangSanXuat() {
        return tenHangSanXuat;
    }

    public void setTenHangSanXuat(String tenHangSanXuat) {
        this.tenHangSanXuat = tenHangSanXuat;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }

}
