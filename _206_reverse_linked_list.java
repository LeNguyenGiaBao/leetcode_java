public class _206_reverse_linked_list {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void printLinkedList(ListNode head) {
        while(head != null) {
            System.out.print(head.val + "->");
            head = head.next;
        }
        System.out.println();
    }

    public static ListNode reverseList(ListNode head) {
        if (head==null) {
            return null;
        }

        ListNode currentNode = head;
        while (currentNode.next != null) {
            ListNode nextNode = currentNode.next;
            currentNode.next = nextNode.next;
            nextNode.next = head;
            head = nextNode;
        }

        return head;
    }

    public static ListNode reverseList_recursion(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode nextNode = head.next;
        if (nextNode == null) { // head has 1 node
            return head;
        }

        // recursion
        ListNode newHead = reverseList_recursion(nextNode);   // nextNode is the head of child node
        // after reverse, nextNode is tail of newHead
        nextNode.next = head;
        // head is the new tail
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);

        n1.next = n2;
        n2.next = n3;
        // printLinkedList(n1);
        // ListNode newNode = reverseList(n1);
        // printLinkedList(newNode);

        printLinkedList(n1);

        ListNode newNode_recursion = reverseList_recursion(n1);
        printLinkedList(newNode_recursion);
    }
}
