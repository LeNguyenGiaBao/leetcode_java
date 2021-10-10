public class _905_sort_array_by_parity {
    public static int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = n - 1;

        while (i < j) {
            while (i < n && nums[i] % 2 == 0) {
                i++;
            }

            while (j >= 0 && nums[j] % 2 == 1) {
                j--;
            }

            if (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {0,2};
        int[] result = sortArrayByParity(nums);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}