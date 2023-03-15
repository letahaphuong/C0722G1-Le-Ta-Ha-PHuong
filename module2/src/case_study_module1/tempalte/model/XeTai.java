package case_study_module1.tempalte.model;

public class XeTai extends Xe implements Comparable<XeTai> {
    private String trongTai;

    public XeTai(String trongTai) {
        this.trongTai = trongTai;
    }

    public XeTai(String bienSoxe, String tenHangSanXuat, int namSanXuat, String chuSoHuu, String trongTai) {
        super(bienSoxe, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }

    public String getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(String trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return "xeTai{" +
                ", Biển kiểm soát: " + getBienSoxe() +
                ", Tên hảng sản xuất: " + getTenHangSanXuat() +
                ", Năm sản xuất: " + getNamSanXuat() +
                ", Chủ sở hữu: " + getChuSoHuu() +
                ", Trọng tải: " + trongTai + '\'' +
                '}';
    }

    @Override
    public int compareTo(XeTai o) {
        if (this.getChuSoHuu().compareTo(o.getChuSoHuu())!=0){
            return this.getChuSoHuu().compareTo(o.getChuSoHuu());
        }
        return this.getTenHangSanXuat().compareTo(o.getTenHangSanXuat());
    }
}
