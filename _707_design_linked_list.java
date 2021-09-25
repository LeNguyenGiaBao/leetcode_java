public class _707_design_linked_list {
    public static class SinglyListNode {
        int val;
        SinglyListNode next;
        SinglyListNode(int x) { val = x; }
    }

    static class MyLinkedList {

        private SinglyListNode head;

        /** Initialize your data structure here. */
        public MyLinkedList() {
            this.head = null;
        }
        
        /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
        public int get(int index) {
            SinglyListNode temp = this.head;
            int count = 0;
            
            while (temp!=null) {
                if (count == index) {
                    return temp.val;
                }

                count++;
                temp = temp.next;
            }
            return -1;
        }
        
        /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
        public void addAtHead(int val) {
            SinglyListNode newNode = new SinglyListNode(val);
            newNode.next = this.head;
            this.head = newNode;
        }
        
        /** Append a node of value val to the last element of the linked list. */
        public void addAtTail(int val) {
            SinglyListNode newNode = new SinglyListNode(val);

            if (this.head == null) {
                this.head = newNode;
            } else {
                SinglyListNode lastNode = this.head;
                while(lastNode.next != null) {
                    lastNode = lastNode.next;
                }

                lastNode.next = newNode;
            }
        }
        
        /** Add a node of value val before the index-th node in the linked list. 
         * If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
        public void addAtIndex(int index, int val) {
            if (index == 0) {
                addAtHead(val);
            } else {
                SinglyListNode curNode = this.head;
                SinglyListNode newNode = new SinglyListNode(val);
                int count = 0;
                while(curNode.next != null) {
                    count++;
                    if (count == index) {
                        newNode.next = curNode.next;
                        curNode.next = newNode;
                        return;
                    }

                    curNode = curNode.next;
                }
                if (count+1 == index) {
                    addAtTail(val);
                }
            }
        }
        
        /** Delete the index-th node in the linked list, if the index is valid. */
        public void deleteAtIndex(int index) {
            SinglyListNode curNode = this.head;
            SinglyListNode prevNode = null;
            int count = 0;

            while (curNode != null) {
                if (count == index) {
                    if (prevNode == null) { //index = 0, delete at head
                        this.head = curNode.next;
                    } else {
                        prevNode.next = curNode.next;
                        return;
                    }
                }
                count++;
                prevNode = curNode;
                curNode = curNode.next;
            }
        }
        
        public void printLinkedList() {
            SinglyListNode temp = this.head;
            while (temp != null) {
                System.out.print(temp.val + "->");
                temp = temp.next;
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        // MyLinkedList myLinkedList = new MyLinkedList();
        // myLinkedList.addAtHead(1);
        // myLinkedList.printLinkedList();
        // myLinkedList.addAtTail(3);
        // myLinkedList.printLinkedList();
        // myLinkedList.addAtIndex(1, 2);    // linked list becomes 1->2->3
        // myLinkedList.printLinkedList();
        // System.out.println(myLinkedList.get(1));              // return 2
        // myLinkedList.deleteAtIndex(1);    // now the linked list is 1->3
        // myLinkedList.printLinkedList();
        // System.out.println(myLinkedList.get(1));              // return 3


        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(7);
        myLinkedList.printLinkedList();
        myLinkedList.addAtHead(2);
        myLinkedList.printLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.printLinkedList();
        myLinkedList.addAtIndex(3, 0);
        myLinkedList.printLinkedList();
    }
}
