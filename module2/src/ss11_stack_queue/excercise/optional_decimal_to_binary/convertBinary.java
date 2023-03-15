package ss11_stack_queue.excercise.optional_decimal_to_binary;

import java.util.Scanner;
import java.util.Stack;

public class convertBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> array = new Stack<>();
        System.out.println("Nhập số muốn chuyển: ");
        int num = Integer.parseInt(scanner.nextLine());
        while (num > 0) {
            array.push(num%2);
            num = num / 2;
        }
        System.out.println("Giá trị nhị phân là: ");
        while (!(array.isEmpty())) {
            System.out.print(array.pop());
        }
    }
}
