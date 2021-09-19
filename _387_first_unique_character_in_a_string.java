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

    public static void main(String[] args) {
        String s = "leetcode";
        int value = firstUniqChar(s);
        System.out.println(value);
    }
}