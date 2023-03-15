package ss11_stack_queue.practice.practice1;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {//tạo lớp MyGenericStack
    private LinkedList<T> stack;

    public MyGenericStack() {
        stack = new LinkedList();
    }

    public void push(T element) {//cài phương thức push
        stack.addFirst(element);
    }

    public T pod() {//cài đặt phương thức pod
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public int size() {//cài đặt phương thức size
        return stack.size();
    }

    public boolean isEmpty() {//cài đặt phương thức kiểm tra mảng trống hay không
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }


}

