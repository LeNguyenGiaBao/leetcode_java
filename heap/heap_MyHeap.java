package heap;

public class heap_MyHeap {
    private int MAX_SIZE = 100;
    private int[] arr = new int[MAX_SIZE + 1];
    private int size;

    heap_MyHeap() {
        size = 0;
    }

    private void swap(int i, int j) {
        int temp = this.arr[i];
        this.arr[i] = this.arr[j];
        this.arr[j] = temp;
    }

    public boolean isEmpty() {
        return this.size <= 0;
    }

    public int peek() {
        if (this.isEmpty()) {
            System.out.println("Heap is empty");
        }
        return this.arr[1];
    }

    public void add(int v) {
        this.size++;
        this.arr[size] = v;

        // heapify up
        int curIndex = size;
        int parrentIndex = curIndex / 2;

        while (this.arr[parrentIndex] > this.arr[curIndex] && parrentIndex > 0) {
            swap(parrentIndex, curIndex);

            curIndex = parrentIndex;
            parrentIndex = curIndex / 2;
        }
    }

    public int poll() {
        if (this.isEmpty()) {
            System.out.println("Heap is empty");
            return -1;
        }

        int minRoot = this.arr[1];

        // heapify down  
        this.arr[1] = this.arr[this.size];
        this.size --;

        heapifyDown(1); // heapify at root (1)
        
        
        return minRoot;
    }

    private void heapifyDown(int curIndex) {
        int leftChild = curIndex * 2;
        while (leftChild <= this.size) {
            int smallerChild = leftChild;
            int rightChild = leftChild + 1;
            if (rightChild <= this.size && this.arr[rightChild] < this.arr[leftChild]) {
                smallerChild = rightChild;
            }

            if (this.arr[curIndex] > this.arr[smallerChild]) { // parent > child-> need to modify
                swap(curIndex, smallerChild);
                curIndex = smallerChild;
                leftChild = curIndex * 2;
            } else {
                break;
            }
        }
    }

    public void remove (int v) {
        int curIndex = -1;
        for (int i = 0; i < this.arr.length; i++) {
            if (this.arr[i] == v) {
                curIndex = i;
            }
        }

        if (curIndex == -1) {
            System.out.println("This element is not exist");
            return;
        }

        this.arr[curIndex] = this.arr[this.size];
        this.size--;

        // heapify - down
        heapifyDown(curIndex);
    }

    public static void main(String[] args) {
        heap_MyHeap myHeap = new heap_MyHeap();
        myHeap.add(10);
        myHeap.add(5);
        myHeap.add(1);
        myHeap.add(6);

        // poll
        // while (myHeap.isEmpty() == false) {
        //     System.out.println(myHeap.poll());
        // }

        System.out.println("Peek: " + myHeap.peek()); // 1
        myHeap.remove(1);
        System.out.println("Peek: " + myHeap.peek()); // 5
        myHeap.remove(6);

        while (myHeap.isEmpty() == false) {
            System.out.println(myHeap.poll());
        } // 5 10
    }
}
