package ss16_io_text_file.excercise.excercise_from_mrHai.util;

public class Check {
    public static void checkName(String string) throws FormatException {
        boolean check = string.matches("^([A-Z][a-z]+[ ])+([A-Z][a-z]+)$");
        if (!check){
            throw new FormatException("Sai định dạng xin vui lòng nhập lại");
        }
    }
    public static void checkClassName(String className) throws FormatException {
        boolean check = className.matches("^CG\\d{2}$");
        if (!check){
            throw new FormatException("Sai định dạng xin vui lòng nhập lại");
        }
    }
}
