package ss6_inheritance.excersice.class_circle_and_class_cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {

    }
    public Cylinder(double height){
        this.height=height;
    }
    public Cylinder(double height,double radius,String color){
        super(radius, color);
        this.height=height;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double getHeight(){
        return height;
    }
    public double getAreaCylinder(){
        return Math.PI*Math.pow(getRadius(),2)*height;
    }
    @Override
    public String toString(){
        return "A Cylinder with radius = "
                +getRadius()
                +" and color: "
                +getColor()
                +" and Area = "
                +getAreaCylinder()
                +"(m3) which is a subclass of "
                +super.toString();
    }
}
