import java.util.HashMap;
import java.util.Map;

public class _387_first_unique_character_in_a_string {
    public static int firstUniqChar(String s) {
        char[] arr = s.toCharArray();   // convert s to char array

        int[] count = new int[123];
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            int index = (int)c;
            count[index]++;
        }

        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            int index = (int)c;
            if(count[index] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static int firstUniqChar_HashMap(String s) {
        Map<Character, Integer> myMap = new HashMap<>();
        char[] a = s.toCharArray();

        for (int i = 0; i < a.length; i++) {
            if (myMap.containsKey(a[i])) {
                int value = myMap.get(a[i]);
                value ++;
                myMap.put(a[i], value);
            } else {
                myMap.put(a[i], 1);
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (myMap.get(a[i]) == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        int value = firstUniqChar(s);
        int value2 = firstUniqChar_HashMap(s);
        System.out.println(value);
        System.out.println(value2);
    }
}