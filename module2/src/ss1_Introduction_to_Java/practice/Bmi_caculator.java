package ss1_Introduction_to_Java.practice;

import java.util.Scanner;

public class Bmi_caculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("Enter your weight: ");
        weight = sc.nextDouble();
        System.out.print("Enter your height: ");
        height = sc.nextDouble();
        bmi = weight / Math.pow(height, 2);

//        if (bmi < 18.5) {
//            System.out.print(bmi + " Underweight!");
//        } else if (bmi < 25.0) {
//            System.out.print(bmi + " Normal!");
//        } else if (bmi < 30.0) {
//            System.out.print(bmi + " Overweight!");
//        } else {
//            System.out.print(bmi + " Obese!");
//        }
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");
        if (bmi < 18.5) {
            System.out.printf("%-20.2f%s", bmi , " Underweight!");
        } else if (bmi < 25.0) {
            System.out.printf("%-20.2f%s", bmi , " Normal!");
        } else if (bmi < 30.0) {
            System.out.printf("%-20.2f%s", bmi , " Overweight!");
        } else {
            System.out.printf("%-20.2f%s", bmi , " Obese!");
        }
    }
}
