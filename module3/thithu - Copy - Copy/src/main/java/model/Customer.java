package model;

public class Customer {
    private int id;
    private String name;
    private String phoneNumber;
    private String startDate;
    private int rentTypeId;
    private int rentId;
    private String renName;
    private String note;

    public Customer() {
    }

    public Customer(int id, String name, String phoneNumber, String startDate, int rentTypeId, int rentId, String renName, String note) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.startDate = startDate;
        this.rentTypeId = rentTypeId;
        this.rentId = rentId;
        this.renName = renName;
        this.note = note;
    }

    public Customer(String name, String phoneNumber, String startDate, int rentTypeId, String note) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.startDate = startDate;
        this.rentTypeId = rentTypeId;
        this.note = note;
    }

    public Customer(int id, String name, String phoneNumber, String startDate, int rentTypeId, String note) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.startDate = startDate;
        this.rentTypeId = rentTypeId;
        this.note = note;
    }

    public Customer(String name, String phoneNumber, String startDate, int rentTypeId, String note, int id) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.startDate = startDate;
        this.rentTypeId = rentTypeId;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public int getRentTypeId() {
        return rentTypeId;
    }

    public void setRentTypeId(int rentTypeId) {
        this.rentTypeId = rentTypeId;
    }

    public int getRentId() {
        return rentId;
    }

    public void setRentId(int rentId) {
        this.rentId = rentId;
    }

    public String getRenName() {
        return renName;
    }

    public void setRenName(String renName) {
        this.renName = renName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
