package ss12_map_tree.excercise.tempalte.controller;

import ss12_map_tree.excercise.tempalte.service.IProductService;
import ss12_map_tree.excercise.tempalte.service.impl.ProductService;

import java.util.Scanner;

public class ProductController {
    private static Scanner scanner = new Scanner(System.in);
    private static IProductService iProductService = new ProductService();

    public static void menuProduct() {
        ProductService.temp();
        while (true) {
            System.out.println("==Chương trình quản lí sản phẩm==");
            System.out.println("\t Mời bạn chọn chức năng: ");
            System.out.println("\t 1. Thêm sản phẩm! ");
            System.out.println("\t 2. Sửa thông tin sản phẩm theo id! ");
            System.out.println("\t 3. Xoá sản phẩm theo id! ");
            System.out.println("\t 4. Hiển thị danh sách sản phẩm! ");
            System.out.println("\t 5. Tìm kiếm sản phẩm theo tên! ");
            System.out.println("\t 6. Sắp xếp sản phẩm tăng dần theo giá! ");
            System.out.println("\t 7. Sắp xếp sản phẩm giả dần theo giá! ");
            System.out.println("\t 0. Thoát chương trình! ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iProductService.addProduct();
                    break;
                case 2:
                    iProductService.editProduct();
                    break;
                case 3:
                    iProductService.removeProduct();
                    break;
                case 4:
                    iProductService.displayProduct();
                    break;
                case 5:
                    iProductService.findProduct();
                    break;
                case 6:
                    iProductService.sortUpPrice();
                    break;
                case 7:
                    iProductService.sortDownPrice();
                    break;
                case 0:
                    System.exit(0);

            }
        }
    }
}
