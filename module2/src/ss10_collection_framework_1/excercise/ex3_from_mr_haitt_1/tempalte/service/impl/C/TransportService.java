package ss10_collection_framework_1.excercise.ex3_from_mr_haitt_1.tempalte.service.impl.C;

import ss10_collection_framework_1.excercise.ex3_from_mr_haitt_1.tempalte.controller.A.TransportController;
import ss10_collection_framework_1.excercise.ex3_from_mr_haitt_1.tempalte.model.Car;
import ss10_collection_framework_1.excercise.ex3_from_mr_haitt_1.tempalte.model.Transport;
import ss10_collection_framework_1.excercise.ex3_from_mr_haitt_1.tempalte.service.impl.ITransportService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TransportService implements ITransportService {
    private static List<Transport> transportList=new ArrayList<>();
    private static Scanner scanner=new Scanner(System.in);
    private static CarService carService = new CarService();
    private static TruckService truckService=new TruckService();
    private static MotorcycleService motorcycleService=new MotorcycleService();
    @Override
    public void addTransport() {
        Transport transport=carService.infoCar();
        transportList.add(transport);
        Transport transport1=truckService.infoTruck();
        transportList.add(transport1);
        Transport transport2=motorcycleService.infoMotorcycle();
        transportList.add(transport2);

    }

    @Override
    public void displayTransport() {
        for (Transport transport:transportList){
            System.out.println("mảng của bạn là");
            System.out.println(transport.toString());
        }
    }

    @Override
    public void removeTransport() {
        System.out.println("Nhập biển kiểm soát bạn cần xoá: ");
        String licensePlates=scanner.nextLine();
        boolean flagDelete=false;
        for (int i = 0; i < transportList.size(); i++) {
            if (transportList.get(i).getLicensePlates().equals(licensePlates)){
                System.out.println("Bạn có chắc chắn muốn xoá? Nhập" +
                        "Y => Xoá" +
                        "N => Không");
                String choice=scanner.nextLine();
                if (choice.equals("Y")) {
                    transportList.remove(i);
                    System.out.println("Xoá thành công!");
                }
                flagDelete=true;
                break;
            }
        }
        if (!flagDelete){
            TransportController.menuTransport();
        }
    }


    @Override
    public void findTransport() {
        System.out.println("Nhập biển kiểm soát bạn cần tìm: ");
        String licensePlates=scanner.nextLine();
        for (int i = 0; i < transportList.size(); i++) {
            if (transportList.get(i).getLicensePlates().contains(licensePlates)){
                System.out.println(transportList.get(i));
            }
        }
    }

}
