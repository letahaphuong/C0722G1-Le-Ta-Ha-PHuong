package ss15_exception.pracitice.pra3;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập x: ");
        int x = scanner.nextInt();
        System.out.println("Nhập y: ");
        int y = scanner.nextInt();
        CalculationExample cal = new CalculationExample();
        cal.calculate(x, y);
    }

    private void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Cộng :"+ a);
            System.out.println("Trừ :"+ b);
            System.out.println("Nhân :"+ c);
            System.out.println("Chia :"+ d);
        } catch (Exception e) {
            System.err.println("Xảy ra ngoại lệ: " + e.getMessage());
        }
    }
}
