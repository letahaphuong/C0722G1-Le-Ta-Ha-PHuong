package ss10_collection_framework_1.excercise.ex3_from_mr_haitt_1.tempalte.controller.A;

import ss10_collection_framework_1.excercise.ex3_from_mr_haitt_1.tempalte.service.impl.C.CarService;
import ss10_collection_framework_1.excercise.ex3_from_mr_haitt_1.tempalte.service.impl.C.MotorcycleService;
import ss10_collection_framework_1.excercise.ex3_from_mr_haitt_1.tempalte.service.impl.C.TruckService;
import ss10_collection_framework_1.excercise.ex3_from_mr_haitt_1.tempalte.service.impl.ICarService;
import ss10_collection_framework_1.excercise.ex3_from_mr_haitt_1.tempalte.service.impl.IMotorcycleService;
import ss10_collection_framework_1.excercise.ex3_from_mr_haitt_1.tempalte.service.impl.ITruckService;

import java.util.Scanner;

public class AddTransportController {
    private static Scanner scanner=new Scanner(System.in);
    private static ICarService iCarService=new CarService();
    private static ITruckService iTruckService=new TruckService();
    private static IMotorcycleService iMotorcycleService=new MotorcycleService();

    public static void menuAddTransport(){
        System.out.println("Thêm mới phương tiện.");
        System.out.println("\t 1. Thêm xe oto");
        System.out.println("\t 2. Thêm xe tải");
        System.out.println("\t 3. Thêm xe máy");
        System.out.println("\t 4. Trở lại menu");
        System.out.println("\t 0. Thoát chương trình ");
        int choice=Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                iCarService.addNewCar();
                break;
            case 2:
                iTruckService.addTruck();
                break;
            case 3:
                iMotorcycleService.addNewMotorcycle();
                break;
            case 4:
                return;
            case 0:
                System.exit(0);
        }
    }
}
