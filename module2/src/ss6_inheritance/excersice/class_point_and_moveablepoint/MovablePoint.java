package ss6_inheritance.excersice.class_point_and_moveablepoint;

import java.util.Arrays;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint() {
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed, float x, float y) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[]{getXSpeed(),getYSpeed()};
    }

    @Override
    public String toString() {
//        return "A MovablePoint with "
//                + "(" + getX() +","+ getY() + ")" +
//                " Speed = "
//                + Arrays.toString(getSpeed());
        return "Toạ độ điểm này: "+
                String.format("(%.2f,%.2f),speed= (%.2f,%.2f)",getX(),getY(),xSpeed,ySpeed);

    }

    public MovablePoint move() {
        super.setX(getX()+this.xSpeed);
        super.setY(getY()+this.ySpeed);
        return this;
    }
}
