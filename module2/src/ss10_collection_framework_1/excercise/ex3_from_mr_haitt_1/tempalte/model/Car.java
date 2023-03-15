package ss10_collection_framework_1.excercise.ex3_from_mr_haitt_1.tempalte.model;

public class Car extends Transport{
    private int seat;
    private String vehicleType;

    public Car(int seat, String vehicleType) {
        this.seat = seat;
        this.vehicleType = vehicleType;
    }

    public Car(String licensePlates, String production, String productiveYears, String proprietor
            , int seat, String vehicleType) {
        super(licensePlates, production, productiveYears, proprietor);
        this.seat = seat;
        this.vehicleType = vehicleType;
    }



    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return "Car{" +
                " Tên biển kiểm soát: " +
                getLicensePlates()+
                ", Tên hãng sản xuất: " +
                getProduction()+
                ", Năm sản xuất: " +
                getProductiveYears()+
                ", Chủ sở hữu: " +
                getProprietor()+
                ", Số chổ ngồi: " + seat +
                ", Kiểu xe'" + vehicleType + '\'' +
                '}';
    }
}
