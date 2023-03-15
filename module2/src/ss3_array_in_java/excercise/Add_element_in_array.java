package ss3_array_in_java.excercise;

import java.util.Arrays;
import java.util.Scanner;

public class Add_element_in_array {
    public static void main(String[] args) {
        int[] array = {10, 4, 6, 7, 8, 0, 0, 0, 0};
        int x;
        int index;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X to add: ");
        x = Integer.parseInt(sc.nextLine());
        System.out.println("Enter index need add: ");
        index = Integer.parseInt(sc.nextLine());

        if (index <= -1 || index >= array.length - 1) {
            System.out.println("Can not add element in array: ");
        } else{
                for (int j = array.length - 1; j > index; j--) {
                    array[j] = array[j - 1];
                }
                array[index] = x;
            }
            System.out.print(Arrays.toString(array));
        }
    }



