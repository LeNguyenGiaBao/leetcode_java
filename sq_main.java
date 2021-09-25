public class sq_main {
    public static void main(String[] args) {
        // ----------------------- Array Stack ---------------------------
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


        // -------------------------Array Queue ------------------------
        // sq_ArrayQueue myQueue = new sq_ArrayQueue(3);
        // myQueue.push(1);
        // myQueue.push(2);
        // myQueue.push(3);
        // myQueue.push(4);
        // myQueue.show();

        // System.out.println("POP: " + myQueue.pop());
        // myQueue.show();

        // System.out.println("POP: " + myQueue.pop());
        // myQueue.show();
        // System.out.println("POP: " + myQueue.pop());
        // myQueue.show();
        // System.out.println("POP: " + myQueue.pop());
        // myQueue.show();

        // ------------------------- Linked List Stack -----------------------------
        // sq_LinkedListStack myStack = new sq_LinkedListStack();
        // myStack.push(1);
        // myStack.push(2);
        // myStack.push(3);
        // myStack.push(4);
        // myStack.push(5);
        // myStack.push(6);
        // myStack.push(7);
        // myStack.show();
        // System.out.println(myStack.pop());
        // myStack.show();
        // System.out.println(myStack.pop());
        // myStack.show();
        // System.out.println(myStack.pop());
        // myStack.show();
        // System.out.println(myStack.pop());
        // myStack.show();
        // System.out.println(myStack.pop());
        // myStack.show();
        // System.out.println(myStack.pop());
        // myStack.show();
        // System.out.println(myStack.pop());
        // myStack.show();
        // System.out.println(myStack.pop());
        // myStack.show();

        // --------------------------- Linked List Queue --------------------------
        sq_LinkedListQueue myQueue = new sq_LinkedListQueue();
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        myQueue.push(4);
        myQueue.push(5);
        myQueue.show();

        System.out.println(myQueue.pop());
        myQueue.show();
        myQueue.push(6);
        myQueue.show();
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
        myQueue.show();
    }
}
