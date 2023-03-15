package case_study_module2.model.booking;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Booking implements Comparable<Booking> {
    private String idBooking;
    private LocalDate beginDay;
    private LocalDate endDay;
    private String idCustomer;
    private String serviceId;
    private String serviceType;

    public Booking(String idBooking, String idCustomer, LocalDate beginDay, LocalDate endDay, String serviceId, String serviceType) {
        this.idBooking = idBooking;
        this.beginDay = beginDay;
        this.endDay = endDay;
        this.idCustomer = idCustomer;
        this.serviceId = serviceId;
        this.serviceType = serviceType;
    }

    public Booking() {
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public LocalDate getBeginDay() {
        return beginDay;
    }

    public void setBeginDay(LocalDate beginDay) {
        this.beginDay = beginDay;
    }

    public LocalDate getEndDay() {
        return endDay;
    }

    public void setEndDay(LocalDate endDay) {
        this.endDay = endDay;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking='" + idBooking + '\'' +
                ", beginDay=" + beginDay +
                ", endDay=" + endDay +
                ", idCustomer='" + idCustomer + '\'' +
                ", serviceId='" + serviceId + '\'' +
                ", serviceType='" + serviceType + '\'' +
                '}';
    }

    public String getInfoBooking(Booking booking) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String beginDay = getBeginDay().format(dateTimeFormatter);
        String endDay = getEndDay().format(dateTimeFormatter);
        return String.format("%s,%s,%s,%s,%s,%s", getIdBooking(), getIdCustomer(), beginDay, endDay, getServiceId(), getServiceType());
    }

    @Override
    public int compareTo(Booking o) {
        if (this.getBeginDay().compareTo(o.getBeginDay()) != 0) {
            return this.getBeginDay().compareTo(o.getBeginDay());
        }
        return this.getEndDay().compareTo(o.getEndDay());
    }
}

