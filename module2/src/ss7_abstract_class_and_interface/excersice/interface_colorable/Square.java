package ss7_abstract_class_and_interface.excersice.interface_colorable;

public class Square extends Geometric implements Colorable{
    private double size;

    public Square() {
    }

    public Square(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }

    @Override
    double getArea() {
        return Math.pow(this.size,2);
    }
}
