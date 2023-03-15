package ss2_loop_in_JAVA.excercise;

import java.util.Scanner;

public class First_20_primes {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố cần in ra: ");
        number = Integer.parseInt(sc.nextLine());
        int num = 2;
        int countPrimes = 0;
        while (countPrimes < number) {
            int count = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(","+num);
                countPrimes++;
            }
            num++;
        }
    }
}
