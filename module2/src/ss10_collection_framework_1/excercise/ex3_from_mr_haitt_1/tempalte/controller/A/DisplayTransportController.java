package ss10_collection_framework_1.excercise.ex3_from_mr_haitt_1.tempalte.controller.A;

import ss10_collection_framework_1.excercise.ex3_from_mr_haitt_1.tempalte.service.impl.C.CarService;
import ss10_collection_framework_1.excercise.ex3_from_mr_haitt_1.tempalte.service.impl.C.MotorcycleService;
import ss10_collection_framework_1.excercise.ex3_from_mr_haitt_1.tempalte.service.impl.C.TransportService;
import ss10_collection_framework_1.excercise.ex3_from_mr_haitt_1.tempalte.service.impl.C.TruckService;
import ss10_collection_framework_1.excercise.ex3_from_mr_haitt_1.tempalte.service.impl.ICarService;
import ss10_collection_framework_1.excercise.ex3_from_mr_haitt_1.tempalte.service.impl.IMotorcycleService;
import ss10_collection_framework_1.excercise.ex3_from_mr_haitt_1.tempalte.service.impl.ITransportService;
import ss10_collection_framework_1.excercise.ex3_from_mr_haitt_1.tempalte.service.impl.ITruckService;

import java.util.Scanner;

public class DisplayTransportController {
    private static Scanner scanner = new Scanner(System.in);
    private static ICarService iCarService = new CarService();
    private static ITruckService iTruckService = new TruckService();
    private static IMotorcycleService iMotorcycleService = new MotorcycleService();
    private static ITransportService iTransportService =new TransportService();

    public static void disPlayAllStransport() {
        System.out.println("Chọn phương tiện cần hiển thị phương tiện: ");
        System.out.println("\t 1. Hiển thị oto");
        System.out.println("\t 2. Hiển thị xe tải");
        System.out.println("\t 3. Hiển thị xe máy");
        System.out.println("\t 4. Hiển thị tất cả");
        System.out.println("\t 5. Trở về MENU chính");
        System.out.println("\t 0. Thoát");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                iCarService.displayAllCar();
                break;
            case 2:
                iTruckService.displayAllTruck();
                break;
            case 3:
                iMotorcycleService.displayAllMotorcycle();
                break;
            case 4:
                iTransportService.displayTransport();
                break;
            case 5:
                return;
            case 0:
                System.exit(0);

        }


    }
}
