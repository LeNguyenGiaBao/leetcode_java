public class _628_maximum_product_of_three_number {
    public static int maximumProduct(int[] nums) {
        if (nums.length == 3) {
            return nums[0] * nums[1] * nums[2];
        }

        int n = nums.length;
        int[] sorted = merge_sort(nums, 0, n-1);

        // if (sorted[0] * sorted[1] < sorted[n-2] * sorted[n-1]) {
        //     return sorted[n-1] * sorted[n-2] * sorted[n-3];
        // } else {
        //     return sorted[0] * sorted[1] * sorted[n-1];
        // }
        return sorted[n-1] * sorted[n-2] * sorted[n-3] > sorted[0] * sorted[1] * sorted[n-1] ? sorted[n-1] * sorted[n-2] * sorted[n-3] :sorted[0] * sorted[1] * sorted[n-1];
    }

    public static int[] merge(int[] a1, int[] a2) {
        int l1 = a1.length;
        int l2 = a2.length;

        int i1 = 0;
        int i2 = 0;
        int i = 0;

        int[] result = new int[l1+l2];
        while (i1 < l1 && i2 < l2) {
            if (a1[i1] < a2[i2]) {
                result[i] = a1[i1];
                i++;
                i1++;
            } else {
                result[i] = a2[i2];
                i++;
                i2++;
            }
        }

        while (i1 < l1) {
            result[i] = a1[i1];
            i++;
            i1++;
        }

        while (i2 < l2) {
            result[i] = a2[i2];
            i++;
            i2++;
        }
        return result;

    }

    public static int[] merge_sort(int[] a, int L, int R) {
        if (L > R) {    // fail condition
            return new int[0];
        }

        if (L == R) {
            int[] singleElement = {a[L]};
            return singleElement;
        }

        int k = (L + R)/2;
        int[] a1 = merge_sort(a, L, k);
        int[] a2 = merge_sort(a, k+1, R);

        int[] result = merge(a1, a2);
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1,2,5,4,3,8,5,3,4};
        int result = maximumProduct(a);
        System.out.println(result);
    }
}
