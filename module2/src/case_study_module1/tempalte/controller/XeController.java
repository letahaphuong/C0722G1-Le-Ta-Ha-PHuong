package case_study_module1.tempalte.controller;

import case_study_module1.tempalte.model.XeOTo;
import case_study_module1.tempalte.service.IXeMayService;
import case_study_module1.tempalte.service.IXeOtoService;
import case_study_module1.tempalte.service.IXeTaiService;
import case_study_module1.tempalte.service.impl.XeMayService;
import case_study_module1.tempalte.service.impl.XeOtoService;
import case_study_module1.tempalte.service.impl.XeTaiService;
import com.sun.org.apache.xml.internal.serialize.XHTMLSerializer;

import java.util.Scanner;

public class XeController {
    private static Scanner scanner = new Scanner(System.in);
    private static IXeMayService iXeMayService = new XeMayService();
    private static IXeOtoService iXeOtoService = new XeOtoService();
    private static IXeTaiService iXeTaiService = new XeTaiService();


    public static void menuXeController() {
        XeMayService.temp();
        XeTaiService.temp();
        XeOtoService.temp();
        while (true) {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG");
            System.out.println("Chọn chức năng: ");
            System.out.println("\t 1. Thêm mới phương tiên.");
            System.out.println("\t 2. Hiển thị phương tiện.");
            System.out.println("\t 3. Xoá phương tiện.");
            System.out.println("\t 4. Tìm theo biển kiểm soát.");
            System.out.println("\t 5. Sắp xếp theo tên chủ sở hữu,nếu trùng tên thì sắp xếp theo hãng.");
            System.out.println("\t 0. Thoát.");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    themXe();
                    break;
                case 2:
                    hienThiXe();
                    break;
                case 3:
                    removeXe1();
                    break;
                case 4:
                    findBienSoXe();
                    break;
                case 5:
                    sort();
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }

    public static void themXe() {
        System.out.println("Chọn phương tiện bạn cần thêm!");
        System.out.println("\t 1. Thêm xe tải.");
        System.out.println("\t 2. Thêm oto.");
        System.out.println("\t 3. Thêm xe máy.");
        System.out.println("\t 4. Trở lại Menu.");
        System.out.println("\t 0. Thoát.");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                iXeTaiService.addXeTai();
                break;
            case 2:
                iXeOtoService.addXeOto();
                break;
            case 3:
                iXeMayService.addXeMay();
                break;
            case 4:
                return;
            case 5:
                System.exit(0);

        }
    }

    public static void hienThiXe() {
        System.out.println("Chọn phương tiện cần hiển thị!");
        System.out.println("\n 1. Hiển thị xe Tải");
        System.out.println("\n 2. Hiển thị xe Ô tô");
        System.out.println("\n 3. Hiển thị xe Máy");
        System.out.println("\n 4. Tở về Menu!");
        System.out.println("\n 0. Thoát chương trình!");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                iXeTaiService.displayXeTai();
                break;
            case 2:
                iXeOtoService.displayXeOTo();
                break;
            case 3:
                iXeMayService.displayXeMay();
                break;
            case 4:
                return;
            case 0:
                System.exit(0);
        }
    }

    public static void removeXe1() {
        System.out.println("Nhập biển kiểm soát cần xoá!");
        String find = scanner.nextLine();
        iXeTaiService.removeXeTai(find);
        iXeOtoService.removeXeOTo(find);
        iXeMayService.removeXeMay(find);
    }

    public static void findBienSoXe() {
        System.out.println("Nhập biển kiểm soát cần tìm!");
        String find = scanner.nextLine();
        iXeTaiService.findXeTai(find);
        iXeOtoService.findXeOTo(find);
        iXeMayService.findXeMay(find);
    }
    public static void sort(){
        XeTaiService.sortXeTai();
        XeOtoService.sortXeOTo();
        XeMayService.sortXeMay();
    }
}
