import java.util.Arrays;

public class SortSelection {
    public static void sortSelection(int[] arr){
        int min;//phần tử nhỏ nhất
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;//ghi nhận vị trí phần tử nhỏ nhất
                }
            }
            if (min != i) {
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
