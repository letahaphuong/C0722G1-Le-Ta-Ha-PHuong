package ss4_class_object.excercise.fan_build;

public class Main {
    public static void main(String[] args) {
        Fan fan1=new Fan();
        Fan fan2=new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setRunning(true);

        fan2.setSpeed(fan2.MEDIUM);

        System.out.println("Fan 1 Status"+fan1);
        System.out.println("Fan 2 Status"+fan2);
    }
}



