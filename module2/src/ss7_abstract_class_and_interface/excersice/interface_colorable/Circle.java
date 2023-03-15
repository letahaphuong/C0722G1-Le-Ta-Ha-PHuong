package ss7_abstract_class_and_interface.excersice.interface_colorable;

public class Circle extends Geometric implements Colorable{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void howToColor() {

    }

    @Override
    double getArea() {
        return Math.pow(this.radius,2);
    }
}
