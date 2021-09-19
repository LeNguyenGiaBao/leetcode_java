public class _88_merge_sorted_array {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        
        for (int ai : nums2) {
            insertToNums1(ai, nums1, m); //m is the number of element of nums1
            m++;
        }
    }

    private static void insertToNums1(int ai, int[] nums1, int m) {
        boolean findK =false;   // k is the index of first number that bigger than ai
        for (int k = 0; k < m; k++) {
            if (nums1[k] > ai) {
                findK = true;

                for (int i=m-1; i>k-1; i--) {   // move a[k] to a[m-1] right 1 unit
                    nums1[i+1] = nums1[i];
                }
                nums1[k] = ai;
                break;
            }
        }

        if (!findK) {  // cannot find the number bigger than ai -> ai is the biggest -> insest to the last
            nums1[m] = ai;
        }
    }

    public static void merge_2pointers(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m + n -1;
        while (k>=0) {
            if(j < 0) {
                nums1[k] = nums1[i];
                i--;
            } else if (i < 0) {
                nums1[k] = nums2[j];
                j--;
            } else if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {4,5,6};
        int n = 3;
        // merge(nums1, m, nums2, n);
        merge_2pointers(nums1, m, nums2, n);
        System.out.println("DONE");
    }
}
