package ss4_class_object.practice;

import java.util.Scanner;


public class Rectangle {
    double width;
    double height;

    public Rectangle() { //khai báo thuộc tính.

    }

    public Rectangle(double width, double height) { //Khởi tạo thuộc tính.
        this.width = width;
        this.height = height;
    }

    public double getArea() { // Định nghĩa phương thức tính diện tích.
        return this.width * this.height;
    }

    public double getPerimeter() { //Định nghĩa phương thức tính chu vi.
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle{" + "width= " + width + "height= " + height + "}";
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the width: ");
        double width = Integer.parseInt(sc.nextLine());
        System.out.print("Enter the height: ");
        double height = Integer.parseInt(sc.nextLine());
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your Rectangle \n" + rectangle.display());
        System.out.println("Perimeter of Rectangle: " + rectangle.getPerimeter());
        System.out.println("Area of Rectangle: " + rectangle.getArea());
    }
}