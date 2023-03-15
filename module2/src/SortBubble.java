import java.util.Arrays;

public class SortBubble {
    public static void sortBubble(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }
}

//public class sortBubble {
//    public static void sortBubble(int[] array) {
//        boolean needNextPass = true;
//        for (int i = 1; i < array.length && needNextPass; i++) {
//            needNextPass = false;
//            for (int j = 0; j < array.length - i; j--) {
//                if (array[j] < array[j - 1]) {
//                    int temp = array[j];
//                    array[j] = array[j - 1];
//                    array[j - 1] = temp;
//                    needNextPass = true;
//                }
//            }
//        }
//    }
//}
