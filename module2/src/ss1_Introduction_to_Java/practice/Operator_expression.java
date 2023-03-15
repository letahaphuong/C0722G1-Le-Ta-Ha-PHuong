package ss1_Introduction_to_Java.practice;

import java.util.Scanner;

public class Operator_expression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter width: ");
        float width = sc.nextFloat();
        System.out.print("Enter height: ");
        float height = sc.nextFloat();
        System.out.print("Area = " + width * height);
    }
}
