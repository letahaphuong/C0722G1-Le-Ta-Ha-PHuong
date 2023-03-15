package ss13_thuat_toan_tim_kiem.excercise.excercise_from_mrHai.service.impl.impl;

import ss13_thuat_toan_tim_kiem.excercise.excercise_from_mrHai.model.Teacher;
import ss13_thuat_toan_tim_kiem.excercise.excercise_from_mrHai.service.impl.ITeacherService;

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

    @Override
    public void findTeacherNameOrID() {
        System.out.println("Mời bạn chọi chức năng: ");
        System.out.println("1. Tìm theo tên: ");
        System.out.println("2. Tìm theo ID: ");
        System.out.println("3. Trở lại menu: ");
        System.out.println("0. Thoát chương trình");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                System.out.println("Nhập tên giáo viên bạn cần tìm!");
                String findName = scanner.nextLine();
                boolean flagFind = false;
                for (int i = 0; i < teacherList.size(); i++) {
                    if (teacherList.get(i).getName().contains(findName)) {
                        System.out.println(teacherList.get(i));
                        flagFind = true;
                    }
                }
                if (!flagFind) {
                    System.out.println("Không tìm thấy tên!");
                }
                break;
            case 2:
                System.out.println("Nhập ID bạn cần tìm");
                String findID=scanner.nextLine();
                boolean flagFind1 =false;
                for (int i = 0; i < teacherList.size(); i++) {
                    if (teacherList.get(i).getId().equals(findID)){
                        System.out.println(teacherList.get(i));
                        flagFind1=true;
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

    public static void temp() {
        Teacher teacher = new Teacher("1", "Nguyen Thi B", "7/7/1993", false, "aaaa");
        Teacher teacher1 = new Teacher("2", "Trần Thi A", "7/7/1996", false, "bbbb");
        Teacher teacher2 = new Teacher("3", "Lê Thi B", "7/7/1998", false, "cccc");
        Teacher teacher3 = new Teacher("4", "Đặng Thi A", "7/7/1999", false, "dddd");
        teacherList.add(teacher);
        teacherList.add(teacher1);
        teacherList.add(teacher2);
        teacherList.add(teacher3);
    }

}
