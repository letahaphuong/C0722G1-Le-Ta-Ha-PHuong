package ss6_inheritance.excersice.class_point_and_moveablepoint;

public class MovablePointTest {
    public static void main(String[] args) {
        MovablePoint movablePoint=new MovablePoint();
        System.out.println(movablePoint);
        movablePoint=new MovablePoint(4,5,6,7);
        System.out.println(movablePoint);
        System.out.println(movablePoint.move());
    }
}
