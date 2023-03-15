package ss4_class_object.excercise.fan_build;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean running = false;
    private double radius = 5;
    private String color = "blue";

    @Override
    public String toString() {
        if (running){
            return "{" +
//                    "SLOW=" + SLOW +
//                    ", MEDIUM=" + MEDIUM +
//                    ", FAST=" + FAST +
                    " ==> Fan is on!"+
                    " speed=" + speed +
                    ", running=" + running +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }else {
            return "{" +
//                    "SLOW=" + SLOW +
//                    ", MEDIUM=" + MEDIUM +
//                    ", FAST=" + FAST +
//                    ", speed=" + speed +
//                    ", running=" + running +
                    " ==> Fan is off!"+
                    " radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }

    }

    public Fan() {//constructor Fan
    }
    //tạo setget

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
