package ss2_loop_in_JAVA.practice;

import java.util.Scanner;

public class Greate_common_factor {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        a = sc.nextInt();
        System.out.println("Enter b number : ");
        b = sc.nextInt();
        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor!");
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("Greatest common factor : " + a);
    }
}
