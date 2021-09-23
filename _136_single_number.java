public class _136_single_number {
    public static int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean isDouble  = false;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i!=j) {
                    isDouble = true;
                }
            }
            if (!isDouble) {
                return nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
        System.out.println(2^0);
    }
}