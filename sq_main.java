public class sq_main {
    public static void main(String[] args) {
        // sq_ArrayStack myStack = new sq_ArrayStack(3);

        // myStack.push(1);
        // myStack.push(2);
        // myStack.push(3);
        // myStack.push(4);
        // myStack.show();

        // System.out.println(myStack.pop());
        // myStack.show();
        // System.out.println(myStack.pop());
        // myStack.show();
        // System.out.println(myStack.pop());
        // myStack.show();
        // System.out.println(myStack.pop());
        // myStack.show();

        sq_ArrayQueue myQueue = new sq_ArrayQueue(3);
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        myQueue.push(4);
        myQueue.show();

        System.out.println("POP: " + myQueue.pop());
        myQueue.show();

        System.out.println("POP: " + myQueue.pop());
        myQueue.show();
        System.out.println("POP: " + myQueue.pop());
        myQueue.show();
        System.out.println("POP: " + myQueue.pop());
        myQueue.show();
    }
}
