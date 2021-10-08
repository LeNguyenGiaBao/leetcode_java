import java.util.Stack;

public class _234_palindrome_linked_list {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static int countNode(ListNode head) {
        int count = 0;

        while (head != null) {
            count ++;
            head = head.next;
        }

        return count;
    }

    public static ListNode reverseListNode(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode currentNode = head;
        while (currentNode.next !=null) {
            ListNode nextNode = currentNode.next;
            currentNode.next = nextNode.next;
            nextNode.next = head;
            head = nextNode;
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

    public static boolean isPalindrome(ListNode head) {
        int n = countNode(head);
        if (n < 2) {
            return true;
        }
        
        // k is the the index of the right child
        // 1->2->1      k=2
        // 1->2->2->1   k=2
        // 1->2->4->2->1    k=3
        int k = (int) Math.ceil((double) n/2);  // 2.5 = 3
        int curIndex = 0;
        ListNode curNode = head;
        while (curNode != null) {
            if (curIndex == k) {
                break;
            }

            curIndex++;
            curNode = curNode.next;
        }

        ListNode reverseNode = reverseListNode(curNode);
        while (reverseNode != null) {
            if (reverseNode.val != head.val) {
                return false;
            }

            reverseNode = reverseNode.next;
            head = head.next;
        }
        return true;   
    }

    public static boolean isPalindrome_Stack(ListNode head) {
        int n = countNode(head);
        if (n < 2) {
            return true;
        }

        int startPop = 0;
        int endPush = 0;
        if (n % 2 == 0) {
            endPush = n/2 - 1;
            startPop = n/2;
        } else {
            endPush = n/2 - 1;
            startPop = n/2 +1;
        }

        int curIndex = 0;
        ListNode curNode = head;
        Stack<Integer> stack = new Stack<>();
        while (curNode != null) {
            if (curIndex <= endPush) {
                stack.push(curNode.val);
            }

            if (curIndex >= startPop) {
                int val = stack.pop();
                if (val != curNode.val) {
                    return false;
                }
            }
            curIndex++;
            curNode = curNode.next;
        }
        return true;
    }


    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        // System.out.println(isPalindrome(n1));
        System.out.println(isPalindrome_Stack(n1));
    }
}
