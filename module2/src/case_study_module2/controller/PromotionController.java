package case_study_module2.controller;

import java.util.Scanner;

public class PromotionController {
    private static Scanner scanner = new Scanner(System.in);

    public static void menuPromotion() {
        while (true) {
            System.out.println("Welcome to Promotion Management");
            System.out.println("Please select option: ");
            System.out.println("1. Display list customers use service");
            System.out.println("2. Display list customers got voucher");
            System.out.println("3. Return main menu");
            System.out.println("4. Exit");
            String choice =scanner.nextLine();
            switch (choice) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    return;
                case "4":
                    System.exit(0);
                default:
                    System.out.println("Format Error,Pls Try Again!");
            }

        }

    }
}
