public class sq_ArrayQueue implements sq_IStackQueue{

    private int[] array;
    private int SIZE; 
    private int headIndex;
    private int tailIndex; 

    sq_ArrayQueue(int size) {
        this.SIZE = size;
        this.array = new int[SIZE];
        this.headIndex = -1;
        this.tailIndex = -1;
    }

    @Override
    public boolean push(int value) {
        // TODO Auto-generated method stub
        if (!this.isFull()) {
            if (this.isEmpty()) {
                this.headIndex++;
            }
            this.tailIndex++;
            this.array[this.tailIndex] = value;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        // TODO Auto-generated method stub
        int value = -1; // -1 is not found
        if (!this.isEmpty()) {
            value = this.array[this.headIndex];
            headIndex++;

            if (this.headIndex > this.tailIndex) { // queue has no element
                this.headIndex = this.tailIndex = -1;
            }
        }
        return value;
    }

    @Override
    public boolean isFull() {
        // TODO Auto-generated method stub
        return this.tailIndex == this.SIZE-1;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return (this.headIndex == -1 && this.tailIndex == -1);
    }

    @Override
    public void show() {
        // TODO Auto-generated method stub
        if (this.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            for (int i = this.headIndex; i <= this.tailIndex; i++) {
                System.out.print(this.array[i] + " ");
            }
            System.out.println();
        }
    }
    
}
