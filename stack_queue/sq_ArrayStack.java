package stack_queue;
public class sq_ArrayStack implements sq_IStackQueue {

    private int[] array;
    private int SIZE;
    private int topIndex;

    sq_ArrayStack(int size) {
        this.SIZE = size;
        this.array = new int[this.SIZE];
        this.topIndex = -1;
    }

    @Override
    public boolean push(int value) {
        // TODO Auto-generated method stub
        if(!this.isFull()) {
            this.topIndex++;
            array[topIndex] = value;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        // TODO Auto-generated method stub
        if (!this.isEmpty()) {
            int value = this.array[this.topIndex];
            this.topIndex--;
            return value;
        }
        return -1;
    }

    @Override
    public boolean isFull() {
        // TODO Auto-generated method stub
        return this.topIndex == this.SIZE-1;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return topIndex<0;
    }

    @Override
    public void show() {
        // TODO Auto-generated method stub
        if (this.isEmpty()) {
            System.out.println("Stack is empty!");
        } else {
            for (int i = 0; i <= this.topIndex; i++) {
                System.out.print(this.array[i] + " ");
            }
            System.out.println();
        }
    }
    
}
