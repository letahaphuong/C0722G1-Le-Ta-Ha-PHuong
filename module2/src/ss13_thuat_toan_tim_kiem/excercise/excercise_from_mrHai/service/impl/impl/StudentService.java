package ss13_thuat_toan_tim_kiem.excercise.excercise_from_mrHai.service.impl.impl;

import ss13_thuat_toan_tim_kiem.excercise.excercise_from_mrHai.model.Student;
import ss13_thuat_toan_tim_kiem.excercise.excercise_from_mrHai.service.impl.IStudentService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Student> studentList = new ArrayList<>();


    @Override
    public void addStudent(){
        Student student = this.infoStudent();
        studentList.add(student);
        System.out.println("Thêm mới thành công! ");
    }

    @Override
    public void displayAllStudent() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    @Override
    public void removeStudent() {
        System.out.println("Mời bạn nhập mã Sinh Viên cần xoá: ");
        String id = scanner.nextLine();
        boolean flagDelete = false;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId().equals(id)) {
                System.out.println("Bạn có chắc muốn xoá Sinh Viên?" +
                        "Nhập Y để xoá" +
                        "Nhập N để không xoá");
                String choice = scanner.nextLine();
                if (choice.equals("Y")) {
                    studentList.remove(i);
                    System.out.println("Xoá Thành Công!");
                }
                flagDelete = true;
                break;
            }
        }
        if (!flagDelete) {
            System.out.println("Không tìm thấy đối tượng cần xoá.");
        }

    }

    @Override
    public void findStudentNameOrID() {
        System.out.println("Mời bạn chọn chức năng: ");
        System.out.println("1. Tìm theo tên: ");
        System.out.println("2. Tìm theo ID: ");
        System.out.println("3. Trở lại menu ");
        System.out.println("0. Thoát chương trình! ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                System.out.println("Nhập tên bạn cần tìm: ");
                String findName = scanner.nextLine();
                boolean flagFind = false;
                for (int i = 0; i < studentList.size(); i++) {
                    if (studentList.get(i).getName().contains(findName)) {
                        System.out.println(studentList.get(i));
                        flagFind = true;
                    }
                }
                if (!flagFind) {
                    System.out.println("Không tìm thấy tên!");
                }
                break;
            case 2:
                System.out.println("Nhập Id bạn cần tìm: ");
                String findID = scanner.nextLine();
                boolean flagFind1 = false;
                for (int i = 0; i < studentList.size(); i++) {
                    if (studentList.get(i).getId().equals(findID)) {
                        System.out.println(studentList.get(i));
                        flagFind1 = true;
                    }

                }
                if (!flagFind1) {
                    System.out.println("Không tìm thấy ID");
                }
                break;
            case 3:
                return;
            case 0:
                System.exit(0);
        }


    }

    public Student infoStudent() {
        System.out.println("Mời bạn nhập mã Sinh Viên: ");
        String id = scanner.nextLine();

        System.out.println("Mời bạn nhập tên Sinh Viên: ");
        String name = scanner.nextLine();



        System.out.println("Mời bạn nhập năm ngày tháng năm sinh: ");
        String birthday = scanner.nextLine();
        System.out.println("Mời bạn nhập giới tính Sinh Viên");
        String tempSex = scanner.nextLine();
        Boolean sex;
        if (tempSex.equals("Nam")) {
            sex = true;
        } else if (tempSex.equals("Nữ")) {
            sex = false;
        } else {
            sex = null;
        }
        System.out.println("Mời bạn nhập tên lớp: ");
        String nameClass = scanner.nextLine();
        System.out.println("Mời bạn nhập điểm của Sinh Viên: ");
        double score = Double.parseDouble(scanner.nextLine());
        Student student = new Student(id, name, birthday, sex, nameClass, score);
        return student;
    }

    public static void temp() {
        Student student = new Student("1", "Nguyen van A", "12/4/2022", true, "A6", 10);
        Student student1 = new Student("4", "Nguyen van B", "12/4/1995", false, "A7", 6);
        Student student2 = new Student("3", "Nguyen van A", "12/4/1823", true, "A8", 2);
        Student student3 = new Student("6", "Nguyen van D", "12/4/1221", false, "A1", 4);
        Student student4 = new Student("2", "Nguyen van C", "12/4/2033", false, "A2", 3);
        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
    }
}
