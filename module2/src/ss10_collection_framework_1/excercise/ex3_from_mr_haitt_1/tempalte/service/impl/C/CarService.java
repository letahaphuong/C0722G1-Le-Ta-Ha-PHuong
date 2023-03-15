package ss10_collection_framework_1.excercise.ex3_from_mr_haitt_1.tempalte.service.impl.C;
import ss10_collection_framework_1.excercise.ex3_from_mr_haitt_1.tempalte.model.Car;
import ss10_collection_framework_1.excercise.ex3_from_mr_haitt_1.tempalte.service.impl.ICarService;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarService implements ICarService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Car> carList = new ArrayList<>();

    @Override
    public void addNewCar() {
        Car car = this.infoCar();
        carList.add(car);
        System.out.println("Thêm mảng thành công! ");
    }

    @Override
    public void displayAllCar() {
        for (Car car : carList) {
            System.out.println(car);
        }
    }

    @Override
    public void removeCar() {
//        System.out.println("Nhập biển kiểm soát bạn muốn xoá: ");
//        String licensePlates = scanner.nextLine();
//        boolean flagDelete = false;
//        for (int i = 0; i < carList.size(); i++) {
//            if (carList.get(i).getLicensePlates().equals(licensePlates)) {
//                System.out.println("Bạn có chắc không: " +
//                        "Nhập Y:Yes\t" +
//                        "Nhập N:No");
//                String choice = scanner.nextLine();
//                if (choice.equals("Y")) {
//                    carList.remove(i);
//                    System.out.println("Xoá thành công");
//                }
//                flagDelete = true;
//                break;
//            }
//        }
//        if (!flagDelete) {
//            TransportController.menuTransport();
//
//        }

    }

    @Override
    public void findLicensePlatesCar() {

          }

    @Override
    public void licensePlates() {
        licensePlates();
    }

    public Car infoCar() {
        System.out.println("Nhập biển kiểm soát: ");
        String licensePlates = scanner.nextLine();
        System.out.println("Nhập tên hảng sản xuất: ");
        String production = scanner.nextLine();
        System.out.println("Nhập năm sản xuất: ");
        String productiveYears = scanner.nextLine();
        System.out.println("Nhập chủ sở hữu: ");
        String proprietor = scanner.nextLine();
        System.out.println("Nhập số chỗ ngồi: ");
        int seat = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập kiểu xe: ");
        String vehicleType = scanner.nextLine();
        Car car = new Car(licensePlates, production, productiveYears, proprietor, seat, vehicleType);
        return car;
    }
}
