import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class _1046_last_stone_weight {
    public static int lastStoneWeight(int[] stones) {
        Queue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        // add all to heap
        for (int i = 0; i < stones.length; i++) {
            maxHeap.add(stones[i]);
        }

        // process
        while (maxHeap.size() >= 2) {
            int bigger = maxHeap.poll();
            int smaller = maxHeap.poll();

            if (bigger > smaller) {
                maxHeap.add(bigger - smaller);
            }
        }

        if (maxHeap.size() == 0) {
            return 0;
        }
        return maxHeap.poll();
    }

    public static void main(String[] args) {
        int[] stones = {2,7,4,1,8,1};

        int result = lastStoneWeight(stones);
        System.out.println(result);
    }
}
