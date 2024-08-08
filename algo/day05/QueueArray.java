package day05;

/**
 * @Description
 * @Author muse
 * @Date 2024/08/08
 **/
public class QueueArray<T> {
    private T[] array;
    private int front;
    private int tail;
    private int size;
    private int capacity;

    public QueueArray(int capacity) {
        this.capacity = capacity;
        this.front = -1;
        this.tail = -1;
        this.size = 0;
        this.array = (T[]) new Object[capacity];
    }

    public void enqueue(T data) {
        if (isFull()) {
            throw new IllegalStateException("队列已满");
        }
        tail = (tail + 1) % capacity;
        array[tail] = data;
        if (front == -1) {
            front = tail;
        }
        size++;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("空队列");
        }
        T res = array[front];
        array[front] = null;
        front = (front + 1) % capacity;
        size--;
        if (size == 0) {
            tail = -1;
            front = -1;
        }
        return res;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("空队列");
        }
        return array[front];
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        QueueArray<Integer> queue = new QueueArray<>(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("Queue size: " + queue.size()); // Queue size: 3
        System.out.println("Queue peek: " + queue.peek()); // Queue peek: 1
        System.out.println("Queue dequeue: " + queue.dequeue()); // Queue dequeue: 1
        System.out.println("Queue peek: " + queue.peek()); // Queue peek: 2
        System.out.println("Queue size: " + queue.size()); // Queue size: 2

        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        System.out.println("Queue is full: " + queue.isFull()); // Queue is full: true
    }
}
