public class _141_linked_list_cycle {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        } 
        if (head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while(slow != null && fast != null) {
            slow = slow.next;
            fast = fast.next;

            if (fast == null) {
                return false;
            }

            fast = fast.next;
            if (fast == slow) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(0);
        ListNode n4 = new ListNode(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2;

        boolean result = hasCycle(n1);
        System.out.println(result);
    }
}
