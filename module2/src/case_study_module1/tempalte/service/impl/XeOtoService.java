package case_study_module1.tempalte.service.impl;

import case_study_module1.tempalte.controller.XeController;
import case_study_module1.tempalte.model.XeOTo;
import case_study_module1.tempalte.service.IXeOtoService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class XeOtoService implements IXeOtoService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<XeOTo> oToList = new ArrayList<>();

    public static void temp() {
        XeOTo xeOTo = new XeOTo("Z", "yamaha", 1111, "Tấn", "Du Lịch", 7);
        XeOTo xeOTo1 = new XeOTo("D", "honda", 2222, "Đạt", "Khách", 56);
        XeOTo xeOTo2 = new XeOTo("D", "suzuki", 3333, "Khánh", "Khách", 16);
        XeOTo xeOTo3 = new XeOTo("z", "vinfast ", 4444, "Duy", "Du Lịch", 4);
        oToList.add(xeOTo);
        oToList.add(xeOTo1);
        oToList.add(xeOTo2);
        oToList.add(xeOTo3);
    }

    public XeOTo infoXeOTo() {
        System.out.println("Nhập thông tin xe: ");
        System.out.println("Nhập biển kiểm soát: ");
        String bienSoXe = scanner.nextLine();
        System.out.println("Nhập hãng sản xuất: ");
        String tenHangSanXuat = scanner.nextLine();
        System.out.println("Năm sản xuất:  ");
        int namSanXuat = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập chủ sở hữu: ");
        String chuSoHuu = scanner.nextLine();
        System.out.println("Nhập kiểu xe: ");
        String kieuXe = scanner.nextLine();
        System.out.println("Nhập số chỗ ngồi: ");
        int soChoNgoi = Integer.parseInt(scanner.nextLine());
        XeOTo xeOTo = new XeOTo(bienSoXe, tenHangSanXuat, namSanXuat, chuSoHuu, kieuXe, soChoNgoi);
        return xeOTo;
    }

    @Override
    public void addXeOto() {
        XeOTo xeOTo = this.infoXeOTo();
        oToList.add(xeOTo);
        System.out.println("Thêm mới thành công!");
    }

    @Override
    public void displayXeOTo() {
        for (XeOTo xeOTo : oToList) {
            System.out.println(xeOTo);
        }
    }

    @Override
    public void removeXeOTo(String find) {
//        String find =XeController.removeXe1();
        for (int i = 0; i < oToList.size(); i++) {
            if (oToList.get(i).getBienSoxe().equals(find)) {
                System.out.println("Bạn chắc chắn muốn xoá Otô? Nhập: " +
                        "y => Xoá " +
                        "n => Để quay về Menu");
                String choice = scanner.nextLine();
                switch (choice) {
                    case "y":
                        oToList.remove(i);
                        System.out.println("Xoá thành công!");
                        break;
                    case "n":
                        return;

                }
            }
            break;
        }
    }

    @Override
    public void findXeOTo(String find) {
        boolean flagFind = false;
        for (int i = 0; i < oToList.size(); i++) {
            if (oToList.get(i).getBienSoxe().equals(find)) {
                System.out.println(oToList.get(i));
                flagFind = true;
            }
        }
        if (!flagFind) {
            System.out.println("Phương tiện bạn cần tìm không tồn tại!");
        }

    }

    public static void sortXeOTo() {
        for (int i = 0; i < oToList.size(); i++) {
            for (int j = 0; j < oToList.size() - 1 - i; j++) {
                XeOTo xeOTo = oToList.get(j);
                XeOTo xeOTo1 = oToList.get(j + 1);
                int compare = xeOTo.compareTo(xeOTo1);
                if (compare > 0) {
//                    Collections.swap(oToList,j,j+1);
                    XeOTo temp = oToList.get(j);
                    oToList.set(j, oToList.get(j + 1));
                    oToList.set(j + 1, temp);
                }
            }
        }
        System.out.println("Sắp xếp thành công!");

    }

}
