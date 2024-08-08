package day05;


/**
 * @Description
 * @Author muse
 * @Date 2024/08/07
 **/
public class Test {
    public static void main(String[] args) {
        // 测试栈
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Stack size: " + stack.size()); // Stack size: 3
        System.out.println("Stack pop: " + stack.pop());  // Stack pop: 3
        System.out.println("Stack peek: " + stack.peek()); // Stack peek: 2

        // 测试队列
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("Queue size: " + queue.size()); // Queue size: 3
        System.out.println("Queue dequeue: " + queue.dequeue()); // Queue dequeue: 1
        System.out.println("Queue peek: " + queue.peek()); // Queue peek: 2
    }
}
