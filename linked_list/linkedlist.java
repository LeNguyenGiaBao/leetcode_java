package linked_list;
public class linkedlist {
    /**
     * Node
     */
    public static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public static void printLinkedList(Node head) {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = head;

            while (temp!=null) {
                System.out.print(temp.value);
                temp = temp.next;
                System.out.print("->");
            }
            System.out.println();
        }
    }

    // ---------------------------- Add ------------------------
    public static Node addToHead(Node headNode, int value) {
        Node newNode = new Node(value);

        if (headNode!=null) {
            newNode.next = headNode;
        } 

        return newNode;
    }

    public static Node addToTail(Node headNode, int value) {
        Node newNode = new Node(value);

        if(headNode!=null) {
            Node lastNode = headNode;
            while(lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
        
        return headNode;
    }

    public static Node addToIndex(Node headNode, int value, int index) {
        if (index == 0) {
            return addToHead(headNode, value);
        } else {
            Node newNode = new Node(value);

            //find index to add
            Node currentNode = headNode;
            int count = 0;

            while(currentNode.next!=null) {
                count++;
                if(count == index) {
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                    break;
                } else {
                    currentNode = currentNode.next;
                }
            }
        }
        return headNode;
    }


    // ---------------------------------- Remove ---------------------------
    public static Node removeAtHead(Node headNode) {
        if (headNode!=null) {
            return headNode.next;
        }
        return headNode;
    }

    public static Node removeAtTail(Node headNode) {
        if (headNode != null) {
            Node lastNode = headNode;
            Node prevNode = null;
            while (lastNode.next != null) {
                prevNode = lastNode;
                lastNode = lastNode.next;
            }
            
            if (prevNode==null) {
                return null;
            } else {
                prevNode.next = lastNode.next;
            }
        }
        return headNode;
    }

    public static Node removeAtIndex(Node headNode, int index) {
        if (index == 0) {
            return removeAtHead(headNode);
        }
        if(headNode==null || index < 0) {
            return null;
        } 

        int count = 0;
        Node currentNode = headNode;
        while (currentNode.next!=null) {
            count++;
            if (count == index) {
                if (currentNode.next!= null) { // the node need remove exist
                    Node removeNode = currentNode.next;
                    if (removeNode.next ==null) {   //remove node is the last node
                        currentNode.next = null;
                    } else {
                        currentNode.next = removeNode.next;
                    }
                }
                break;
            }
            currentNode = currentNode.next;
        }
        
        return headNode;
    }


    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        n1.next = n2;
        n2.next = n3;

        printLinkedList(n1);
        // printLinkedList(n2);
        // printLinkedList(n3);

        // Node newListNode = addToHead(n1, 0);
        // printLinkedList(newListNode);

        // Node newListNode2 = addToTail(n1, 4);
        // printLinkedList(newListNode2);

        // Node newListNode3 = addToIndex(n1, 5, 2);
        // printLinkedList(newListNode3);

        // Node newListNode4 = removeAtHead(n1);
        // printLinkedList(newListNode4);

        // Node newListNode5 = removeAtTail(n3);
        // printLinkedList(newListNode5);

        // Node newListNode6 = removeAtIndex(n1, 2);
        // printLinkedList(newListNode6);

        n1 = removeAtIndex(n1, 0);
        printLinkedList(n1);
        n1 = removeAtIndex(n1, 1);
        printLinkedList(n1);
        n1 = removeAtIndex(n1, 1);
        printLinkedList(n1);
    }
}
