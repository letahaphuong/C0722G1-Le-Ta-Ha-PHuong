package ss13_thuat_toan_tim_kiem.excercise.excercise_from_mrHai.controller;

import ss13_thuat_toan_tim_kiem.excercise.excercise_from_mrHai.service.impl.ITeacherService;
import ss13_thuat_toan_tim_kiem.excercise.excercise_from_mrHai.service.impl.impl.TeacherService;

import java.util.Scanner;

public class TeacherController {
    private static Scanner scanner = new Scanner(System.in);
    private static ITeacherService iTeacherService = new TeacherService();

    public static void menuTeacher() {
        TeacherService.temp();
        while (true) {
            System.out.println("***Chào mừng bạn đến với quản lý Giáo Viên***");
            System.out.println("Vui lòng chọn chức năng bạn cần: ");
            System.out.println("1. Thêm Giáo Viên mới");
            System.out.println("2. Hiển thị danh sách Giáo Viên");
            System.out.println("3. Xoá Giáo Viên");
            System.out.println("4. Tìm kiếm theo tên hoặc ID!");
            System.out.println("5. Quay về MENU chính");
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
                    iTeacherService.findTeacherNameOrID();
                    break;
                case 5:
                    return;
                case 0:
                    System.exit(0);
            }
        }
    }
}
