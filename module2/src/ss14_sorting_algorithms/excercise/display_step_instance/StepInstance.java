package ss14_sorting_algorithms.excercise.display_step_instance;

import java.util.Arrays;

public class StepInstance {
    static int[] array = {3, 5, 132, 6, 18, 9, 234, 2};

    public static void main(String[] args) {
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void insertSort(int[] arr) {
        int pos, x;
        for (int i = 1; i < arr.length; i++) {
            x = arr[i];
            pos = i;
            while (pos > 0 && x < arr[pos - 1]) {
                arr[pos] = arr[pos - 1];
                pos--;
            }
            arr[pos] = x;
        }
    }
}
