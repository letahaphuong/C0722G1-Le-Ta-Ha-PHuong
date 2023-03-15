package case_study_module2.model.facility;

public abstract class Facility {
    private String id;
    private String serviceName;
    private double usableArea;
    private double rentalCost;
    private int maxPerson;
    private String rentalType; //Theo năm ,theo tháng,theo ngày.

    public Facility() {
    }

    public Facility(String id, String serviceName, double usableArea, double rentalCost, int maxPerson, String rentalType) {
        this.id = id;
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCost = rentalCost;
        this.maxPerson = maxPerson;
        this.rentalType = rentalType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public double getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(double rentalCost) {
        this.rentalCost = rentalCost;
    }

    public int getMaxPerson() {
        return maxPerson;
    }

    public void setMaxPerson(int maxPerson) {
        this.maxPerson = maxPerson;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "ID ='" + id + '\'' +
                "| Service Name='" + serviceName + '\'' +
                "| Usable Area=" + usableArea +"(m2)"+
                "| Rental Cost=" + rentalCost +"($)"+
                "| Max Person=" + maxPerson +"(per)"+
                "| Rental Type=" + rentalType;
    }
}
