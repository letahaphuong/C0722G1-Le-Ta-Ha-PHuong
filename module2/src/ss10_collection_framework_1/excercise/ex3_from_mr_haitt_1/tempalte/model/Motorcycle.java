package ss10_collection_framework_1.excercise.ex3_from_mr_haitt_1.tempalte.model;

public class Motorcycle extends Transport {
    private String power;

    public Motorcycle(String power) {
        this.power = power;
    }

    public Motorcycle(String licensePlates, String production, String productiveYears, String proprietor, String power) {
        super(licensePlates, production, productiveYears, proprietor);
        this.power = power;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "MotorCycle{" +
                " Tên biển kiểm soát: " +
                getLicensePlates()+
                ", Tên hãng sản xuất: " +
                getProduction()+
                ", Năm sản xuất: " +
                getProductiveYears()+
                ", Chủ sở hữu: " +
                getProprietor()+
                ", Công suất: " + getPower() +
                '}';
    }
}
