package ss11_stack_queue.practice.practice1;

public class GenericStackClient {
    private static void stackOfIString() {
        MyGenericStack<String> stack = new MyGenericStack();
        stack.push("five");
        stack.push("four");
        stack.push("three");
        stack.push("two");
        stack.push("one");
        stack.push("zero");
        System.out.println("1.1. Size of stack after push operations: " + stack.size());
        System.out.println("1.2. Size of stack after push operations: ");
        while (!stack.isEmpty()) {
            System.out.printf(" %s", stack.pod());
        }
        System.out.println("n1.3 Size of stack after pop operations : " + stack.size());
    }

    private static void stackOfIntegers() {
        MyGenericStack<Integer> stack = new MyGenericStack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1. Size of stack after push operations: " + stack.size());
        System.out.println("2.2. Pop elements from stack : ");
        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pod());
        }
        System.out.println("3.3 Size of stack after pop operations : " + stack.size());
    }

    public static void main(String[] args) {
        System.out.println("1 Stack Of Integers");
        stackOfIntegers();
        System.out.println("2 Stack Of String");
        stackOfIString();
    }
}
