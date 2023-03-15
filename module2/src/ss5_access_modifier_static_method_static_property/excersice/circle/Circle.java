package ss5_access_modifier_static_method_static_property.excersice.circle;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    Circle() {

    }


    Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }
}
