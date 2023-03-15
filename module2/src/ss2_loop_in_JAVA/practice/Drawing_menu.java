package ss2_loop_in_JAVA.practice;

import java.util.Scanner;

public class Drawing_menu {
    public static void main(String[] args) {
        int choice = -1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Drawing triangle");
        System.out.println("2. Drawing square");
        System.out.println("3. Drawing rectangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Drawing triangle");
                System.out.println("******");
                System.out.println("*****");
                System.out.println("****");
                System.out.println("***");
                System.out.println("**");
                System.out.println("*");
                break;
            case 2:
                System.out.println("Drawing square");
                System.out.println("* * * * * * * *");
                System.out.println("* * * * * * * *");
                System.out.println("* * * * * * * *");
                System.out.println("* * * * * * * *");
                System.out.println("* * * * * * * *");
                System.out.println("* * * * * * * *");
                System.out.println("* * * * * * * *");
                break;
            case 3:
                System.out.println("Drawing rectangle");
                System.out.println("* * * * * * * * * * * * * * *");
                System.out.println("* * * * * * * * * * * * * * *");
                System.out.println("* * * * * * * * * * * * * * *");
                System.out.println("* * * * * * * * * * * * * * *");
                System.out.println("* * * * * * * * * * * * * * *");
                System.out.println("* * * * * * * * * * * * * * *");
                System.out.println("* * * * * * * * * * * * * * *");
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice!");
        }
    }
}
