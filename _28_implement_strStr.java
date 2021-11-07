public class _28_implement_strStr {
    public static int strStr(String haystack, String needle) {
        if (needle == "" || needle.isEmpty()) {
            return 0;
        }

        char[] a = haystack.toCharArray();
        char[] b = needle.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b[0]) {
                int count = 1;
                for (int j = 1; j < b.length; j++) {
                    if (i + j < a.length && a[i+j] == b[j]) {
                        count++;
                    } else {
                        break;
                    }
                }
                if (count == b.length) {
                    return i;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String haystack = "", needle = "";
        System.out.println(strStr(haystack, needle));
    }
}
