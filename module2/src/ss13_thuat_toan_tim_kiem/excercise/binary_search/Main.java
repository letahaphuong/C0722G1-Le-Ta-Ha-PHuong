package ss13_thuat_toan_tim_kiem.excercise.binary_search;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        int k;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size : ");
            size = Integer.parseInt(scanner.nextLine());
            if (size > 20) {
                System.out.println("Size should not exceed 20");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Enter element " + (i + 1) + " in array: ");
            array[i] = Integer.parseInt(scanner.nextLine());
            i++;
        }

        System.out.println("Nhập số bạn cần kiểm tra: ");
        k  = Integer.parseInt(scanner.nextLine());

        BinarySearch.sortASC(array);
        System.out.println(Arrays.toString(array));

        int index = BinarySearch.binarySearch(array, k, 0, array.length - 1);
        System.out.println(index);
    }
}
