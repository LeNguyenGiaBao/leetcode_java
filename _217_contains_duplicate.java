public class _217_contains_duplicate {
    public static boolean containsDuplicate(int[] nums) {
        int[] sortedNums = mergeSort(nums, 0, nums.length-1);
        for (int i = 0; i < sortedNums.length-1; i++) {
            if (sortedNums[i] == sortedNums[i+1]) {
                return true;
            }
        }

        return false;
    }

    public static int[] merge(int[] aL, int[] aR) {
        int iL = 0;
        int iR = 0;
        int i = 0;
        int L = aL.length;
        int R = aR.length;
        int n = L + R;
        int[] result = new int[n];

        while (iL < L && iR < R) {
            if (aL[iL] < aR[iR]) {
                result[i] = aL[iL];
                i++;
                iL++;
            } else {
                result[i] = aR[iR];
                i++;
                iR++;
            }
        }

        while (iL < L) {
            result[i] = aL[iL];
            i++;
            iL++;
        }

        while (iR < R) {
            result[i] = aR[iR];
            i++;
            iR++;
        }

        return result;
    }

    public static int[] mergeSort(int[] a, int L, int R) {
        if (L > R) {
            return new int[0];
        }
        if (L == R) {
            int[] result = {a[L]};
            return result;
        }

        int k = (L + R)/2;
        int[] aL = mergeSort(a, L, k);
        int[] aR = mergeSort(a, k+1, R);

        int[] result = merge(aL, aR);
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
}