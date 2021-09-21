public class _414_third_maximum_number {
    public static void printArr(long[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void insert(long[] maxArr, int val) {
        int i=0;
        while(i<maxArr.length) {
            if (val == maxArr[i]) {
                return; // not allow 2 elements are the same
            } else if (val > maxArr[i]) {
                // insert val. break to get i, insert below
                break;
            } else { // val <max[i] --> go to next
                i++;
            }
        }
        //  insert here
        if (i <maxArr.length) { // i can over length of maxArr (i = 4) --> val smaller all of maxArr --> not insert 
            for (int j = 2; j > i; j--) {   // 2 is the last index
                maxArr[j] = maxArr[j-1];
            }
            maxArr[i] = val;
            printArr(maxArr);
        }
    }

    public static int thirdMax(int[] nums) {
        long[] maxArr = {Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE};

        for (int i = 0; i < nums.length; i++) {
            insert(maxArr, nums[i]);
        }

        if (maxArr[2] == Long.MIN_VALUE) {
            return (int)maxArr[0];
        }
        return (int)maxArr[2];
    }

    public static void main(String[] args) {
        int[] a = {2,2,3,1};
        System.out.println(thirdMax(a));
    }
}
