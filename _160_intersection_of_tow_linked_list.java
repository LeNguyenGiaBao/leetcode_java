public class _160_intersection_of_tow_linked_list {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + "->");
            head = head.next;
        }
        System.out.println();
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        while (headA != null) {
            ListNode temp = headB;
            while (temp != null) {
                if (headA == temp) {
                    return headA;
                }
                temp = temp.next;
            }
            headA = headA.next;
        }
        return null;
    }

    public static ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        ListNode pA = headA;
        ListNode pB = headB;

        while (pA != pB) {
            if(pA != null) {
                pA = pA.next;
            } else {
                pA = headB;
            }

            if(pB != null) {
                pB = pB.next;
            } else {
                pB = headA;
            }
        }
        return pA;
    }

    public static void main(String[] args) {
        ListNode a1 = new ListNode(4);
        ListNode a2 = new ListNode(1);
        ListNode a3 = new ListNode(8);
        ListNode a4 = new ListNode(4);
        ListNode a5 = new ListNode(5);
        ListNode a6 = new ListNode(5);
        ListNode a7 = new ListNode(6);
        ListNode a8 = new ListNode(1);

        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a6.next = a7;
        a7.next = a8;
        a8.next = a3;

        printLinkedList(a1);
        printLinkedList(a6);

        ListNode result = getIntersectionNode(a1, a6);
        printLinkedList(result);
    }
}
