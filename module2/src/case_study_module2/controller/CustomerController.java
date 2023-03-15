package case_study_module2.controller;

import case_study_module2.service.ICustomerService;
import case_study_module2.service.impl.CustomerService;
import case_study_module2.util.NumberException;

import java.io.IOException;
import java.util.Scanner;

public class CustomerController {
    private static Scanner scanner = new Scanner(System.in);
    private static ICustomerService iCustomerService = new CustomerService();

    public static void menuCustomer() throws IOException, NumberException {
        while (true) {
            System.out.println("Welcome to Customer Management");
            System.out.println("Please select option: ");
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Return menu");
            System.out.println("5. Exit");
            String choice =scanner.nextLine();
            switch (choice) {
                case "1":
                    iCustomerService.display();
                    break;
                case "2":
                    iCustomerService.add();
                    break;
                case "3":
                    iCustomerService.editCustomer();
                    break;
                case "4":
                    return;
                case "0":
                    System.exit(0);
                default:
                    System.out.println("Format Error, Pls Try Again!");
            }
        }

    }
}
