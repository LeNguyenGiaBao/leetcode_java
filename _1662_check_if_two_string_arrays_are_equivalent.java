public class _1662_check_if_two_string_arrays_are_equivalent {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = "";
        String s2 = "";

        for (String string : word1) {
            s1 += string;
        }

        for (String string : word2) {
            s2 += string;
        }
        
        if(s1.equals(s2)) {
            return true;
        }

        return false;
    }

    // String builder

    public static boolean arrayStringsAreEqual_StringBuilder(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (String string : word1) {
            sb1.append(string);
        }

        for (String string : word2) {
            sb2.append(string);
        }
        return sb1.toString().equals(sb2.toString());
    }

    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        boolean value = arrayStringsAreEqual(word1, word2);
        System.out.println(value);
    }
}
