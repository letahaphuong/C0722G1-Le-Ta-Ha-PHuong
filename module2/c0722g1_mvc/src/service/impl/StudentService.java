package service.impl;

import model.Student;
import service.IStudentService;

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
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void displayAllStudent() {
        for(Student student: studentList) {
            System.out.println(student);
        }
    }

    @Override
    public void removeStudent() {
        System.out.print("Mời bạn nhập mã học sinh cần xóa: ");
        String code = scanner.nextLine();
        boolean flagDelete = false;
        for(int i = 0 ; i< studentList.size(); i++) {
            if(studentList.get(i).getCode().equals(code)) {
                System.out.println("Bạn có chắc muốn xóa học sinh này không? Nhập Y: yes, N: no");
                String choice = scanner.nextLine();
                if(choice.equals("Y")) {
                    studentList.remove(i);
                    System.out.println("Xóa thành công");
                }
                flagDelete = true;
                break;
            }
        }
        if(!flagDelete) {
            System.out.println("Không tìm thấy đối tượng cần xóa.");
        }
    }

    public Student infoStudent() {
        System.out.print("Mời bạn nhập mã học sinh: ");
        String code = scanner.nextLine();
        System.out.print("Mời bạn nhập tên học sinh: ");
        String name = scanner.nextLine();
        System.out.print("Mời bạn nhập giới tính học sinh: ");
        String tempGender = scanner.nextLine();
        Boolean gender;
        if(tempGender.equals("Nam")) {
            gender = true;
        } else if(tempGender.equals("Nữ")) {
            gender= false;
        } else {
            gender = null;
        }
        System.out.print("Mời bạn nhập tên lớp: ");
        String nameClass = scanner.nextLine();
        System.out.print("Mời bạn nhập điểm của học sinh: ");
        double score = Double.parseDouble(scanner.nextLine());
        Student student = new Student(code,name,gender,nameClass,score);
        return student;
    }
}
