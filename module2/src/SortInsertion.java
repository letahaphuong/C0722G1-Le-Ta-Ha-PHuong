import java.util.Arrays;

public class SortInsertion {
    public static void sortInsertion(int[] arr) {
        int pos, x;
        for (int i = 1; i < arr.length; i++) {//đoạn này arr[0] đã sắp xếp
            x = arr[i];
            pos = i;
            while (pos > 0 && x < arr[pos - 1]) {
                arr[pos] = arr[pos - 1];//đổi chổ
                pos--;
            }
            arr[pos] = x;

        }
    }
}
