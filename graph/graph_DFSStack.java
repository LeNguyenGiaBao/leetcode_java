package graph;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class graph_DFSStack {
    public static void main(String[] args) {
        int[][] graph = {   {0, 1, 0, 0, 0, 0, 0}, 
                            {1, 0, 1, 1, 1, 0, 0}, 
                            {0, 1, 0, 0, 0, 1, 0}, 
                            {0, 1, 0, 0, 0, 1, 1}, 
                            {0, 1, 0, 0, 0, 0, 1}, 
                            {0, 0, 1, 1, 0, 0, 0}, 
                            {0, 0, 0, 1, 1, 0, 0}};

        // declare variable
        Stack<Integer> stack = new Stack<>();
        Set<Integer> isProcessed = new HashSet<>();

        // init
        stack.add(0);
        isProcessed.add(0);

        // process
        while(!stack.isEmpty()) {
            int u = stack.pop();

            // process u
            System.out.print(u + " ");

            // add the neighboor of "u"
            for (int v = 0; v < graph.length; v++) {
                if (graph[u][v] == 1 && isProcessed.contains(v) == false) {
                    stack.add(v);
                    isProcessed.add(v);
                }
            }
        }

    }
}
