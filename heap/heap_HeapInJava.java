package heap;

import java.util.PriorityQueue;
import java.util.Queue;

public class heap_HeapInJava {
    
    public static void main(String[] args) {
        Queue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(10);
        minHeap.add(100);
        minHeap.add(20);
        minHeap.add(3);
        minHeap.add(2);

        while (minHeap.isEmpty() == false) {
            System.out.println(minHeap.poll());
        }
        System.out.println();
        
    }
}
