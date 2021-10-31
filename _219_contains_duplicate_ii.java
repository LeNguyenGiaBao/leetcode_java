import java.util.HashMap;
import java.util.Map;

public class _219_contains_duplicate_ii {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> myMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (myMap.containsKey(nums[i])) {
                if (Math.abs(i - myMap.get(nums[i])) <= k) {
                    return true;
                } else {
                    myMap.put(nums[i], i);
                }
            } else {
                myMap.put(nums[i], i);
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int[] nums = {1,0,1,1};
        int k = 3;
        System.out.println(containsNearbyDuplicate(nums, k));
    }
}