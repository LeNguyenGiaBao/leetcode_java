public class _58_length_of_last_word {
    public static int lengthOfLastWord(String s) {
        char[] a = s.toCharArray();
        int n = a.length;
        int count = 0;

        for (int i = n-1; i >= 0; i--) {
            if ((a[i] >= 'a' && a[i] <= 'z') || (a[i] >= 'A' && a[i] <= 'Z')) {
                count++;
            } else if (a[i] == ' ' && count != 0) {
                return count;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String s = "luffy is still joyboy";
        System.out.println(lengthOfLastWord(s));
    }
}
