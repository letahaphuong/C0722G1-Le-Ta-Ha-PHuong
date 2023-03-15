package ss3_array_in_java.excercise;

import java.util.Arrays;
import java.util.Scanner;

public class Merge_array {
    public static void main(String[] args) {
        int size1;
        int[] array1;
        int size2;
        int[] array2;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a size 1 : ");
            size1 = sc.nextInt();
            if (size1 > 20) {
                System.out.println("Size should not exceed 20");
            }
        } while (size1 > 20);
        array1 = new int[size1];
        int i = 0;
        while (i < size1) {
            System.out.print("Enter element " + (i + 1) + " in array1: ");
            array1[i] = sc.nextInt();
            i++;
        }
        System.out.print("Array1 list: ");
        System.out.print(Arrays.toString(array1));
        do {
            System.out.print("\nEnter a size 2 : ");
            size2 = sc.nextInt();
            if (size2 > 20) {
                System.out.println("Size should not exceed 20.");
            }
        } while (size2 > 20);
        array2 = new int[size2];
        int j = 0;
        while (j < size2) {
            System.out.print("Enter element " + (j + 1) + " in array2: ");
            array2[j] = sc.nextInt();
            j++;
        }
        System.out.println("Array2 list: ");
        System.out.print(Arrays.toString(array2));

        int[] array3 = new int[size1 + size2];

        for (int k = 0; k < array1.length; k++) {
            array3[k] = array1[k];
        }
        for (int k = 0; k < array2.length; k++) {
            array3[array1.length + k] = array2[k];
        }
        System.out.println("\nArray3 list: ");
        System.out.println(Arrays.toString(array3));
    }
}
