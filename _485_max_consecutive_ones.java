public class _485_max_consecutive_ones {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;

        for (int i : nums) {
            if(i==1) {
                count ++;
                if (count > max) {
                    max = count;
                }
            } else {
                count =0;
            }
        }
        
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        int value = findMaxConsecutiveOnes(nums);
        System.out.println(value);
    }
}
