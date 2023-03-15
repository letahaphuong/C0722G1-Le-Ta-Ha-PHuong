package ss3_array_in_java.practice;

import java.util.Scanner;

public class Find_maxvalue_in_array {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a size: ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Size should not exceed 20 ");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + " : ");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.print("List: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j;
            }
        }
        System.out.println("The element max in list is: " + max + " at index: " + index);
    }
}
