package ss17_io_serialization_file_binary.excersice.ex1.model;

public class ProductManagement {
    private  int id;
    private  String name;
    private  String production;
    private  int price;
    private  String note;

    public ProductManagement() {
    }

    public ProductManagement(int id, String name, String production, int price, String note) {
        this.id = id;
        this.name = name;
        this.production = production;
        this.price = price;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "ProductManagement{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", production='" + production + '\'' +
                ", price=" + price +
                ", note='" + note + '\'' +
                '}';
    }
    public String getInfor(){
        return String.format("%s,%s,%s,%s,%s",getId(),getName(),getProduction(),getPrice(),getNote());
    }
}
