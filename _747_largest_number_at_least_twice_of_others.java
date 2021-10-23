public class _747_largest_number_at_least_twice_of_others {
    public static int dominantIndex(int[] a) {
        int n = a.length;
        int the1stLargest = -1;
        int the2ndLargest = -1;
        int indexthe1stLargest = -1;
        if (n == 1) {   // length array is 1
            return 0;
        }

        for (int i = 0; i < n; i++) {
            if (a[i] > the1stLargest) {
                the2ndLargest = the1stLargest;
                the1stLargest = a[i];
                indexthe1stLargest = i;
            } else if (a[i] > the2ndLargest) {
                the2ndLargest = a[i];
            }
        }

        if (the1stLargest >= 2 * the2ndLargest) {
            return indexthe1stLargest;
        } 

        return -1;
    }

    public static void main(String[] args) {
        int[] a = {3,6,1,0};
        int result = dominantIndex(a);
        System.out.println(result);
    }
}
