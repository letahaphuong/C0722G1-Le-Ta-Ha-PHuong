package ss16_io_text_file.excercise.excercise_from_mrHai.service.impl;

import ss16_io_text_file.excercise.excercise_from_mrHai.model.Student;
import ss16_io_text_file.excercise.excercise_from_mrHai.model.Teacher;
import ss16_io_text_file.excercise.excercise_from_mrHai.service.ITeacherService;
import ss16_io_text_file.excercise.excercise_from_mrHai.util.CheckBirthDayException;
import ss16_io_text_file.excercise.excercise_from_mrHai.util.CheckIDException;
import ss16_io_text_file.excercise.excercise_from_mrHai.util.CheckStringException;
import ss16_io_text_file.excercise.excercise_from_mrHai.util.Util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Teacher> teacherList = new ArrayList<>();
    private static String name;
    private static String id;
    private static String birthday;
    private static String specialize;

    @Override
    public void addTeacher() throws IOException {
        teacherList=readFile();
        Teacher teacher = this.infoTeacher();
        teacherList.add(teacher);
        System.out.println("Thêm mới thành công!");
        writeFile();
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
    public void findTeacherName() {
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
    }

    @Override
    public void findTeacherID() {
        System.out.println("Nhập ID bạn cần tìm");
        String findID = scanner.nextLine();
        boolean flagFind1 = false;
        for (int i = 0; i < teacherList.size(); i++) {
            if (teacherList.get(i).getId().equals(findID)) {
                System.out.println(teacherList.get(i));
                flagFind1 = true;
            }

        }
        if (!flagFind1) {
            System.out.println("Không tìm thấy ID");
        }
    }

    @Override
    public void sortTeacher() {
        for (int i = 0; i < teacherList.size(); i++) {
            for (int j = 0; j < teacherList.size() - 1 - i; j++) {
                Teacher teacher1 = teacherList.get(j);
                Teacher teacher2 = teacherList.get(j + 1);
                int compare = teacher1.compareTo(teacher2);
                if (compare > 0) {
//                    Collections.swap(teacherList,j,j+1);
                    Teacher temp = teacherList.get(j);
                    teacherList.set(j, teacherList.get(j + 1));
                    teacherList.set(j + 1, temp);
                }
            }
        }
        System.out.println("\nSắp xếp thành công! \n");
    }

    public Teacher infoTeacher() {
        while (true) {
            try {
                System.out.println("Mời bạn nhập mã Giáo Viên: ");
                id = scanner.nextLine();
                Util.checkID(id);
                break;
            } catch (CheckIDException e) {
                System.out.println(e.getMessage());
            }
        }


        while (true) {
            try {
                System.out.println("Mời bạn nhập tên Giáo Viên");
                name = scanner.nextLine();
                Util.checkString(name);
                break;
            } catch (CheckStringException e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.println("Mời bạn nhập ngày tháng năm sinh: ");
                birthday = scanner.nextLine();
                Util.checkBirth(birthday);
                break;
            } catch (CheckBirthDayException e) {
                System.out.println(e.getMessage());
            }
        }


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

        while (true) {
            try {
                System.out.println("Mời bạn nhập chuyên môn: ");
                specialize = scanner.nextLine();
                Util.checkString(specialize);
                break;
            } catch (CheckStringException e) {
                System.out.println(e.getMessage());
            }
        }


        Teacher teacher = new Teacher(id, name, birthday, sex, specialize);
        return teacher;
    }
    public List<Teacher> readFile() throws FileNotFoundException {
        List<Teacher> teacherList = new ArrayList<>();
        try {
            File file = new File("src\\ss16_io_text_file\\excercise\\excercise_from_mrHai\\data\\Teacher.txt");
            FileReader fileReader = new FileReader(file);
            if (!file.exists()) {
                System.err.println("File không tồn tại!");
            }
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] info;
            Teacher teacher;
            while ((line = bufferedReader.readLine()) != null) {
                info = line.split(",");
                teacher = new Teacher();
                teacher.setId(info[0]);
                teacher.setName(info[1]);
                teacher.setBirthday(info[2]);
                teacher.setSex(Boolean.parseBoolean(info[3]));
                teacher.setSpecialize(info[4]);
                teacherList.add(teacher);
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
        return teacherList;
    }

    public void writeFile() throws IOException {
        File file = new File("src\\ss16_io_text_file\\excercise\\excercise_from_mrHai\\data\\Teacher.txt");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Teacher teacher : teacherList) {
            bufferedWriter.write(teacher.getInfo());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }

//    public static void temp() {
//        Teacher teacher = new Teacher("1", "Nguyen Thi B", "7/7/1993", false, "aaaa");
//        Teacher teacher1 = new Teacher("2", "Nguyen Thi A", "7/7/1996", false, "bbbb");
//        Teacher teacher2 = new Teacher("3", "Nguyen Thi B", "7/7/1998", false, "cccc");
//        Teacher teacher3 = new Teacher("4", "Nguyen Thi A", "7/7/1999", false, "dddd");
//        teacherList.add(teacher);
//        teacherList.add(teacher1);
//        teacherList.add(teacher2);
//        teacherList.add(teacher3);
//    }

}
