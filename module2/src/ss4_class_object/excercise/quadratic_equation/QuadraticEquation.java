package ss4_class_object.excercise.quadratic_equation;

public class QuadraticEquation {
    private double a;//khai báo trường dữ liệu
    private double b;
    private double c;

    public QuadraticEquation() {//Khai báo thuộc tính.Constructor.

    }

    public QuadraticEquation(double a, double b, double c) {//Khởi tạo thuộc tính,định nghĩa các phương thức khởi tạo(Contrustor)
        this.a = a;
        this.b = b;
        this.c = c;
    }

//    public double getA() {
//        return a;
//    }
//
//    public double getB() {
//        return b;
//    }
//
//    public double getC() {
//        return c;
//    }

    public double getDiscriminant() {//Định nghĩa phương thức get... trả về delta
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    public double getRoot1() {//tìm nghiệm 1 của phương trình.
        return (-this.b + Math.sqrt(getDiscriminant()));
    }

    public double getRoot2() {//tìm nghiệm 2 của phương trình.
        return (-this.b - Math.sqrt(getDiscriminant()));
    }

}