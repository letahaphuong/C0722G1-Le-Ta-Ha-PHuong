package case_study_module1.tempalte.service.impl;

import case_study_module1.tempalte.controller.XeController;
import case_study_module1.tempalte.model.XeTai;
import case_study_module1.tempalte.service.IXeTaiService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class XeTaiService implements IXeTaiService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<XeTai> xeTaiList = new ArrayList<>();

    public static void temp() {
        XeTai xeTai = new XeTai("1", "A", 2019, "Phương", "15 Tấn");
        XeTai xeTai1 = new XeTai("5", "B", 2022, "Bảo", "9 Tấn");
        XeTai xeTai2 = new XeTai("12", "A", 2020, "Huy", "20 Tấn");
        XeTai xeTai3 = new XeTai("4", "B", 2011, "Long", "35 Tấn");
        xeTaiList.add(xeTai);
        xeTaiList.add(xeTai1);
        xeTaiList.add(xeTai2);
        xeTaiList.add(xeTai3);
    }

    public XeTai infoXeTai() {
        System.out.println("Mời bạn nhập thông tin xe: ");
        System.out.println("Nhập biển kiểm soát: ");
        String bienSoXe = scanner.nextLine();
        System.out.println("Nhập hãng sản xuất: ");
        String tenHangSanXuat = scanner.nextLine();
        System.out.println("Nhập năm sản xuất: ");
        int namSanXuat = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập chủ sở hữu: ");
        String chuSoHuu = scanner.nextLine();
        System.out.println("Nhập tải trọng");
        String taiTrong = scanner.nextLine();
        XeTai xeTai = new XeTai(bienSoXe, tenHangSanXuat, namSanXuat, chuSoHuu, taiTrong);
        return xeTai;
    }

    @Override
    public void addXeTai() {
        XeTai xeTai = this.infoXeTai();
        xeTaiList.add(xeTai);
        System.out.println("Thêm mới thành công!");
    }

    @Override
    public void displayXeTai() {
        for (XeTai xeTai : xeTaiList) {
            System.out.println(xeTai);
        }
    }

    @Override
    public void removeXeTai(String find) {
//        String find=XeController.removeXe1();
        for (int i = 0; i < xeTaiList.size(); i++) {
            if (xeTaiList.get(i).getBienSoxe().equals(find)) {
                System.out.println("Bạn chắc chắn muốn xoá xe tải? Nhập: " +
                        "y => Xoá " +
                        "n => Để quay về Menu");
                String choice = scanner.nextLine();
                switch (choice) {
                    case "y":
                        xeTaiList.remove(i);
                        System.out.println("Xoá thành công!");
                        break;
                    case "n":
                        return;
                }
            }


        }
    }

    @Override
    public void findXeTai(String find) {
        boolean flagFind = false;
        for (int i = 0; i < xeTaiList.size(); i++) {
            if (xeTaiList.get(i).getBienSoxe().equals(find)) {
                System.out.println(xeTaiList.get(i));
                flagFind = true;
            }
        }
        if (!flagFind) {
            System.out.println("Phương tiện bạn cần tìm không tồn tại!");
        }
    }
    public  static void sortXeTai(){
        for (int i = 0; i < xeTaiList.size(); i++) {
            for (int j = 0; j < xeTaiList.size()-1-i; j++) {
                XeTai xeTai=xeTaiList.get(i);
                XeTai xeTai1=xeTaiList.get(j+1);
                int compare= xeTai.compareTo(xeTai1);
                if (compare>0){
//                    Collections.swap(xeTaiList,j,j+1);
                    XeTai temp= xeTaiList.get(j);
                    xeTaiList.set(j,xeTaiList.get(j+1));
                    xeTaiList.set(j+1,temp);
                }
            }
        }
        System.out.println("Sắp xếp thành công!");
    }
}
