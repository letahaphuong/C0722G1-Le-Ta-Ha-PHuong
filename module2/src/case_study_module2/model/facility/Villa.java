package case_study_module2.model.facility;

public class Villa extends Facility{
    private String roomStandard;
    private double swimmingPoolArea;
    private int numberFloors;

    public Villa() {
    }

    public Villa(String roomStandard, double swimmingPoolArea, int numberFloors) {
        this.roomStandard = roomStandard;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberFloors = numberFloors;
    }

    public Villa(String id, String serviceName, double usableArea, double rentalCost, int maxPerson, String rentalType, String roomStandard, double swimmingPoolArea, int numberFloors) {
        super(id, serviceName, usableArea, rentalCost, maxPerson, rentalType);
        this.roomStandard = roomStandard;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberFloors = numberFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(double swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
    }

    public int getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }

    @Override
    public String toString() {
        return "Villa ={" +super.toString()+
                "| Room Standard='" + roomStandard + '\'' +
                "| Swimming PoolArea=" + swimmingPoolArea +"(m2)"+
                "| Number Floors=" + numberFloors +
                '}';
    }
    public String getInfo(Villa villa){
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s",getId(),getServiceName(),
                getUsableArea(),getRentalCost(),getMaxPerson(),getRentalType(),getRoomStandard(),
                getSwimmingPoolArea(),getNumberFloors());
    }

}
