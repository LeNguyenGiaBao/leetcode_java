public class _2_add_two_numbers {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int miss = 0;
        int sum = l1.val + l2.val;
        if (sum > 9) {
            sum -= 10;
            miss =1;
        } else {
            miss = 0;
        }

        ListNode result = new ListNode(sum);
        ListNode curNode = result;
        l1 = l1.next;
        l2 = l2.next;
        while (l1 != null && l2 != null) {
            sum = l1.val + l2.val + miss;
            if (sum > 9) {
                sum -= 10;
                miss =1;
            } else {
                miss = 0;
            }

            ListNode step = new ListNode(sum);
            curNode.next = step;
            curNode = step;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            sum = l1.val + miss;
            if (sum > 9) {
                sum -= 10;
                miss =1;
            } else {
                miss = 0;
            }

            ListNode step = new ListNode(sum);
            curNode.next = step;
            curNode = step;
            l1 = l1.next;
        }
        while (l2 != null) {
            sum = l2.val + miss;
            if (sum > 9) {
                sum -= 10;
                miss =1;
            } else {
                miss = 0;
            }

            ListNode step = new ListNode(sum);
            curNode.next = step;
            curNode = step;
            l2 = l2.next;
        }
        if (miss == 1) {
            ListNode step = new ListNode(1);
            curNode.next = step;
            curNode = step;
        }

        return result;
    }

    public static void printListNode(ListNode head) {
        while (head != null) {
            System.out.print(head.val + "->");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(4);
        ListNode n3 = new ListNode(3);
        n1.next = n2;
        n2.next = n3;

        ListNode n4 = new ListNode(5);
        ListNode n5 = new ListNode(6);
        ListNode n6 = new ListNode(4);
        n4.next = n5;
        n5.next = n6;

        printListNode(n1);
        printListNode(n4);

        ListNode sum = addTwoNumbers(n1, n4);
        printListNode(sum);
    }
}
