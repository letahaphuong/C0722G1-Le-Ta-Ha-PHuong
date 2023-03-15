package ss14_sorting_algorithms.parctice;

public class SelectionSort {
    static double[] arr = {1, 9, 4.5, 6.6, 5.7, -4.5};

    public static void main(String[] args) {
        selectionSort(arr);
        System.out.println("Mảng của bạn là: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void selectionSort(double[] arr) {
        int min;//phần tử nhỏ nhất
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;//ghi nhận vị trí phần tử nhỏ nhất
                }
            }
            if (min != i) {
                double temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
