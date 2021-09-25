import java.util.Stack;

public class _20_valid_parentheses {
    public static boolean isValid(String s) {
        Stack<Character> myStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                myStack.push(c);
            } else {
                if (myStack.isEmpty()) {
                    return false;
                }
                char top = myStack.peek();
                if ( (c==')' && top == '(')
                    || (c==']' && top == '[')
                    || (c=='}' && top == '{') ) {
                        myStack.pop();
                } else {
                    return false;
                }
            }
        }
        return myStack.isEmpty();
    }

    public static void main(String[] args) {
        // String s = "()[]{}";
        // String s = "(]";
        String s = "{[]}";
        // String s = "([)]";
        System.out.println(isValid(s));
    }
}
