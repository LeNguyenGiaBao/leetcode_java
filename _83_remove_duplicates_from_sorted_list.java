import java.util.HashSet;

public class _83_remove_duplicates_from_sorted_list {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode currentNode = head;
        ListNode nextNode = currentNode.next;

        while (nextNode != null) {
            if (currentNode.val == nextNode.val) {
                currentNode.next = nextNode.next;
            } else {
                currentNode = nextNode;
            }
            
            if (currentNode != null) {
                nextNode = currentNode.next;
            } else {
                break;
            }
        }
        return head;
    }

    public static void printListNode(ListNode head) {
        while (head != null) {
            System.out.print(head.val + "->");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(1);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(3);
        ListNode n5 = new ListNode(3);
        
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        printListNode(n1);

        ListNode result = deleteDuplicates(n1);
        printListNode(result);
    }
}
