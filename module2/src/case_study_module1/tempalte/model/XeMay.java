package case_study_module1.tempalte.model;

public class XeMay extends Xe implements Comparable<XeMay>{
    private String congSuat;

    public XeMay(String congSuat) {
        this.congSuat = congSuat;
    }

    public XeMay(String bienSoxe, String tenHangSanXuat, int namSanXuat, String chuSoHuu, String congSuat) {
        super(bienSoxe, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }
    public XeMay(){}

    public String getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(String congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "xeMay{" + "" +
                ", Biển kiểm soát: " + getBienSoxe() +
                ", Tên hãng sản xuất: " + getTenHangSanXuat() +
                ", Năm sản xuất: " + getNamSanXuat() +
                ", Chủ sở hữu: " + getChuSoHuu() +
                ", Công suất: " + getCongSuat() + '\'' +
                '}';
    }

    @Override
    public int compareTo(XeMay o) {
        if (this.getChuSoHuu().compareTo(o.getChuSoHuu())!=0){
            return this.getChuSoHuu().compareTo(o.getChuSoHuu());
        }
        return this.getTenHangSanXuat().compareTo(o.getTenHangSanXuat());
    }
}
