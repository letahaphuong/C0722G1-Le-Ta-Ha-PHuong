package case_study_module1.tempalte.service.impl;

import case_study_module1.tempalte.controller.XeController;
import case_study_module1.tempalte.model.XeMay;
import case_study_module1.tempalte.service.IXeMayService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class XeMayService implements IXeMayService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<XeMay> xeMayList = new ArrayList<>();

    public static void temp() {
        XeMay xeMay = new XeMay("1", "honda", 2013, "Phương", "100");
        XeMay xeMay1 = new XeMay("2", "yamaha", 2020, "Sang", "111");
        XeMay xeMay2 = new XeMay("3", "honda", 2018, "Dũng", "122");
        XeMay xeMay3 = new XeMay("4", "honda", 2017, "Trung", "333");
        xeMayList.add(xeMay);
        xeMayList.add(xeMay1);
        xeMayList.add(xeMay2);
        xeMayList.add(xeMay3);
    }

    public XeMay infoXeMay() {
        System.out.println("Mời bạn nhập thông tin xe: ");
        System.out.println("Nhập biển kiểm soát: ");
        String bienSoXe = scanner.nextLine();
        System.out.println("Nhập hãng sản xuất: ");
        String tenHangSanXuat = scanner.nextLine();
        System.out.println("Nhập năm sản xuất: ");
        int namSanXuat = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập chủ sở hữu: ");
        String chuSoHuu = scanner.nextLine();
        System.out.println("Nhập công suất xe: ");
        String congSuat = scanner.nextLine();
        XeMay xeMay = new XeMay(bienSoXe, tenHangSanXuat, namSanXuat, chuSoHuu, congSuat);
        return xeMay;
    }

    @Override
    public void addXeMay() {
        XeMay xeMay = this.infoXeMay();
        xeMayList.add(xeMay);
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void displayXeMay() {
        for (XeMay xeMay : xeMayList) {
            System.out.println(xeMay);
        }
    }

    @Override
    public void removeXeMay(String find) {
//        String find = XeController.removeXe1();
        for (int i = 0; i < xeMayList.size(); i++) {
            if (xeMayList.get(i).getBienSoxe().equals(find)) {
                System.out.println("Bạn chắc chắn muốn xoá Xe Máy? Nhập: " +
                        "y => Xoá " +
                        "n => Để quay về Menu");
                String choice = scanner.nextLine();
                switch (choice) {
                    case "y":
                        xeMayList.remove(i);
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
    public void findXeMay(String find) {
        boolean flagFind = false;
        for (int i = 0; i < xeMayList.size(); i++) {
            if (xeMayList.get(i).getBienSoxe().equals(find)) {
                System.out.println(xeMayList.get(i));
                flagFind = true;
            }
        }
        if (!flagFind) {
            System.out.println("Phương tiện bạn tìm không tồn tại!");
        }
    }

    public static void sortXeMay() {
        for (int i = 0; i < xeMayList.size(); i++) {
            for (int j = 0; j < xeMayList.size() - 1 - i; j++) {
                XeMay xeMay1 = xeMayList.get(j);
                XeMay xeMay2 = xeMayList.get(j + 1);
                int compare = xeMay1.compareTo(xeMay2);
                if (compare > 0) {
//                    Collections.swap(xeMayList,j,j+1);
                    XeMay temp = xeMayList.get(j);
                    xeMayList.set(j, xeMayList.get(j + 1));
                    xeMayList.set(j + 1, temp);
                }
            }
        }
        System.out.println("Sắp xếp thành công!");

    }
}
