public class _283_move_zeros {
    public static void moveZeroes(int[] nums) {
        // int n = nums.length;
        // for (int i = 0; i < n; i++) {
        //     if (nums[i]==0) {
        //         for (int j = i; j < n-1; j++) {
        //             nums[j] = nums[j+1];
        //         }
        //         nums[n-1] = 0;
        //         i--;
        //         n--;
        //     }
        // }

        // 2 pointers -> faster
        int n = nums.length;
        int currentIndex = 0;
        for (int i = 0; i < n; i++) {
            if(nums[i]!=0) {
                nums[currentIndex] = nums[i];
                currentIndex++;
            }
        }
        for (int i = currentIndex; i < n; i++) {
            nums[i] =0;
        }
    }

    public static void main(String[] args) {
        // int[] a = {0,1,0,3,12};
        int[] a = {0,1,0,3,12};
        moveZeroes(a);
        System.out.println("DONE");
    }
}
