package ss3_array_in_java.excercise;

import java.util.Arrays;
import java.util.Scanner;

public class Remove_element_in_array {
    public static void main(String[] args) {
        int X;
        int[] array = {10, 4, 6, 7, 8, 5, 6, 6, 0, 6};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element need remove: ");
        X = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (X == array[i]) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];

                }
                array[array.length - 1] = 0;
                i--;
            }

        }
        System.out.print(Arrays.toString(array));

    }
}

