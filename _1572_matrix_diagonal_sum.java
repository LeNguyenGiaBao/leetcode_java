public class _1572_matrix_diagonal_sum {
    public static int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += mat[i][i] + mat[i][n-1-i];        
        }
        if (n % 2 != 0) {
            sum -= mat[n/2][n/2];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(diagonalSum(mat));
    }
}
