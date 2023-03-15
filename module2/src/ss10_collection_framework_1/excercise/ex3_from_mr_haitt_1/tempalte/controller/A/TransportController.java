package ss10_collection_framework_1.excercise.ex3_from_mr_haitt_1.tempalte.controller.A;

//import ss10_collection_framework_1.excercise.ex3_from_mr_haitt_1.tempalte.controller.A.MotorcycleController;
//import ss10_collection_framework_1.excercise.ex3_from_mr_haitt_1.tempalte.service.impl.*;
//import ss10_collection_framework_1.excercise.ex3_from_mr_haitt_1.tempalte.service.impl.C.CarService;
//import ss10_collection_framework_1.excercise.ex3_from_mr_haitt_1.tempalte.service.impl.C.MotorcycleService;
//import ss10_collection_framework_1.excercise.ex3_from_mr_haitt_1.tempalte.service.impl.C.TruckService;

import ss10_collection_framework_1.excercise.ex3_from_mr_haitt_1.tempalte.service.impl.C.TransportService;

import java.util.Scanner;

public class TransportController {
    private static Scanner scanner = new Scanner(System.in);

    public static void menuTransport() {
        while (true) {
            System.out.println("***CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG***");
            System.out.println("Chọn chức năng: ");
            System.out.println("\t1. Thêm mới phương tiện.");
            System.out.println("\t2. Hiển thị phương tiện");
            System.out.println("\t3. Xoá phương tiện.");
            System.out.println("\t4. Tìn kiếm theo biển kiểm soát.");
            System.out.println("\t0. Thoát chương trình.");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    AddTransportController.menuAddTransport();
                    break;
                case 2:
                    DisplayTransportController.disPlayAllStransport();
                    break;
                case 3:
                    RemoveTransportController.removeTransport();
                    break;
                case 4:
                    FindTransportController.findTransport();
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }

    public void case1() {
        String choice = scanner.nextLine();

    }
}
