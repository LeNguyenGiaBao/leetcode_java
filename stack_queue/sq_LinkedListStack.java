package stack_queue;
public class sq_LinkedListStack implements sq_IStackQueue{

    private class Node {
        int value;
        Node next;
        Node (int value) { this.value = value; }
    }
    private Node topNode;

    sq_LinkedListStack() {
        this.topNode = null;
    }

    @Override
    public boolean push(int value) {
        // TODO Auto-generated method stub
        // equal with add to head
        Node newNode = new Node(value);
        if (!this.isFull()) {
            newNode.next = this.topNode;
            this.topNode = newNode;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        // TODO Auto-generated method stub
        if (!this.isEmpty()) {
            Node valNode = this.topNode;
            this.topNode = this.topNode.next;
            return valNode.value;
        }
        return -1;
    }

    @Override
    public boolean isFull() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return this.topNode == null;
    }

    @Override
    public void show() {
        // TODO Auto-generated method stub
        if (this.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        Node tempNode = this.topNode;
        while (tempNode!=null) {
            System.out.print(tempNode.value + "->");
            tempNode = tempNode.next;
        }
        System.out.println();
    }
    
}
