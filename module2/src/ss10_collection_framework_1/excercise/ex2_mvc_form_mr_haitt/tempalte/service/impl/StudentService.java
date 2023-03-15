package ss10_collection_framework_1.excercise.ex2_mvc_form_mr_haitt.tempalte.service.impl;

import ss10_collection_framework_1.excercise.ex2_mvc_form_mr_haitt.tempalte.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Student> studentList = new ArrayList<>();

    @Override
    public void addStudent() {
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
}
