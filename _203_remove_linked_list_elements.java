public class _203_remove_linked_list_elements {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode curNode = head;
        ListNode preNode = null;

        while(curNode != null) {
            if (curNode.val == val) {
                if (preNode == null) { // curNode is headNode
                    curNode = curNode.next;
                    head = curNode;
                } else {
                    preNode.next = curNode.next;
                    curNode = curNode.next;
                }
            } else {
                preNode = curNode;
                curNode = curNode.next;
            }
        }

        return head;
    }

    public static void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + "->");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // ListNode l1 = new ListNode(1);
        // ListNode l2 = new ListNode(2);
        // ListNode l3 = new ListNode(6);
        // ListNode l4 = new ListNode(3);
        // ListNode l5 = new ListNode(4);
        // ListNode l6 = new ListNode(5);
        // ListNode l7 = new ListNode(6);

        ListNode l1 = new ListNode(7);
        ListNode l2 = new ListNode(7);
        ListNode l3 = new ListNode(7);
        ListNode l4 = new ListNode(7);
        ListNode l5 = new ListNode(7);
        ListNode l6 = new ListNode(7);
        ListNode l7 = new ListNode(7);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;

        printLinkedList(l1);
        ListNode newList = removeElements(l1, 7);
        printLinkedList(newList);
    }
}
