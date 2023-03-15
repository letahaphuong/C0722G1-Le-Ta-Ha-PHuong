package ss17_io_serialization_file_binary.excersice.ex1.controller;

import ss17_io_serialization_file_binary.excersice.ex1.service.IProductManagementService;
import ss17_io_serialization_file_binary.excersice.ex1.service.impl.ProductManagementService;

import java.io.IOException;
import java.util.Scanner;

public class ProductManagamentController {
    private static Scanner scanner = new Scanner(System.in);
    private static IProductManagementService iProductManagementService =new ProductManagementService();
    public static void menuProduction() throws IOException {
        while (true){
            System.out.println("===== Chương trình quản lý sản phẩm=====");
            System.out.println("\n XIN HÃY CHỌN CHỨC NĂNG!");
            System.out.println("1. Thêm sản phẩm.");
            System.out.println("2. Hiển thị sản phẩm.");
            System.out.println("3. Tìm kiếm sản phẩm.");
            System.out.println("4. Thoát chương trình");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iProductManagementService.addProduction();
                    break;
                case 2:
                    iProductManagementService.showProduction();
                    break;
                case 3:
                    iProductManagementService.findProduction();
                    break;

                case 4:
                    System.exit(0);
            }
        }

    }
}
