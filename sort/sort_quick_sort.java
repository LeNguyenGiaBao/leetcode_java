package sort;
import java.util.Arrays;

public class sort_quick_sort {

    public static void quickSort(int[] a, int L, int R) {

        // L == R: the array has 1 element
        // L > R: the error condition, will not occur, but when happen, return to end.
        if (L>=R) {
            return;
        }
        // B1. choose the key
        int key = a[(L+R)/2];

        // B2. allocate the array 
        int k = partition(a, L, R, key);

        // B3. Seperate the array
        quickSort(a, L, k-1);
        quickSort(a, k, R);
    }

    // this function return pivot. The pivot is the first index of the right-child array
    public static int partition(int[] a, int L, int R, int key) {
        int iL = L;
        int iR = R;

        while (iL <= iR) {
            // find the first index of the number that bigger than key
            while (a[iL]<key) {
                iL++;
            }

            // similarly, find the last index of the number that smaller than key
            while (a[iR]>key) {
                iR--;
            }

            if (iL <= iR) {
                int temp = a[iL];
                a[iL] = a[iR];
                a[iR] =temp;

                // go to the next
                iL++;
                iR--;
            }
        }

        // after all, the iL > iR, so iL is the first index of the right-child array
        return iL;
    }

    public static void main(String[] args) {
        // int[] a = {6,7,8,5,4,1,2,3};
        int[] a = {5,1,1,2,0,0};
        quickSort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }
}