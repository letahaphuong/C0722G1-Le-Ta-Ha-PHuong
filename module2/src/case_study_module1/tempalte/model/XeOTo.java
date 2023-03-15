package case_study_module1.tempalte.model;

public class XeOTo extends Xe implements Comparable<XeOTo>{
    private int soChoNgoi;
    private String kieuXe;//du lich,xe khach.

    public XeOTo(int soChoNgoi, String kieuXe) {
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    public XeOTo() {
    }

    public XeOTo(String bienSoXe, String tenHangSanXuat, int namSanXuat, String chuSoHuu, String kieuXe, int soChoNgoi) {
        super(bienSoXe, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    @Override
    public String toString() {
        return "XeOTo{" +
                ", Biển kiểm soát: "+ getBienSoxe()+
                ", Tên hãng sản xuất: "+getTenHangSanXuat()+
                ", Năm sản xuất: "+getNamSanXuat()+
                ", Chủ sở hữu: "+getChuSoHuu()+
                ", Kiểu xe: " + kieuXe +
                ", Số chổ ngồi: '" + soChoNgoi + '\'' +
                '}';
    }

    @Override
    public int compareTo(XeOTo o) {
        if (this.getChuSoHuu().compareTo(o.getChuSoHuu())!=0){
            return this.getChuSoHuu().compareTo(o.getChuSoHuu());
        }
        return this.getTenHangSanXuat().compareTo(o.getTenHangSanXuat());
    }
}
