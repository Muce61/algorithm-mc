package day04;

/**
 * @Description
 * @Author muse
 * @Date 2024/08/07
 **/
public class DoubleListNode<T> {
    T data;
    DoubleListNode<T> prev;
    DoubleListNode<T> next;
    DoubleListNode(T data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
