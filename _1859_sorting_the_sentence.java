public class _1859_sorting_the_sentence {
    public static String sortSentence(String s) {
        String[] temp = new String[11];
        char[] a = s.toCharArray();
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < a.length; i++) {
            if (a[i] > 47 && a[i] < 58) { // is number
                temp[a[i] - 48] = word.toString();
                word = new StringBuilder();
                i++;
            } else {
                word.append(a[i]);
            }
        }
        int i =1;
        String result = "";

        while (temp[i] != null) {
            result += temp[i] + " ";
            i++;
        }
        return result.substring(0, result.length() - 1);
    }

    public static void main(String[] args) {
        String s = sortSentence("is2 sentence4 This1 a3");
        System.out.println(s);
    }
}
