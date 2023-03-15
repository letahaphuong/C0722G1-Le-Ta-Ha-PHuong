package ss7_abstract_class_and_interface.pratice.pratice_interface_comparable;

import ss6_inheritance.practice.shape_object.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle c1,Circle c2){
        if (c1.getRadius()>c1.getRadius())
            return 1;
        else if (c1.getRadius()<c2.getRadius())
            return -1;
        else
            return 0;
    }

}
