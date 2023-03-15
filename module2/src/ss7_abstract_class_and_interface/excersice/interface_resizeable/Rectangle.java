package ss7_abstract_class_and_interface.excersice.interface_resizeable;

public class Rectangle  implements Resizeable {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }


    public Rectangle() {
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
    public void resize(double percent) {
        this.width = this.width + ((this.width*percent)/100);
        this.length = this.length + ((this.length*percent)/100);

    }

    @Override
    public double getArea() {
        return width*length;
    }
}
