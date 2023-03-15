package ss1_Introduction_to_Java.exercise;

import java.util.Scanner;

public class Money_conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int RATE = 23000;
        System.out.print("Enter USD: ");
        int usd = sc.nextInt();
        int vnd = usd * RATE;
        System.out.print("Money conversion = " + vnd);
    }
}
