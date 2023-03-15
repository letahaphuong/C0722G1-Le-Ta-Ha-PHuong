package ss13_thuat_toan_tim_kiem.excercise.excercise_from_mrHai.controller;

import ss13_thuat_toan_tim_kiem.excercise.excercise_from_mrHai.service.impl.IStudentService;
import ss13_thuat_toan_tim_kiem.excercise.excercise_from_mrHai.service.impl.impl.StudentService;

import java.util.Scanner;

public class StudentController {
    private static IStudentService iStudentServeice = new StudentService();
    private static Scanner scanner = new Scanner(System.in);

    public static void menuStudent(){
        StudentService.temp();
        while (true) {
            System.out.println("***Chào mừng đến với quản lý sinh viên***");
            System.out.println("Vui lòng chọn chức năng bạn cần: ");
            System.out.println("1. Thêm mới Sinh Viên");
            System.out.println("2. Hiển thị danh sách Sinh Viên");
            System.out.println("3. Xoá Sinh Viên");
            System.out.println("4. Tìm kiếm theo tên or theo ID!");
            System.out.println("5. Qua về MENU chính");
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
                    iStudentServeice.findStudentNameOrID();
                    break;
                case 5:
                    return;
                case 0:
                    System.exit(0);

            }
        }
    }
}
