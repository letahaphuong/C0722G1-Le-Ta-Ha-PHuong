package ss5_access_modifier_static_method_static_property.excersice.circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Diện tích hình tròn là: "+circle.getArea()+"\nBán kính hình tròn là: "+circle.getRadius());
    }
}
