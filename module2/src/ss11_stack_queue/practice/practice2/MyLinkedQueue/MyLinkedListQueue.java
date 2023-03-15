package ss11_stack_queue.practice.practice2.MyLinkedQueue;

import ss11_stack_queue.practice.practice2.Node.Node;

public class MyLinkedListQueue {
    private Node head;
    private Node tail;

    public MyLinkedListQueue(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
    }

    public MyLinkedListQueue() {

    }

    public void enqueue(int key) {
        Node temp = new Node(key);
        if (this.tail == null) {
            this.head = this.tail = temp;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
    }

    public Node dequeue() {
        Node temp = this.head;
        if (this.head == null) {
            return null;
        } else {

            this.head = this.head.next;
        }
        if (this.head == null) {
            this.tail = null;
        }
        return temp;
    }
}
