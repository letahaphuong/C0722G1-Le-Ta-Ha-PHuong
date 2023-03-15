package ss5_access_modifier_static_method_static_property.practice.Static_Property;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1=new Car("Mazda 3","Skyactiv 3");
        System.out.println(Car.numberOfCars+" : "+car1.getName()+" "+car1.getEngine());
        Car car2=new Car("Mazda 6","Skyactiv 6");
        System.out.println(Car.numberOfCars+" : "+car2.getName()+" "+car2.getEngine());
    }
}
