package ss15_exception.excercise.excercise_from_mrHai.service.impl;

import ss15_exception.excercise.excercise_from_mrHai.model.Student;
import ss15_exception.excercise.excercise_from_mrHai.util.CheckBirthDayException;
import ss15_exception.excercise.excercise_from_mrHai.util.CheckIDException;
import ss15_exception.excercise.excercise_from_mrHai.util.CheckStringException;
import ss15_exception.excercise.excercise_from_mrHai.service.IStudentService;
import ss15_exception.excercise.excercise_from_mrHai.util.Util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Student> studentList = new ArrayList<>();
    private static double score;
    private static String name;
    private static String birthday;
    private static String id;

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

    @Override
    public void findStudentName() {
        System.out.println("Nhập tên bạn cần tìm: ");
        String name = scanner.nextLine();
        boolean flagFind = false;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getName().contains(name)) {
                System.out.println(studentList.get(i));
                flagFind = true;
            }
        }
        if (!flagFind) {
            System.out.println("Không tìm thấy tên!");
        }

    }

    @Override
    public void findStudentID() {
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
    }

    @Override
    public void sortName() {
        for (int i = 0; i < studentList.size(); i++) {
            for (int j = 0; j < studentList.size() - 1 - i; j++) {
                Student student1 = studentList.get(j);
                Student student2 = studentList.get(j + 1);
                int compare = student1.compareTo(student2);
                if (compare > 0) {
                    Collections.swap(studentList, j, j + 1);
//                    Student temp= studentList.get(j);
//                    studentList.set(j,studentList.get(j+1));
//                    studentList.set(j+1,temp);
                }
            }
        }
        System.out.println("\nSẮP XẾP THÀNH CÔNG! \n");
    }

    public Student infoStudent() {
        while (true){
            try {
                System.out.println("Mời bạn nhập mã Sinh Viên: ");
                id = scanner.nextLine();
                Util.checkID(id);
                break;
            }catch (CheckIDException e){
                System.out.println(e.getMessage());
            }
        }



        while (true) {
            try {
                System.out.println("Mời bạn nhập tên Sinh Viên: ");
                name = scanner.nextLine();
                Util.checkString(name);
                break;
            } catch (CheckStringException e) {
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Mời bạn nhập năm ngày tháng năm sinh: ");
                birthday = scanner.nextLine();
                Util.checkBirth(birthday);

                break;
            } catch (CheckBirthDayException e) {
                System.out.println(e.getMessage());
            }
        }


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

        while (true) {
            try {
                System.out.println("Mời bạn nhập điểm của Sinh Viên: ");
                score = Double.parseDouble(scanner.nextLine());
                Util.check(score);
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }

        return new Student(id, name, birthday, sex, nameClass, score);
    }




    public static void temp() {
        Student student = new Student("3", " A", "12/4/2022", true, "A6", 10);
        Student student1 = new Student("4", "Nguyen van B", "12/4/1995", false, "A7", 6);
        Student student2 = new Student("1", "Nguyen van A", "12/4/1823", true, "A8", 2);
        Student student3 = new Student("6", "Nguyen van D", "12/4/1221", false, "A1", 4);
        Student student4 = new Student("2", "Nguyen van C", "12/4/2033", false, "A2", 3);
        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
    }

}
