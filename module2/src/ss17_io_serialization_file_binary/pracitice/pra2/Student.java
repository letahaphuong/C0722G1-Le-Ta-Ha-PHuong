package ss17_io_serialization_file_binary.pracitice.pra2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Student implements Serializable {
    private int id;
    private String name;
    private String Address;

    public Student() {
    }

    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        Address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }

    public static void writeToFile(String path, List<Student> students) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(students);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<Student> student = new ArrayList<>();
        student.add(new Student(1, "Vũ kiều ANh", "Hà Lội"));
        student.add(new Student(2, "Nguyễn Vinh Quân", "Hà Lội"));
        student.add(new Student(3, "Đặng Huy Hoà", "Đà nẵng"));
        student.add(new Student(4, "NGuyễn Khách tùng", "Hà Lội"));
        writeToFile("student.csv", student);
        List<Student> studentDataFromFile = readDataFileFromFile("student.txt");
        for (Student student1 : studentDataFromFile) {
            System.out.println(student1);
        }
    }

    public static List<Student> readDataFileFromFile(String path) {
        List<Student> students = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            students = (List<Student>) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();

        } catch (Exception e) {
            e.getStackTrace();
        }
        return students;
    }
}
