package ss2_loop_in_JAVA.excercise;

import java.util.Scanner;

public class Show_drawing {
    public static void main(String[] args) {
        int width, height;
        int choice = -1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Drawing rectangle");
        System.out.println("2. Drawing right triangle(bottom-left + bottom-right + top-left + top-right )");
        System.out.println("3. Drawing isosceles triangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        choice = sc.nextInt();
        String text = "";
        switch (choice) {
            case 1:
                System.out.println("Enter width: ");
                width = Integer.parseInt(sc.nextLine());
                System.out.println("Enter height: ");
                height = Integer.parseInt(sc.nextLine());


                for (int i = 0; i < width; i++) {
                    for (int j = 0; j < height; j++) {
                        text += "*";
                    }
                    text += "\n";
                }
                System.out.println(text);
                break;
            case 2:
                System.out.println("Enter height2: ");
                height = Integer.parseInt(sc.nextLine());
                for (int i = 1; i <= height; i++) {
                    for (int j = 1; j <= i; j++) {
                        text += "*";
                    }
                    text += "\n";
                }
                System.out.println();
                for (int i = 1; i <= height; i++) {
                    for (int j = height; j >= i; j--) {
                        text += "*";
                    }
                    text += "\n";
                }
                System.out.println();
                for (int i = 1; i <= height; i++) {
                    for (int j = 1; j <= i; j++) {
                        text += " ";
                    }
                    for (int j = height; j >= i; j--) {
                        text += "*";
                    }
                    text += "\n";
                }
                System.out.println();
                for (int i = 1; i <= height; i++) {
                    for (int j = height; j >= i; j--) {
                        text += " ";
                    }
                    for (int j = 1; j <= i; j++) {
                        text += "*";
                    }
                    text += "\n";
                }
                System.out.println(text);
                break;
            case 3:
                System.out.println("Enter height3: ");
                height = Integer.parseInt(sc.nextLine());
                for (int i = 1; i <= height; i++) {
                    for (int j = height; j >= i; j--) {
                        text += " ";
                    }
                    for (int j = 1; j <= i * 2 - 1; j++) {
                        text += "*";
                    }
                    text += "\n";
                }
                System.out.println(text);
                break;
        }
    }
}
