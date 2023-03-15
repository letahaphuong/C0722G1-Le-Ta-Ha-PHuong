package ss13_thuat_toan_tim_kiem.excercise.excercise_from_mrHai.controller;

import java.util.Scanner;

public class PersonController {
    private static Scanner scanner = new Scanner(System.in);
    private static StudentController studentController = new StudentController();
    private static TeacherController teacherController = new TeacherController();

    public static void menuPerson()  {
        while (true) {
            System.out.println("-------Chương trình quản lý Giáo viên và học sinh-------");
            System.out.println("Xin chọn chức năng!");
            System.out.println("1. Quản lý Sinh Viên");
            System.out.println("2. Quản lý Giáo Viên");
            System.out.println("0. Kết thúc chương trình");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    StudentController.menuStudent();
                    break;
                case 2:
                    TeacherController.menuTeacher();
                    break;
                case 0:
                    System.exit(0);
                    System.out.println("Chương trình đã kết thúc!");
                default:
                    System.out.println("Vui lòng chọn lại!");
            }
        }
    }
}
