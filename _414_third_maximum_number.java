public class _414_third_maximum_number {
    public static void insert(long[] maxArr, int val) {
        int i=0;
    }

    public static int thirdMax(int[] nums) {
        long[] maxArr = {Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE};

        for (int i = 0; i < nums.length; i++) {
            insert(maxArr, nums[i]);
        }

        if (maxArr[2] == Long.MIN_VALUE) {
            return (int)maxArr[0];
        }
        return (int)maxArr[-1];
    }

    public static void main(String[] args) {
        
    }
}
