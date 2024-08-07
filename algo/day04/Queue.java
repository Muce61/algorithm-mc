package day04;

/**
 * @Description
 * @Author muse
 * @Date 2024/08/07
 **/
public class Queue<T> {
    private DoubleListNode<T> head;
    private DoubleListNode<T> tail;
    private int size;

    public Queue() {
        this.head = null;
        this.size = 0;
    }

    public void enqueue(T data) {
        DoubleListNode<T> newNode = new DoubleListNode<T>(data);
        if (tail != null) {
            tail.next = newNode;
            newNode.prev = tail;
        }
        tail = newNode;

        if (head == null) {
            head = tail;
        }
        size++;
    }

    public T dequeue() {
        if (head == null) {
            throw new IllegalStateException("Stack is empty");
        }
        T data = head.data;
        head = head.next;
        if (head != null) {
            head.prev = null;
        }
        size--;
        return data;
    }

    public T peek() {
        if (head == null) {
            throw new IllegalStateException("Stack is empty");
        }
        return head.data;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }
}
