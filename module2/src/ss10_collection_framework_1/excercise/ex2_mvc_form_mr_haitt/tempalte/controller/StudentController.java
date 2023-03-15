package ss10_collection_framework_1.excercise.ex2_mvc_form_mr_haitt.tempalte.controller;

import ss10_collection_framework_1.excercise.ex2_mvc_form_mr_haitt.tempalte.service.impl.IStudentService;
import ss10_collection_framework_1.excercise.ex2_mvc_form_mr_haitt.tempalte.service.impl.StudentService;

import java.util.Scanner;

public class StudentController {
    private static IStudentService iStudentServeice = new StudentService();
    private static Scanner scanner = new Scanner(System.in);

    public static void menuStudent() {
        while (true) {
            System.out.println("***Chào mừng đến với quản lý sinh viên***");
            System.out.println("Vui lòng chọn chức năng bạn cần: ");
            System.out.println("1. Thêm mới Sinh Viên");
            System.out.println("2. Hiển thị danh sách Sinh Viên");
            System.out.println("3. Xoá Sinh Viên");
            System.out.println("4. Qua về MENU chính");
            System.out.println("0. Thoát chương trình");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iStudentServeice.addStudent();
                    break;
                case 2:
                    iStudentServeice.displayAllStudent();
                    break;
                case 3:
                    iStudentServeice.removeStudent();
                    break;
                case 4:
                    return;
                case 0:
                    System.exit(0);

            }
        }
    }
}
