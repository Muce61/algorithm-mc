package day03;

/**
 * @Description
 * @Author muse
 * @Date 2024/08/06
 **/
public class DoubleLinkedList  {
    public DoubleListNode test(DoubleListNode head) {
        DoubleListNode curr = head;
        DoubleListNode temp = null;

        while (curr != null) {
            DoubleListNode next = curr.next;
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = next;
        }

        return temp.prev;
    }









    public DoubleListNode reverseList(DoubleListNode head) {
        DoubleListNode current = head;
        DoubleListNode temp = null;
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        return temp.prev;
    }

    public void printList(DoubleListNode head) {
        DoubleListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();

        DoubleListNode head = new DoubleListNode(1);
        head.next = new DoubleListNode(2);
        head.next.prev = head;
        head.next.next = new DoubleListNode(3);
        head.next.next.prev = head.next;
        head.next.next.next = new DoubleListNode(4);
        head.next.next.next.prev = head.next.next;
        head.next.next.next.next = new DoubleListNode(5);
        head.next.next.next.next.prev = head.next.next.next;

        System.out.println("Original list:");
        list.printList(head);

        head = list.test(head);

        System.out.println("Reversed list:");
        list.printList(head);
    }
}
