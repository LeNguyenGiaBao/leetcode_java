import java.util.Stack;

public class _394_decode_string {
    public static String decodeString(String s) {
        int n = s.length();
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (c == ']') {
                String str = "";

                // process
                // loop until meet '['
                while (stack.peek() != '[') {
                    str = stack.pop() + str;
                }

                // remove '['
                stack.pop();

                // get amount
                String amount = "";
                while (stack.isEmpty() == false && Character.isDigit(stack.peek())) {
                    amount = stack.pop() + amount;
                }
                // int amountNumber = Integer.parseInt(amount);

                // multiple str amountNumber times
                // str = str.repeat(amountNumber); // un- co

                // add result "str" back to stack
                for (int j = 0; j < str.length(); j++) {
                    stack.push(str.charAt(j));
                }

            } else {
                stack.push(c);
            }
        }

        String result = "";
        while (stack.isEmpty() == false) {
            result = stack.pop() + result;
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "2[ab2[cd]]";
        String result = decodeString(s);
        System.out.println(result);
    }
}