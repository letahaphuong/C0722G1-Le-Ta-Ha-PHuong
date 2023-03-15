package ss11_stack_queue.excercise.element_swap_use_stack;


import java.util.LinkedList;
import java.util.Stack;

public class SwapElementInteger {
    public static void main(String[] args) {
        Stack<Integer> beforeStack = new Stack<>();
        Stack<Integer> afterStack = new Stack<>();
//        beforeStack = new Stack<>();
//        beforeStack.push(1);
//        beforeStack.push(2);
//        beforeStack.push(3);
//        beforeStack.push(4);
//        beforeStack.push(5);
        for (int i = 1; i <= 5; i++) {
            beforeStack.push(i);
        }
        System.out.println("Trước khi Swap: "+beforeStack);
//        afterStack.push(beforeStack.pop());
//        afterStack.push(beforeStack.pop());
//        afterStack.push(beforeStack.pop());
//        afterStack.push(beforeStack.pop());
//        afterStack.push(beforeStack.pop());
//        System.out.println(stack1);
        for (int i = 0; i < beforeStack.size() + i; i++) {
            afterStack.push(beforeStack.pop());
        }
        System.out.println("Sau khi Swap: "+afterStack);

    }
}


