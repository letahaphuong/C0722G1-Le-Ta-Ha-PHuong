package ss5_access_modifier_static_method_static_property.practice.Static_Method;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();// Gọi phương thức thay đổi
        // tạo đối tượng học sinh mới
        Student student1 = new Student(111, "Hoang");
        Student student2 = new Student(222, "Khanh");
        Student student3 = new Student(333, "Nam");
        // gọi ra màn hình phương thức
        student1.display();
        student2.display();
        student3.display();
    }
}
