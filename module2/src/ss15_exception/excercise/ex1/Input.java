package ss15_exception.excercise.ex1;

import java.util.Scanner;

public class Input {
    private static Triangle triangle = new Triangle();
    private static Scanner scanner = new Scanner(System.in);
    private static int i = 1;

    public static double inputSide() {
        double side;
        while (true) {
            try {
                System.out.println("Nhập cạnh  " + i + " : ");
                side = Double.parseDouble(scanner.nextLine());
                triangle.check(side);
                i++;
                return side;

            } catch (IllegalTriangleException | NumberFormatException e) {
                System.out.println(e.getMessage());
                System.out.println();
            }

        }
    }
}
