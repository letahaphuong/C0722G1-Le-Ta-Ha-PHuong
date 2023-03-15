package ss14_sorting_algorithms.parctice;

import java.util.Arrays;

public class BubbleSort {
  static int[] list={2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void main(String[] args) {
        bubbleSort(list);
        System.out.println(Arrays.toString(list));
    }

  public static void bubbleSort(int[] list){
      boolean needNextPass =true;
      for (int i = 1; i < list.length && needNextPass; i++) {
          needNextPass=false;
          for (int j = 0; j < list.length-i; j++) {
              if (list[j]>list[j+1]){
                  int temp =list[j];
                  list[j]=list[j+1];
                  list[j+1]=temp;
                  needNextPass=true;
              }
          }
      }
  }
}
