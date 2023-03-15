package ss10_collection_framework_1.excercise.ex2_mvc_form_mr_haitt.tempalte.service.impl;

import ss10_collection_framework_1.excercise.ex2_mvc_form_mr_haitt.tempalte.model.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Teacher> teacherList = new ArrayList<>();


    @Override
    public void addTeacher() {
        Teacher teacher = this.infoTeacher();
        teacherList.add(teacher);
        System.out.println("Thêm mới thành công!");
    }

    @Override
    public void displayAllTeacher() {
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }
    }

    @Override
    public void removeTeacher() {
        System.out.println("Mời nhập mã Giáo Viên cần xoá: ");
        String id = scanner.nextLine();
        boolean flagDelete = false;
        for (int i = 0; i < teacherList.size(); i++) {
            if (teacherList.get(i).getId().equals(id)) {
                System.out.println("Bạn có chắc muốn xoá học sinh này không? Nhập Y để có,N để không.");
                String choice = scanner.nextLine();
                if (choice.equals("Y")) {
                    teacherList.remove(i);
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

    public Teacher infoTeacher() {
        System.out.println("Mời bạn nhập mã Giáo Viên: ");
        String id = scanner.nextLine();
        System.out.println("Mời bạn nhập tên Giáo Viên");
        String name = scanner.nextLine();
        System.out.println("Mời bạn nhập ngày tháng năm sinh: ");
        String birthday = scanner.nextLine();
        System.out.println("Mời bạn nhập vào giới tính: ");
        String tempSex = scanner.nextLine();
        Boolean sex;
        if (tempSex.equals("Nam")) {
            sex = true;
        } else if (tempSex.equals("Nữ")) {
            sex = false;
        } else {
            sex = null;
        }
        System.out.println("Mời bạn nhập chuyên môn: ");
        String specialize = scanner.nextLine();
        Teacher teacher = new Teacher(id, name, birthday, sex, specialize);
        return teacher;
    }

}
