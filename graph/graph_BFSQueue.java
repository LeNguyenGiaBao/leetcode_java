package graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class graph_BFSQueue {
    public static void main(String[] args) {
        int[][] graph = {   {0, 1, 0, 0, 0, 0, 0}, 
                            {1, 0, 1, 1, 1, 0, 0}, 
                            {0, 1, 0, 0, 0, 1, 0}, 
                            {0, 1, 0, 0, 0, 1, 1}, 
                            {0, 1, 0, 0, 0, 0, 1}, 
                            {0, 0, 1, 1, 0, 0, 0}, 
                            {0, 0, 0, 1, 1, 0, 0}};

        // declare variable
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> isProcessed = new HashSet<>();

        // init 
        queue.add(0);
        isProcessed.add(0);

        while (!queue.isEmpty()) {
            int u = queue.poll();

            // process u
            System.out.print(u + " ");

            for (int v = 0; v < graph.length; v++) {
                if (graph[u][v] == 1 && isProcessed.contains(v) == false) {
                    queue.add(v);
                    isProcessed.add(v);
                }
            }
        }

        System.out.println();
    }
}
