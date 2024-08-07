package day03;

/**
 * @Description
 * @Author muse
 * @Date 2024/08/06
 **/
public class SingleLinkedList {
    public ListNode test(ListNode head, int num) {
        while (head != null) {
            if (head.val != num) {
                break;
            }
            head = head.next;
        }

        ListNode prev = head;
        ListNode curr = head;

        while (curr != null) {
            if (curr.val == num) {
                prev.next = curr.next;
            } else {
                prev = curr;
            }
            curr = curr.next;
        }

        return head;
    }


    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static ListNode remove(ListNode head, int num) {
        while (head != null) {
            if (head.val != num) {
                break;
            }
            head = head.next;
        }

        ListNode prev = head;
        ListNode curr = head;

        while (curr != null) {
            if (curr.val == num) {
                prev.next = curr.next;
            } else {
                prev = curr;
            }
            curr = curr.next;
        }

        return head;
    }

    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original list:");
        list.printList(head);

        head = list.reverseList(head);

        System.out.println("Reversed list:");
        list.printList(head);

        System.out.println("删除的结果：");
        ListNode test = list.test(head, 5);
        list.printList(test);
    }
}
