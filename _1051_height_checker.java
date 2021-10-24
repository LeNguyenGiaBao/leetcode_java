public class _1051_height_checker {
    public static int heightChecker(int[] heights) {
        int n = heights.length;
        int[] copied = new int[n];

        for (int i = 0; i < n; i++) {
            copied[i] = heights[i];
        }
        
        printArray(copied);
        // selection sort
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;

            for (int j = i+1; j < n; j++) {
                if (copied[j] < copied[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int t = copied[i];
                copied[i] = copied[minIndex];
                copied[minIndex] = t;
            }
        }

        printArray(copied);

        int count  = 0;
        for (int i = 0; i < n; i++) {
            if (copied[i] != heights[i]) {
                count ++;
            }
        }
        return count;
    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {1,1,4,2,1,3};
        int result = heightChecker(a);
        System.out.println(result);
    }
}