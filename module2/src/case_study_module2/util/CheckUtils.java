package case_study_module2.util;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class CheckUtils {
    public static void checkName(String name) throws FormatException {
        boolean check = name.matches("^([A-Z][a-z]+[ ])+([A-Z][a-z]+)$");
        if (!check) {
            throw new FormatException("Format error,Enter again!");
        }
    }

    public static void checkMail(String mail) throws FormatException {
        boolean check = mail.matches("^[\\w-.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
        if (!check) {
            throw new FormatException("Format error,Enter again!");
        }
    }

    public static void checkPhone(String phone) throws FormatException {
        boolean check = phone.matches("^0\\d{9,10}$");
        if (!check) {
            throw new FormatException("Format error,Enter again!");
        }
    }

    public static void checkIDCard(String idCard) throws FormatException {
        boolean check = idCard.matches("^\\d{9}$");
        if (!check) {
            throw new FormatException("Format error,Enter again!");
        }
    }

    public static void checkIdStaff(String idStaff) throws FormatException {
        boolean check = idStaff.matches("^ST-\\d{4}$");
        if (!check) {
            throw new FormatException("Format error,Enter again!");
        }
    }
    public static void checkIdCustomer(String idCustomer) throws FormatException {
        boolean check = idCustomer.matches("^CT-\\d{4}$");
        if (!check) {
            throw new FormatException("Format error,Enter again!");
        }
    }

    public static void checkGender(String gender) throws FormatException {
        boolean check = gender.matches("^male|female|other$");
        if (!check){
            throw new FormatException("Format error,Enter again!");
        }
    }

    public static void checkLevel(String level) throws FormatException {
        boolean check = level.matches("^University|College|Intermediate$");
        if (!check) {
            throw new FormatException("Format error,Enter again!");
        }
    }
    public static void checkPosition(String position) throws FormatException {
        boolean check= position.matches("^Receptionist|Waiter|Specialist|Supervisor|Manager|Director$");
        if (!check){
            throw new FormatException("Format error,Enter again!");
        }
    }
    public static void checkAddress(String address) throws FormatException {
        boolean check=address.matches("^([\\w/]+[ ]?)*([A-Z][a-z]+\\s)+([A-z][a-z]+)$");
        if (!check){
            throw new FormatException("Format error,Enter again!");
        }
    }
    public static void checkTypeGuest(String typeGuest) throws FormatException {
        boolean check= typeGuest.matches("^Diamond|Platinium|Gold|Silver|Member$");
        if (!check){
            throw new FormatException("Format error,Enter again!");
        }
    }
    public static void checkStandard(String standard) throws FormatException {
        boolean check=standard.matches("^Standard|Superior|Deluxe|Suite$");
        if (!check){
            throw new FormatException("Format Error,Enter Again!");
        }
    }
    public static void checkIdFacility(String faciliti) throws FormatException {
        boolean check = faciliti.matches("^((SVVL)|(SVHO)|(SVRO))-[0-9]{4}$");
        if (!check){
            throw new FormatException("Format Error,Enter Again!");
        }
    }
    public static void checkBirthEmployee(LocalDate inputBirth) throws FormatException {
        LocalDate localDate=LocalDate.now();
        Period period = Period.between(inputBirth, localDate);
        boolean check=period.getYears()>=18;
        if (!check){
            throw new FormatException("Employee Is Not Enough Old,Pls Try Again");
        }
    }
    public static void checkBirthCustomer(LocalDate inputBirth) throws FormatException {
        LocalDate localDate=LocalDate.now();
        Period period = Period.between(inputBirth, localDate);
        boolean check=period.getYears()<=100;
        if (!check){
            throw new FormatException("Employee Is Not Enough Old,Pls Try Again");
        }
    }
    public static void checkFreeService(String freeService) throws FormatException {
        boolean check = freeService.matches("^Beer|Whisky|Drink|Juice|Water|Coffee$");
        if (!check){
            throw new FormatException("Format Error,Enter Again!");
        }
    }
    public static void checkIdBooking(String idBooking) throws FormatException {
        boolean check= idBooking.matches("^BK-\\d{4}$");
        if (!check){
            throw new FormatException("Format Error,Enter Again!");
        }
    }
    public static void checkServiceType(String serviceType) throws FormatException {
        boolean check=serviceType.matches("^3[ ]Stars|4[ ]Stars|5[ ]Stars");
        if (!check){
            throw new FormatException("Format Error,Enter Again!");
        }
    }
}
