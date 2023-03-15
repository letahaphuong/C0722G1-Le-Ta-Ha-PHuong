package ss6_inheritance.excersice.class_circle_and_class_cylinder;

public class Circle {
    private double radius;
    private String color;

    public Circle(double radius) {
    }

    public Circle(double radius, String color, boolean filled) {
    }

    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }
    public Circle(){

    }
    public Circle(double radius,String color){
        this.radius=radius;
        this.color=color;
    }
    public double getArea(){
        return Math.pow(radius,2)*Math.PI;
    }
    @Override
    public String toString(){
        return "A Circle with radius of "
                +getRadius()
                +" and Area = "
                +getArea()
                +"(m2) and color "
                +getColor();
    }
}
