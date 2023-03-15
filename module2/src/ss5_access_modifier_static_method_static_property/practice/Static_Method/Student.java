package ss5_access_modifier_static_method_static_property.practice.Static_Method;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    // constructor khởi tạo biến.
    Student(int r, String n) {
        this.rollno = r;
        this.name = n;
    }

    // phương thức static để thay đổi giá trị của biến stactic.
    static void change() {
        college = "CODEGYM";
    }

    // phương thức hiển thị giá trị
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
