public class _14_longest_common_prefix {
    public static String longestCommonPrefix(String[] strs) {
        String temp = strs[0];
        String result = "";
        for (int i = 0; i < temp.length(); i++) {
            String prefix = temp.substring(0, i + 1);
            for (String s : strs) {
                if (! s.startsWith(prefix)) {
                    return result;
                }
            }
            result = prefix;
        }
        return result;
    }

    public static void main(String[] args) {
        String[] strs = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs));
    }
}
