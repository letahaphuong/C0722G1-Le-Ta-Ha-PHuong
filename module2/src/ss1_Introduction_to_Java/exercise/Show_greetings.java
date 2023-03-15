package ss1_Introduction_to_Java.exercise;

import java.util.Scanner;

public class Show_greetings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Hello : "+ name);
    }
}
