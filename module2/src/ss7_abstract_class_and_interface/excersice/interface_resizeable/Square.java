package ss7_abstract_class_and_interface.excersice.interface_resizeable;

public class Square implements Resizeable {
   private double size;

    public Square(double size) {
        this.size = size;
    }

    public Square() {
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public void resize(double percent) {
        this.size = this.size + ((this.size*percent)/100);
    }

    @Override
    public double getArea() {
        return Math.pow(size,2);
    }
}
