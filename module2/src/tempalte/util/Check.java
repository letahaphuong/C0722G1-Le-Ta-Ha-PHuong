package tempalte.util;

public class Check {
    public static void checkName(String name) throws FormatException {
        boolean check=name.matches("\"^([A-Z][a-z]+[ ])+([A-Z][a-z]+)$\"");
        if (!check){
            throw new FormatException("Sai dạnh dạng ,vui lòng nhập lại!");
        }
    }
    public static void checkMail(String mail) throws FormatException {
        boolean check =mail.matches("^[\\w-.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
        if (!check){
            throw new FormatException("Sai định dạng ,vui lòng nhập lại!");
        }
    }
    public static void checkPhone(String phone) throws FormatException {
        boolean check=phone.matches("^0\\d{9,10}$");
        if (!check){
            throw new FormatException("Sai định dạng ,vui lòng nhập lại!");
        }
    }
    
}
