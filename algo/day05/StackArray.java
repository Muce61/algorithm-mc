package day05;

/**
 * @Description
 * @Author muse
 * @Date 2024/08/08
 **/
public class StackArray<T> {
    private T[] array;
    private int top;
    private int capacity;

    public StackArray(int capacity) {
        this.capacity = capacity;
        this.array = (T[]) new Object[capacity];
        this.top = -1;
    }

    public void push(T data) {
        if (isFull()) {
            throw new IllegalStateException("栈已满");
        }
        array[++top] = data;
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("空栈");
        }
        return array[top--];
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("空栈");
        }
        return array[top];
    }

    public boolean isFull() {
        if (top == capacity - 1) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        StackArray<Integer> stack = new StackArray<>(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Stack size: " + stack.size()); // Stack size: 3
        System.out.println("Stack peek: " + stack.peek()); // Stack peek: 3
        System.out.println("Stack pop: " + stack.pop()); // Stack pop: 3
        System.out.println("Stack peek: " + stack.peek()); // Stack peek: 2
        System.out.println("Stack size: " + stack.size()); // Stack size: 2

        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println("Stack is full: " + stack.isFull()); // Stack is full: true
    }
}
