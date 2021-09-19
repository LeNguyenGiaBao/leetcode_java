public class _1672_richest_customer_wealth {
    public static int maximumWealth(int[][] a) {
        int clients = a.length;
        int banks = a[0].length;
        int max = 0;

        for (int i = 0; i < clients; i++) {
            int sumPropety = 0;
            for (int j = 0; j < banks; j++) {
                sumPropety += a[i][j];
            }
            if (sumPropety > max) {
                max = sumPropety;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] a = { {1,2,3}, {3,2,1}};

        int rows = a.length;
        int columns = a[0].length;

        System.out.println(rows);
        System.out.println(columns);

        
    }
}