package ss15_exception.excercise.excercise_from_mrHai.controller;

import ss15_exception.excercise.excercise_from_mrHai.service.IStudentService;
import ss15_exception.excercise.excercise_from_mrHai.service.impl.StudentService;

import java.util.Scanner;

public class StudentController {
    private static IStudentService iStudentServeice = new StudentService();
    private static Scanner scanner = new Scanner(System.in);

    public static void menuStudent() {
        StudentService.temp();
        while (true) {
            System.out.println("\n***Chào mừng đến với quản lý sinh viên***\n");
            System.out.println("Vui lòng chọn chức năng bạn cần: ");
            System.out.println("1. Thêm mới Sinh Viên");
            System.out.println("2. Hiển thị danh sách Sinh Viên");
            System.out.println("3. Xoá Sinh Viên");
            System.out.println("4. Tìm kiếm theo tên or theo ID!");
            System.out.println("5. Sắp xếp tên");
            System.out.println("6. Qua về MENU chính");
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
                    findStudentNameOrID();
                    break;
                case 5:
                    iStudentServeice.sortName();
                    break;
                case 6:
                    return;
                case 0:
                    System.exit(0);

            }
        }
    }



    public static void findStudentNameOrID(){
        System.out.println("Mời bạn chọn chức năng: ");
        System.out.println("1. Tìm theo tên: ");
        System.out.println("2. Tìm theo ID: ");
        System.out.println("3. Trở lại menu ");
        System.out.println("0. Thoát chương trình! ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                iStudentServeice.findStudentName();
                break;
            case 2:
                iStudentServeice.findStudentID();
                break;
            case 3:
                return;
            case 0:
                System.exit(0);
        }
    }
}
