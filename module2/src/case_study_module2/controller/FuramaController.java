package case_study_module2.controller;

import case_study_module2.util.NumberException;

import java.io.IOException;
import java.util.Scanner;

public class FuramaController {
    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeController employeeController = new EmployeeController();
    private static CustomerController customerController = new CustomerController();
    private static FacilityController facilityController = new FacilityController();
    private static BookingController bookingController = new BookingController();
    private static PromotionController promotionController = new PromotionController();

    public static void displayMainMenu() throws IOException, NumberException {
        while (true) {
            System.out.println("Welcome to FURAMA RESORT");
            System.out.println("Please select option: ");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management ");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            String choice =scanner.nextLine();
            switch (choice) {
                case "1":
                    employeeController.menuEmployee();
                    break;
                case "2":
                    customerController.menuCustomer();
                    break;
                case "3":
                    facilityController.menuFacility();
                    break;
                case "4":
                    bookingController.menuBooking();
                    break;
                case "5":
                    promotionController.menuPromotion();
                    break;
                case "6":
                    System.exit(0);
                default:
                    System.out.println("Format Error,Pls Try Again!");
            }
        }

    }

}
