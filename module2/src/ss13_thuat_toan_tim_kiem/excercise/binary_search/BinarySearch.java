package ss13_thuat_toan_tim_kiem.excercise.binary_search;

public class BinarySearch {
    static int binarySearch(int[] arr, int k, int left, int right) {
        if (right >= left) {
            int mid = (right + left) / 2;
            if (arr[mid] == k) {
                return mid;
            }
            if (k<arr[mid]) {
                return binarySearch(arr, k, left, right-1);
            }
            return binarySearch(arr, k, left+1, right);
        }
        return -1;
    }
    static void sortASC(int [] arr) {
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}
