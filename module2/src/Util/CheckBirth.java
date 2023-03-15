package Util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CheckBirth {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String str;//bắt người dùng nhập vào đúng định dạng.
        do {
            System.out.println("Nhập vào ngày tháng năm sinh: ");
            str = scanner.nextLine();
        } while (!isValid(str));
        //Năm đã đúng định dạng.
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        //convert string to local date
        LocalDate birthDay = LocalDate.parse(str, dateTimeFormatter);
        LocalDate nowSub18 = LocalDate.now().minusYears(18);
        if (birthDay.compareTo(nowSub18) > 0) {
            System.out.println("Bạn đã đủ tuổi!");
        } else {
            System.out.println("Bạn chưa đủ tuổi!");
        }
    }

    public static boolean isValid(String target) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        simpleDateFormat.setLenient(false);//bắt được năm nhuận
        try {
            simpleDateFormat.parse(target);
            return true;
        } catch (ParseException e) {
            System.out.println("Năm ko nhuận nên tháng 2 có 28 ngày");
        }
        return false;
    }
}
