package day05;

/**
 * @Description
 * @Author muse
 * @Date 2024/08/08
 **/
public class Stack<T> {
    private DoubleListNode<T> head;
    private int size;

    public Stack() {
        this.head = null;
        this.size = 0;
    }

    public void push(T data) {
        DoubleListNode<T> newData = new DoubleListNode<>(data);
        if (head != null) {
            head.prev = newData;
            newData.next = head;
        }

        head = newData;
        size++;
    }

    public T pop() {
        if (head == null) {
            throw new IllegalStateException("");
        }

        T data = head.data;
        head = head.next;
        size--;

        return data;
    }

    public T peek() {
        if (head == null) {
            throw new IllegalStateException("");
        }

        return head.data;
    }
    public int size() {
        return size;
    }
}
