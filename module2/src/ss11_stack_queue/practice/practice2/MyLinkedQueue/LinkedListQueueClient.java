package ss11_stack_queue.practice.practice2.MyLinkedQueue;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue queue=new MyLinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(66);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.dequeue();
//        queue.dequeue();
//        queue.dequeue();
        System.out.println("Dequeue item is: "+queue.dequeue().key);

    }
}
