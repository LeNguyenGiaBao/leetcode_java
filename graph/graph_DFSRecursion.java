package graph;

import java.util.HashSet;
import java.util.Set;

public class graph_DFSRecursion {

    public static void DFS(int u, int[][] graph, Set<Integer> isProcessed) {
        // process u
        System.out.print(u + " ");

        // process the neighboor of u
        for (int v = 0; v < graph.length; v++) {
            if( graph[u][v] == 1 && isProcessed.contains(v) == false) {
                isProcessed.add(v);
                DFS(v, graph, isProcessed);
            }
        }
    }
    public static void main(String[] args) {
        int[][] graph = {   {0, 1, 0, 0, 0, 0, 0}, 
                            {1, 0, 1, 1, 1, 0, 0}, 
                            {0, 1, 0, 0, 0, 1, 0}, 
                            {0, 1, 0, 0, 0, 1, 1}, 
                            {0, 1, 0, 0, 0, 0, 1}, 
                            {0, 0, 1, 1, 0, 0, 0}, 
                            {0, 0, 0, 1, 1, 0, 0}};

        // declare variable
        Set<Integer> isProcessed = new HashSet<>();

        // init
        isProcessed.add(0);

        // recursion
        DFS(0, graph, isProcessed);

        System.out.println();
    }
}
