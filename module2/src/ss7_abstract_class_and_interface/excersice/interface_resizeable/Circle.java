package ss7_abstract_class_and_interface.excersice.interface_resizeable;

public class Circle implements Resizeable {
   private  double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void resize(double percent) {
        this.radius = this.radius + ((this.radius*percent)/100);
    }

    @Override
    public double getArea() {
        return Math.pow(this.radius,2)*Math.PI;
    }
}
