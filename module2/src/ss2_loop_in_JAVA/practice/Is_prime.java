package ss2_loop_in_JAVA.practice;

import java.util.Scanner;

public class Is_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        if (number < 2) {
            System.out.println(number + " Is not a prime!");
        } else {
            int i = 2;
            boolean check = true;
            while (i < number) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(number + ": Is a prime!");
            } else {
                System.out.println(number + ": Is not a prime!");
            }
        }

    }
}
