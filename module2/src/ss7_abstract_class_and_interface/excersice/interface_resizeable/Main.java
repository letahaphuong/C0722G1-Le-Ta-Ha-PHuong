package ss7_abstract_class_and_interface.excersice.interface_resizeable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        circle.resize(Math.floor(Math.random() * 100 + 1));
        Rectangle rectangle = new Rectangle(4, 5);
        rectangle.resize(Math.floor(Math.random() * 100 + 1));
        Square square = new Square(6);
        square.resize(Math.floor(Math.random() * 100 + 1));
        Resizeable[] arr = new Resizeable[]{circle, rectangle, square};
        for (Resizeable resizeable : arr) {
            System.out.print(resizeable.getArea() + "\t");
        }
    }
}
