package ss11_stack_queue.excercise.check_palindrome_use_queu;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeUseQueue {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhập chuỗi cần kiểm tra: ");
        String str = scanner.nextLine();
        str = str.toUpperCase();
        String[] array;
        array = str.split("");
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
            queue.offer(array[i]);
        }
        boolean isCheck = false;
        for (int i = 0; i < stack.size(); i++) {
            if (!queue.poll().equals(stack.pop())) {
                isCheck = false;
                break;
            }
            isCheck = true;
        }
        if (isCheck){
            System.out.println(str+" : là chuỗi palindrome");
        }else {
            System.out.println(str+" : không phải là chuỗi palindrome");
        }
    }
}
