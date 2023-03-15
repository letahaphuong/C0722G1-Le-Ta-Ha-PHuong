package ss14_sorting_algorithms.excercise.excercise_from_mrHai.controller;

import ss14_sorting_algorithms.excercise.excercise_from_mrHai.service.impl.ITeacherService;
import ss14_sorting_algorithms.excercise.excercise_from_mrHai.service.impl.impl.TeacherService;

import java.util.Scanner;

public class TeacherController {
    private static Scanner scanner = new Scanner(System.in);
    private static ITeacherService iTeacherService = new TeacherService();

    public static void menuTeacher() {
        TeacherService.temp();
        while (true) {
            System.out.println("\n***Chào mừng bạn đến với quản lý Giáo Viên***\n");
            System.out.println("Vui lòng chọn chức năng bạn cần: ");
            System.out.println("1. Thêm Giáo Viên mới");
            System.out.println("2. Hiển thị danh sách Giáo Viên");
            System.out.println("3. Xoá Giáo Viên");
            System.out.println("4. Tìm kiếm theo tên hoặc ID!");
            System.out.println("5. Sắp xếp theo tên nếu trùng tên thì theo ID!");
            System.out.println("6. Quay về MENU chính");
            System.out.println("0. Thoát chương trình");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iTeacherService.addTeacher();
                    break;
                case 2:
                    iTeacherService.displayAllTeacher();
                    break;
                case 3:
                    iTeacherService.removeTeacher();
                    break;
                case 4:
                    findTeacher();
                    break;
                case 5:
                    iTeacherService.sortTeacher();
                    break;
                case 6:
                    return;
                case 0:
                    System.exit(0);
            }
        }
    }
    public static void findTeacher(){
        System.out.println("Mời bạn chọi chức năng: ");
        System.out.println("1. Tìm theo tên: ");
        System.out.println("2. Tìm theo ID: ");
        System.out.println("3. Trở lại menu: ");
        System.out.println("0. Thoát chương trình");
        int choice=Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                iTeacherService.findTeacherName();
                break;
            case 2:
                iTeacherService.findTeacherID();
                break;
            case 3:
                return;
            case 0:
                System.exit(0);

        }
    }
}
