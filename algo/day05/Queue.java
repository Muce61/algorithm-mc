package day05;

/**
 * @Description
 * @Author muse
 * @Date 2024/08/08
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
        DoubleListNode<T> newData = new DoubleListNode<T>(data);
        if (head != null) {
            tail.next = newData;
            newData.prev = tail;
        }
        tail = newData;
        if (head == null) {
            head = tail;
        }
        size++;
    }

    public T dequeue() {
        if (head == null) {
            throw new IllegalStateException("队列为空");
        }

        T data = head.data;
        size--;
        head = head.next;

        if (head != null) {
            head.prev = null;
        }

        return data;
    }

    public T peek() {
        if (head == null) {
            throw new IllegalStateException("队列为空");
        }
        return head.data;
    }

    public int size() {
        return size;
    }

}
