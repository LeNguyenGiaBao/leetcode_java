public class _852_peak_index_in_a_mountain_array {
    public static int peakIndexInMountainArray(int[] a) {
        for (int i = 1; i < a.length-1; i++) {
            if(a[i-1] < a[i] && a[i] >a[i+1]) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] a, int iLeft, int iRight) {
        if (iLeft > iRight) {
            return -1;
        }
        int iMid = (iLeft + iRight) / 2;
        if(a[iMid-1] < a[iMid] && a[iMid] > a[iMid+1]) {
            return iMid;
        } else if(a[iMid-1] < a[iMid] && a[iMid] < a[iMid+1]) {
            return binarySearch(a, iMid, iRight);
        } else {
            return binarySearch(a, iLeft, iMid);
        }
    }
    public static int peakIndexInMountainArray_binarySearch(int[] a) {
        int n = a.length;

        return binarySearch(a, 0, n-1);
    }

    public static void main(String[] args) {
        // int[] a = {24,69,100,99,79,78,67,36,26,19};
        int[] a = {3,5,3,2,0};
        System.out.println(peakIndexInMountainArray(a));
        System.out.println(peakIndexInMountainArray_binarySearch(a));
    }
}
