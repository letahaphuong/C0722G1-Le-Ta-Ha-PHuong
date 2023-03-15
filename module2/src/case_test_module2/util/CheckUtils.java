package case_test_module2.util;


import java.time.LocalDate;
import java.time.Period;

public class CheckUtils {
    public static void checkName(String name) throws UserException {
        boolean check = name.matches("^([A-Z][a-z]+[ ])+([A-Z][a-z]+)$");
        if (!check) {
            throw new UserException("Format error,Enter again!");
        }
    }

    public static void checkMail(String mail) throws UserException {
        boolean check = mail.matches("^[\\w-.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
        if (!check) {
            throw new UserException("Format error,Enter again!");
        }
    }

    public static void checkPhone(String phone) throws UserException {
        boolean check = phone.matches("^0\\d{9,10}$");
        if (!check) {
            throw new UserException("Format error,Enter again!");
        }
    }

    public static void checkIDCard(String idCard) throws UserException {
        boolean check = idCard.matches("^\\d{9}$");
        if (!check) {
            throw new UserException("Format error,Enter again!");
        }
    }

    public static void checkIdStaff(String idStaff) throws UserException {
        boolean check = idStaff.matches("^ST-\\d{4}$");
        if (!check) {
            throw new UserException("Format error,Enter again!");
        }
    }
    public static void checkIdCustomer(String idCustomer) throws UserException {
        boolean check = idCustomer.matches("^CT-\\d{4}$");
        if (!check) {
            throw new UserException("Format error,Enter again!");
        }
    }

    public static void checkGender(String gender) throws UserException {
        boolean check = gender.matches("^male|female|other$");
        if (!check){
            throw new UserException("Format error,Enter again!");
        }
    }

    public static void checkLevel(String level) throws UserException {
        boolean check = level.matches("^University|College|Intermediate$");
        if (!check) {
            throw new UserException("Format error,Enter again!");
        }
    }
    public static void checkPosition(String position) throws UserException {
        boolean check= position.matches("^Receptionist|Waiter|Specialist|Supervisor|Manager|Director$");
        if (!check){
            throw new UserException("Format error,Enter again!");
        }
    }
    public static void checkAddress(String address) throws UserException {
        boolean check=address.matches("^([\\w/]+[ ]?)*([A-Z][a-z]+\\s)+([A-z][a-z]+)$");
        if (!check){
            throw new UserException("Format error,Enter again!");
        }
    }
    public static void checkTypeGuest(String typeGuest) throws UserException {
        boolean check= typeGuest.matches("^Diamond|Platinium|Gold|Silver|Member$");
        if (!check){
            throw new UserException("Format error,Enter again!");
        }
    }
    public static void checkStandard(String standard) throws UserException {
        boolean check=standard.matches("^Standard|Superior|Deluxe|Suite$");
        if (!check){
            throw new UserException("Format Error,Enter Again!");
        }
    }
    public static void checkIdFacility(String faciliti) throws UserException {
        boolean check = faciliti.matches("^((SVVL)|(SVHO)|(SVRO))-[0-9]{4}$");
        if (!check){
            throw new UserException("Format Error,Enter Again!");
        }
    }
    public static void checkBirthEmployee(LocalDate inputBirth) throws UserException {
        LocalDate localDate=LocalDate.now();
        Period period = Period.between(inputBirth, localDate);
        boolean check=period.getYears()>=18;
        if (!check){
            throw new UserException("Employee Is Not Enough Old,Pls Try Again");
        }
    }
    public static void checkBirthCustomer(LocalDate inputBirth) throws UserException {
        LocalDate localDate=LocalDate.now();
        Period period = Period.between(inputBirth, localDate);
        boolean check=period.getYears()<=100;
        if (!check){
            throw new UserException("Employee Is Not Enough Old,Pls Try Again");
        }
    }
    public static void checkFreeService(String freeService) throws UserException {
        boolean check = freeService.matches("^Beer|Whisky|Drink|Juice|Water|Coffee$");
        if (!check){
            throw new UserException("Format Error,Enter Again!");
        }
    }
    public static void checkIdBooking(String idBooking) throws UserException {
        boolean check= idBooking.matches("^BK-\\d{4}$");
        if (!check){
            throw new UserException("Format Error,Enter Again!");
        }
    }
    public static void checkServiceType(String serviceType) throws UserException {
        boolean check=serviceType.matches("^3[ ]Stars|4[ ]Stars|5[ ]Stars");
        if (!check){
            throw new UserException("Format Error,Enter Again!");
        }
    }
}
