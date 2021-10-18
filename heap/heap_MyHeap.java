package heap;

public class heap_MyHeap {
    private int MAX_SIZE = 100;
    private int[] arr = new int[MAX_SIZE + 1];
    private int size;

    heap_MyHeap() {
        size = 0;
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

        //heapify up
        int curIndex = size;
        int parrentIndex = curIndex / 2;

        while (this.arr[parrentIndex] > this.arr[curIndex] && parrentIndex > 0) {
            int temp = this.arr[parrentIndex];
            this.arr[parrentIndex] = this.arr[curIndex];
            this.arr[curIndex] = temp;

            curIndex = parrentIndex;
            parrentIndex = curIndex / 2;
        }
    }
}
