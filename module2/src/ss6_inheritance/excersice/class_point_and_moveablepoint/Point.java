package ss6_inheritance.excersice.class_point_and_moveablepoint;

import java.util.Arrays;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        return new float[]{x, y};
    }
    @Override
    public String toString(){
//        return "A Point with x= "
//                +getX()
//                +" y= "
//                +getY()
//                +"and (x,y)"
//                + Arrays.toString(getXY());
        return "Điểm này có toạ độ: "+ String.format("(%.2f,%.2f)",x,y);
    }
}
