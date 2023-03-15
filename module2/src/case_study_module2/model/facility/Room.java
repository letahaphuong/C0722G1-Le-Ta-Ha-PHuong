package case_study_module2.model.facility;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String id, String serviceName, double usableArea, double rentalCost, int maxPerson, String rentalType, String freeService) {
        super(id, serviceName, usableArea, rentalCost, maxPerson, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room ={" +
                super.toString() +
                "| Free Service='" + freeService + '\'' +
                '}';
    }

    public String getInfoRoom(Room room) {
        return String.format("%s,%s,%s,%s,%s,%s,%s", getId(), getServiceName(),
                getUsableArea(), getRentalCost(), getMaxPerson(), getRentalType(), getFreeService());
    }


}
