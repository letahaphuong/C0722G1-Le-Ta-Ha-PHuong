package ss16_io_text_file.excercise.excercise_from_mrHai.util;

public class Util {
    public static void check(double a) {
        if (a > 10 || a < 0) {
            throw new NumberFormatException("Vui lòng nhập từ 0->10! :) ");
        }
    }

    public static void checkString(String name) throws CheckStringException {
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) < 32 || name.charAt(i) > 32 && name.charAt(i) < 65 || name.charAt(i) > 90 && name.charAt(i) < 97 || name.charAt(i) > 122) {
                throw new CheckStringException("Tên sai định dạng vui lòng nhập lại");
            }
            if (name.charAt(0) == 32) {
                throw new CheckStringException("Tên sai định dạng vui lòng nhập lại");
            }
        }
    }

    public static void checkBirth(String birthDay) throws CheckBirthDayException {
        for (int i = 0; i < birthDay.length(); i++) {
            if (birthDay.charAt(i) < 47 || birthDay.charAt(i) > 47 && birthDay.charAt(i) < 48 || birthDay.charAt(i) > 57) {
                throw new CheckBirthDayException("Sai định dạng vui lòng nhập theo dd/mm/yyyy !");
            }
        }
    }
    public static void checkID(String id) throws CheckIDException {
        for (int i = 0; i < id.length(); i++) {
            if(id.charAt(i)<48 || id.charAt(i)>57 && id.charAt(i)<65 || id.charAt(i)>90 && id.charAt(i)<97 || id.charAt(i)>122 ){
                throw new CheckIDException("Vui lòng Không được nhập kí tự đặc biệt!");
            }
        }
    }
}
