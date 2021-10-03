import java.util.ArrayList;
import java.util.List;

public class _228_summary_ranges {
    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int n = nums.length;
        if (n == 0) {
            return result;
        }
        String aList = String.valueOf(nums[0]);
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i-1]+1) {
                if (nums[i-1] == Integer.valueOf(aList)) {
                    result.add(aList);
                } else {
                    aList += "->" + String.valueOf(nums[i-1]);
                    result.add(aList);
                }
                aList = String.valueOf(nums[i]);
            }
        }
        if (nums[n-1] == Integer.valueOf(aList)) {
            result.add(String.valueOf(nums[n-1]));
        } else {
            aList += "->" + String.valueOf(nums[n-1]);
            result.add(aList);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {0,2,3,4,6,8,9};
        List<String> result = summaryRanges(nums);
        for (String string : result) {
            System.out.println(string);
        }
    }
}