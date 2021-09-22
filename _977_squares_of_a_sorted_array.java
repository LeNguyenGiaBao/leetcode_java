public class _977_squares_of_a_sorted_array {
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int i = -1; // i: index of the last negative number
        while (i<n && nums[i+1] <0) {
            i++;
        }

        int j = n; //j: index of the first positive number
        while (j>0 && nums[j-1] >=0) {
            j--;
        }
        // System.out.println(i + " " + j);

        int newIndex = 0;    // index of result
        while (i>=0 || j<n) {
            if (i>=0 && j<n) {
                int ii = nums[i] * nums[i];
                int jj = nums[j] * nums[j];;
                if(ii < jj) {
                    result[newIndex] = ii;
                    i--;
                    newIndex++;
                } else {
                    result[newIndex] = jj;
                    j++;
                    newIndex++;
                }
            } else if (i>=0) {
                result[newIndex] = nums[i] * nums[i];
                i--;
                newIndex++;
            } else {
                result[newIndex] = nums[j] * nums[j];
                j++;
                newIndex++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int[] result = sortedSquares(nums);
        System.out.println(result);
        System.out.println("DONE");
        
    }
}
