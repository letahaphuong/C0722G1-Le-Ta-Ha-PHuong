package ss1_Introduction_to_Java.practice;

import java.util.Scanner;

public class Day_of_month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Which month that you want to count days?");
        int month = sc.nextInt();

//        switch (month) {
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 8:
//            case 12:
//                System.out.print(month + " Là tháng có 31 ngày!");
//                break;
//            case 2:
//                System.out.print(month + " Là tháng có 28 hoặc 29 ngày!");
//                break;
//            case 4:
//            case 6:
//            case 9:
//            case 10:
//            case 11:
//                System.out.print(month + " Là tháng có 30 ngày!");
//                break;
//        }
        String daysInMonth;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 12:
                daysInMonth = "31";
                break;
            case 2:
                daysInMonth = "28 or 29";
                break;
            case 4:
            case 6:
            case 9:
            case 10:
            case 11:
                daysInMonth = "30";
                break;
            default:
                daysInMonth = " ";

        }
        if (!daysInMonth.equals("")) {
            System.out.printf("The month '%d' has %s days!", month, daysInMonth);
        }else {
            System.out.printf("Invalid input!");
        }
    }
}
