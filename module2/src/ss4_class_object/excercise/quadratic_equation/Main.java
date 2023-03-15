package ss4_class_object.excercise.quadratic_equation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = Double.parseDouble(sc.nextLine());
        System.out.print("Enter b: ");
        double b = Double.parseDouble(sc.nextLine());
        System.out.print("Enter c: ");
        double c = Double.parseDouble(sc.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant()>0){
            System.out.printf("Phương trình có 2 nghiệm phân biệt! x1 = %.2f ; x2= %.2f",quadraticEquation.getRoot1(),quadraticEquation.getRoot2());
        }else if(quadraticEquation.getDiscriminant()==0){
            System.out.printf("Phương trình có nghiệm kép! x1 = x2 = %.2f",quadraticEquation.getRoot1());
        }else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }
}
