package ss1_Introduction_to_Java.practice;

import java.util.Scanner;

public class Leap_year_caculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        boolean leapYear = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leapYear = true;
                }
            } else {
                leapYear = true;
            }
        }
        if (leapYear) {
            System.out.print("This year is a leap year;");
        } else {
            System.out.print("This year is a not leap year");
        }
    }
}
