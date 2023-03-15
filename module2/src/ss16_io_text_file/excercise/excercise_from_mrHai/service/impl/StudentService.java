package ss16_io_text_file.excercise.excercise_from_mrHai.service.impl;

import ss16_io_text_file.excercise.excercise_from_mrHai.model.Student;
import ss16_io_text_file.excercise.excercise_from_mrHai.service.IStudentService;
import ss16_io_text_file.excercise.excercise_from_mrHai.util.*;

import java.io.*;
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
    public void addStudent() throws IOException {
        studentList = readFile();
        Student student = this.infoStudent();
        studentList.add(student);
        System.out.println("Thêm mới thành công! ");
        writeFile(studentList);
    }

    @Override
    public void displayAllStudent() throws FileNotFoundException {
        studentList = readFile();

        for (Student student : studentList) {
            System.out.println(student);
        }

    }

    @Override
    public void removeStudent() throws IOException {
        studentList = readFile();
        System.out.println("Mời bạn nhập mã Sinh Viên cần xoá: ");
        String id = scanner.nextLine();
        boolean flagDelete = false;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId().equals(id)) {
                System.out.println("Bạn có chắc muốn xoá Sinh Viên?" +
                        "Nhập Y để xoá" +
                        "Nhập N để không xoá");
                String choice = scanner.nextLine();
                if (choice.equals("y")) {
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
        writeFile(studentList);
    }

    @Override
    public void findStudentName() throws FileNotFoundException {
        studentList = readFile();
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
    public void findStudentID() throws FileNotFoundException {
        studentList = readFile();
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
    public void sortName() throws IOException {
        studentList = readFile();
        for (int i = 0; i < studentList.size(); i++) {
            for (int j = 0; j < studentList.size() - 1 - i; j++) {
                Student student1 = studentList.get(j);
                Student student2 = studentList.get(j + 1);
                int compare = student1.compareTo(student2);
                if (compare > 0) {
//                    Collections.swap(studentList, j, j + 1);
                    Student temp = studentList.get(j);
                    studentList.set(j, studentList.get(j + 1));
                    studentList.set(j + 1, temp);
                }
            }
        }
        writeFile(studentList);
        System.out.println("\nSẮP XẾP THÀNH CÔNG! \n");
    }

    public Student infoStudent() {
        while (true) {
            try {
                System.out.println("Mời bạn nhập mã Sinh Viên: ");
                id = scanner.nextLine();
                Util.checkID(id);
                break;
            } catch (CheckIDException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Nhập tên sinh viên: ");
        while (true) {
            try {
                name = scanner.nextLine();
                Check.checkName(name);
                break;
            } catch (FormatException e) {
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

//        System.out.println("Mời bạn nhập tên lớp: ");
//        String nameClass = scanner.nextLine();
        System.out.println("Nhập tên lớp: ");
        String nameClass;
        while (true) {
            try {
                nameClass = scanner.nextLine();
                Check.checkName(nameClass);
                break;
            } catch (FormatException e) {
                e.getStackTrace();
                System.out.println("Sai định dạng,Nhập lại");
            }
        }

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

    public List<Student> readFile() throws FileNotFoundException {
        List<Student> studentList = new ArrayList<>();
        try {
            File file = new File("src\\ss16_io_text_file\\excercise\\excercise_from_mrHai\\data\\Student.txt");
            FileReader fileReader = new FileReader(file);
            if (!file.exists()) {
                System.err.println("File không tồn tại!");
            }
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] info;
            Student student;
            while ((line = bufferedReader.readLine()) != null) {
                info = line.split(",");
                student = new Student();
                student.setId(info[0]);
                student.setName(info[1]);
                student.setBirthday(info[2]);
                student.setSex(Boolean.parseBoolean(info[3]));
                student.setNameClass(info[4]);
                student.setScore(Double.parseDouble(info[5]));
                studentList.add(student);
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
        return studentList;
    }

    public void writeFile(List<Student> studentList) throws IOException {
        File file = new File("src\\ss16_io_text_file\\excercise\\excercise_from_mrHai\\data\\Student.txt");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Student student : studentList) {
            bufferedWriter.write(student.getInfo());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }

}
