package ss7_abstract_class_and_interface.excersice.interface_colorable;

public class Rectangle extends Geometric implements Colorable{
    private double width;
    private double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void howToColor() {

    }

    @Override
    double getArea() {
        return this.width*this.length;
    }
}
