import java.util.Stack;

public class _155_min_stack {
    class MinStack {

        class Node {
            int value;
            int MIN;
            Node(int value) { this.value = value; }
        }

        Stack<Node> myStack = new Stack<>();
        public MinStack() {
            
        }
        
        public void push(int val) {
            Node newNode = new Node(val);
            if (myStack.isEmpty()) {
                newNode.MIN = newNode.value;
            } else {
                newNode.MIN = Math.min(newNode.value, myStack.peek().MIN);
            }

            myStack.push(newNode);
        }
        
        public void pop() {
            if (!myStack.isEmpty()) {
                myStack.pop();
            }
        }
        
        public int top() {
            if (!myStack.isEmpty()) {
                return myStack.peek().value;
            }
            return -1;
        }
        
        public int getMin() {
            if (!myStack.isEmpty()) {
                return myStack.peek().MIN;
            }
            return -1;
        }
    }
}
