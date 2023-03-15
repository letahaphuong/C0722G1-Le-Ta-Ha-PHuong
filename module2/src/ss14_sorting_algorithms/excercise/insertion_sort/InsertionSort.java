package ss14_sorting_algorithms.excercise.insertion_sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array={1,6,234,7,4,8,45,53};
        insertionSort(array);
    }
    public static void insertionSort(int[] arr) {
        int index, x;
        for (int i = 0; i < arr.length; i++) {
            x = arr[i];
            index = i;
            while (index > 0 && x < arr[index - 1]) {
                arr[index] = arr[index - 1];
                index--;
            }

            arr[index] = x;
            System.out.println("Vòng "+i+" : "+Arrays.toString(arr));
        }
    }
}
