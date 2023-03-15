package ss7_abstract_class_and_interface.excersice.interface_colorable;

public class Main {
    public static void main(String[] args) {
        Circle circle=new Circle(2);
        Rectangle rectangle=new Rectangle(3,4);
        Square square=new Square(5);

        Geometric[] arr={circle,rectangle,square};
        for (Geometric geometric:arr) {
            if (square.equals(geometric)){
                square.howToColor();
            }else{
                System.out.println(geometric.getArea());
            }
        }
    }
}
