package day04;

/**
 * @Description
 * @Author muse
 * @Date 2024/08/07
 **/
public class Stack<T> {
    private DoubleListNode<T> head;
    private int size;

    public Stack() {
        this.head = null;
        this.size = 0;
    }

    public void push(T data) {
        DoubleListNode<T> newNode = new DoubleListNode<T>(data);
        if (head != null) {
            head.prev = newNode;
            newNode.next = head;
        }

        head = newNode;
        size++;
    }

    public T pop() {
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