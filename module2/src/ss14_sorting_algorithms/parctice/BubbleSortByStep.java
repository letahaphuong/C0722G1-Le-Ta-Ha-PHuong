package ss14_sorting_algorithms.parctice;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập size: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] list = new int[size];
        System.out.println("Nhập phần tử: ");
        for (int i = 0; i < size; i++) {
            list[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Danh sách của bạn: ");
        for (int i = 0; i < size; i++) {
            System.out.print(list[i] + " ");
        }
        bubbleSortByStep(list);
    }

    public static void bubbleSortByStep(int[] list) {
        boolean needNextPass = true;
        for (int i = 1; i < list.length && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < list.length - 1; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    needNextPass = true;
                }
            }
            if (needNextPass == false) {
                System.out.println("Mảng có lẽ đã được sắp xếp và ko cần sắp xếp!");
                break;
            }
            System.out.println("Danh sach sau khi sắp xếp!");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + " ");
            }
        }

    }
}
