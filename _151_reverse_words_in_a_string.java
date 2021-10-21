import java.util.Stack;

public class _151_reverse_words_in_a_string {
    public static String reverseWords(String s) {
        s = s + " ";
        char[] a = s.toCharArray();
        int n = a.length;
        Stack<String> stack = new Stack<>();
        StringBuilder subString = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (a[i] != ' ') {
                subString.append(a[i]);
            } else {
                String word = subString.toString();
                if (word.length() != 0) {
                    stack.push(word);
                }

                subString = new StringBuilder();
            }
        }

        String result = "";
        while(!stack.isEmpty()) {
            String stringPop = stack.pop();
            result += stringPop;
            if (!stack.isEmpty()) {
                result += " ";
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "the         sky        is blue";
        String result = reverseWords(s);
        System.out.println(result);
    }
}