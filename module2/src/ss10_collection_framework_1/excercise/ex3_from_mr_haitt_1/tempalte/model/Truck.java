package ss10_collection_framework_1.excercise.ex3_from_mr_haitt_1.tempalte.model;

public class Truck extends Transport {
    private int load;

    public Truck(int load) {
        this.load = load;
    }

    public Truck(String licensePlates, String production, String productiveYears, String proprietor, int load) {
        super(licensePlates, production, productiveYears, proprietor);
        this.load = load;
    }

    public Truck(String licensePlates, String production, String productiveYears, String proprietor, String load) {

    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    @Override
    public String toString() {
        return "Truck{" +
                " Tên biển kiểm soát: " +
                getLicensePlates()+
                ", Tên hãng sản xuất: " +
                getProduction()+
                ", Năm sản xuất: " +
                getProductiveYears()+
                ", Chủ sở hữu: " +
                getProprietor()+
                ", Tải trọng: " + getLoad() +
                '}';
    }
}
