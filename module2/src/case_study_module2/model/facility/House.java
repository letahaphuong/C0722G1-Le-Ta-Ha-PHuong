package case_study_module2.model.facility;

public class House extends Facility {
    private String roomStandard;
    private int numberFloors;

    public House() {

    }

    public House(String roomStandard, int numberFloors) {
        this.roomStandard = roomStandard;
        this.numberFloors = numberFloors;
    }

    public House(String id, String serviceName, double usableArea, double rentalCost, int maxPerson, String rentalType, String roomStandard, int numberFloors) {
        super(id, serviceName, usableArea, rentalCost, maxPerson, rentalType);
        this.roomStandard = roomStandard;
        this.numberFloors = numberFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }

    @Override
    public String toString() {
        return "House ={" + super.toString() +
                "| Room Standard='" + roomStandard + '\'' +
                "| Number Floors=" + numberFloors +
                '}';
    }

    public String getInfo(House house) {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s", getId(), getServiceName(), getUsableArea(),
                getRentalCost(), getMaxPerson(), getRentalType(), getRoomStandard(), getNumberFloors());
    }


}
