package ss10_collection_framework_1.excercise.ex3_from_mr_haitt_1.tempalte.service.impl.C;

import ss10_collection_framework_1.excercise.ex3_from_mr_haitt_1.tempalte.controller.A.FindTransportController;
import ss10_collection_framework_1.excercise.ex3_from_mr_haitt_1.tempalte.controller.A.TransportController;
import ss10_collection_framework_1.excercise.ex3_from_mr_haitt_1.tempalte.model.Motorcycle;
import ss10_collection_framework_1.excercise.ex3_from_mr_haitt_1.tempalte.service.impl.IMotorcycleService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MotorcycleService implements IMotorcycleService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Motorcycle> motorcycleList = new ArrayList<>();

    @Override
    public void addNewMotorcycle() {
        Motorcycle motorcycle = this.infoMotorcycle();
        motorcycleList.add(motorcycle);
        System.out.println("Thêm thành công!");

    }

    public Motorcycle infoMotorcycle() {
        System.out.println("Nhập biển kiểm soát: ");
        String licensePlates = scanner.nextLine();
        System.out.println("Nhập tên hảng sản xuất: ");
        String production = scanner.nextLine();
        System.out.println("Nhập tên năm sản xuất: ");
        String productiveYears = scanner.nextLine();
        System.out.println("Nhập chủ sở hữu: ");
        String proprietor = scanner.nextLine();
        System.out.println("Nhập công suất: ");
        String power = scanner.nextLine();
        Motorcycle motorcycle = new Motorcycle(licensePlates, production, productiveYears, proprietor, power);
        return motorcycle;
    }

    @Override
    public void displayAllMotorcycle() {
        for (Motorcycle motorcycle : motorcycleList){
            System.out.println(motorcycle);
        }

    }

    @Override
    public void removeMotorcycle() {
//        System.out.println("Nhập biển kiểm soát bạn muốn xoá: ");
//        String licensePlates=scanner.nextLine();
//        boolean fagDelete=false;
//        for (int i = 0; i < motorcycleList.size(); i++) {
//            if (motorcycleList.get(i).getLicensePlates().equals(licensePlates)){
//                System.out.println("Bạn có chắn chắn muốn xoá? Nhập" +
//                        "Y => Yes" +
//                        "N => No");
//                String choice=scanner.nextLine();
//                if (choice.equals("Y")){
//                    motorcycleList.remove(i);
//                    System.out.println("Xoá thành công!");
//                }
//                fagDelete=true;
//                break;
//
//            }
//        }
//        if (!fagDelete){
//            TransportController.menuTransport();
//        }
    }

    @Override
    public void findLicensePlatesMotorcycle() {

    }

    @Override
    public void licensePlates() {

    }


}
