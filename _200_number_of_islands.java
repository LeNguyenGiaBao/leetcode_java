public class _200_number_of_islands {

    static boolean[][] isProcessed = new boolean[300][300];

    public static boolean isValid(char[][] a, int i, int j) {
        int numRows = a.length;
        int numCols = a[0].length;

        return i >= 0 && j >= 0 && i < numRows && j < numCols;
    }

    public static void DFS(char[][] a, int i, int j) {
        // stop condition 
        if (isValid(a, i, j) == false) {
            return ;
        }
        if (a[i][j] == '0' || isProcessed[i][j] == true) {
            return ;
        }

        isProcessed[i][j] = true;

        // recursion
        DFS(a, i, j+1);
        DFS(a, i, j-1);
        DFS(a, i-1, j);
        DFS(a, i+1, j);


    }
    public static int numIslands(char[][] a) {
        int numRows = a.length;
        int numCols = a[0].length;
        int count = 0;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (a[i][j] == '1' && isProcessed[i][j] == false) {
                    DFS(a, i, j);
                    count ++ ;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        char[][] grid = {
            {'1','1','1','1','0'},
            {'1','1','0','1','0'},
            {'1','1','0','0','0'},
            {'0','0','0','0','0'}
          };
        int numOfIslands = numIslands(grid);
        System.out.println(numOfIslands);
    }
}