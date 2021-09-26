package stack_queue;
public class sq_LinkedListQueue implements sq_IStackQueue{

    private class Node {
        int value;
        Node next;
        Node(int value) { this.value = value; }
    }
    private Node headNode;
    private Node tailNode;

    sq_LinkedListQueue() {
        this.headNode = this.tailNode = null;
    }

    @Override
    public boolean push(int value) {
        // TODO Auto-generated method stub
        if (!this.isFull()) {
            Node newNode = new Node(value);
            if(this.isEmpty()) {
                this.headNode = this.tailNode = newNode;
            } else {
                this.tailNode.next = newNode;
                this.tailNode = newNode;
            }
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        // TODO Auto-generated method stub
        if (this.isEmpty()) {
            return -1;
        }
        int value = this.headNode.value;

        if (this.headNode == this.tailNode) {
            this.headNode = this.tailNode = null;
        } else {
            this.headNode = this.headNode.next;
        }
        
        return value;
    }

    @Override
    public boolean isFull() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return (this.headNode == null && this.tailNode == null);
    }

    @Override
    public void show() {
        // TODO Auto-generated method stub
        if (this.isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        Node temp = this.headNode;
        while (temp != null) {
            System.out.print(temp.value + "<-");
            temp = temp.next;
        }
        System.out.println();
    }
    
}
