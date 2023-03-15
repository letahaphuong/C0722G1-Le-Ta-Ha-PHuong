package case_study_module2.util;

public class CheckControllerUtils {
    public static void heckSwitchCase(String customer) throws NumberException {
        boolean check=customer.matches("^[0-4]$");
        if (!check){
            throw new NumberException("Error Format,Try Again!");
        }
    }
}
