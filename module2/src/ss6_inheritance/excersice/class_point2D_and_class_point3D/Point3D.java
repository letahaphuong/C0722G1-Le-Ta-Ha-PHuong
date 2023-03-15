package ss6_inheritance.excersice.class_point2D_and_class_point3D;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {

    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float z, float x, float y) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.getXY();
        this.z = z;

    }

    public float[] getXYZ() {
        return new float[]{getX(), getY(), z};
    }
    @Override
    public String toString(){
        return "A Point3D with x= "
                +getX()
                +" with y= "
                +getY()
                +" with z= "
                +getZ()
                +" and array= "
                + Arrays.toString(getXYZ())
                ;
    }

}
