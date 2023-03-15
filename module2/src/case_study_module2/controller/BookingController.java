package case_study_module2.controller;

import case_study_module2.model.facility.Facility;
import case_study_module2.model.facility.House;
import case_study_module2.model.facility.Room;
import case_study_module2.model.facility.Villa;
import case_study_module2.service.IBookingService;
import case_study_module2.service.ICustomerService;
import case_study_module2.service.i_faciliti_service.IHouseService;
import case_study_module2.service.i_faciliti_service.IRoomService;
import case_study_module2.service.i_faciliti_service.IVillaService;
import case_study_module2.service.impl.BookingService;
import case_study_module2.service.impl.CustomerService;
import case_study_module2.service.impl.faciliti_service.HouseService;
import case_study_module2.service.impl.faciliti_service.RoomService;
import case_study_module2.service.impl.faciliti_service.VillaService;
import case_study_module2.util.NumberException;

import java.io.IOException;
import java.util.Scanner;

public class BookingController {
    private static Scanner scanner = new Scanner(System.in);
    private static IBookingService iBookingService = new BookingService();
    public static void menuBooking() throws IOException, NumberException {
        while (true) {
            System.out.println("Welcome to Booking Management");
            System.out.println("Please select option: ");
            System.out.println("1. Add new booking");
            System.out.println("2. Display list booking");
            System.out.println("3. Create new contracts");
            System.out.println("4. Display list contracts");
            System.out.println("5. Edit contracts");
            System.out.println("6. Return main menu");
            System.out.println("7. Exit");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iBookingService.add();
                    break;
                case 2:
                    iBookingService.display();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    return;
                case 7:
                    System.exit(0);

            }
        }

    }
}
