package ss10_collection_framework_1.excercise.ex3_from_mr_haitt_1.tempalte.service.impl.C;

import ss10_collection_framework_1.excercise.ex3_from_mr_haitt_1.tempalte.controller.A.FindTransportController;
import ss10_collection_framework_1.excercise.ex3_from_mr_haitt_1.tempalte.controller.A.TransportController;
import ss10_collection_framework_1.excercise.ex3_from_mr_haitt_1.tempalte.model.Truck;
import ss10_collection_framework_1.excercise.ex3_from_mr_haitt_1.tempalte.service.impl.ITruckService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TruckService implements ITruckService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Truck> truckList = new ArrayList<>();

    @Override
    public void addTruck() {
        Truck truck = this.infoTruck();
        truckList.add(truck);
        System.out.println("Thêm thành công!");

    }

    public Truck infoTruck() {
        System.out.println("Nhập biển kiểm soát: ");
        String licensePlates = scanner.nextLine();
        System.out.println("Nhập tên hảng sản xuất: ");
        String production = scanner.nextLine();
        System.out.println("Nhập năm sản xuất: ");
        String productiveYears = scanner.nextLine();
        System.out.println("Nhập chủ sở hữu: ");
        String proprietor = scanner.nextLine();
        System.out.println("Nhập tải trọng: ");
        String load = scanner.nextLine();
        Truck truck = new Truck(licensePlates, production, productiveYears, proprietor, load);
        return truck;

    }

    @Override
    public void displayAllTruck() {
        for (Truck truck:truckList){
            System.out.println(truck);
        }

    }

    @Override
    public void removeTruck() {
//        System.out.println("Nhập biển kiểm soát: ");
//        String licensePlates=scanner.nextLine();
//        boolean flagDelete =false;
//        for (int i = 0; i < truckList.size(); i++) {
//            if (truckList.get(i).getLicensePlates().equals(licensePlates)){
//                System.out.println("Bạn chắc chắn xoá? Nhập" +
//                        "Y => Yes" +
//                        "N => No");
//                String choice =scanner.nextLine();
//                if (choice.equals("Y")){
//                    truckList.remove(i);
//                    System.out.println("Xoá thành công!");
//                }
//                flagDelete=true;
//                break;
//            }
//        }
//        if (!flagDelete){
//            TransportController.menuTransport();
//        }
    }

    @Override
    public void findLicensePlatesTruck() {

    }

    @Override
    public void licensePlates() {

    }
}
