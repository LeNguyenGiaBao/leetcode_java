import java.util.Arrays;

public class sort_merge_sort {
    public static int[] merge(int[] a1, int[] a2) {
        int n = a1.length + a2.length;
        int n1 = a1.length;
        int n2 = a2.length;
        int i=0, i1=0, i2=0;

        int[] result = new int[n];

        while(i<n) {
            if (i1 < n1 && i2 < n2) {
                if(a1[i1] <= a2[i2]) {
                    result[i] = a1[i1];
                    i++;
                    i1++;
                } else {
                    result[i] = a2[i2];
                    i++;
                    i2++;
                }
            } else {
                if (i1 < n1) {
                    result[i] = a1[i1];
                    i++;
                    i1++;
                } else {
                    result[i] = a2[i2];
                    i++;
                    i2++;
                }
            }
        }
        return result;
    }

    public static int[] mergeSort(int[] a, int L, int R) {
        if (L > R) {
            return new int[0];  // return null array
        }
        if (L == R) {
            int[] singleElement = {a[L]};
            return singleElement;
        }

        // split
        System.out.println("Split: " + L + " - " + R);
        int k = (L+R)/2;
        int[] a1 = mergeSort(a, L, k);
        int[] a2 = mergeSort(a, k+1, R);

        // merge: a1 and a2 is sorted
        int[] result = merge(a1, a2);
        System.out.println("Merge result: " + Arrays.toString(result));
        return result;        
    }

    public static int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length-1);
    }

    public static void main(String[] args) {
        // test merge(): WORK
        // int[] a1 = {1,3,5,7,8,10};
        // int[] a2 = {2,4,6,7,9};
        // System.out.println(Arrays.toString(merge(a1, a2)));

        int[] a = {1,5,3,2,8,7,6,4};
        System.out.println(Arrays.toString(sortArray(a)));
    }
}