import java.util.Stack;

public class sq_StackBuildInJava {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        for (Integer stack : myStack) {
            System.out.print(stack + "<-");
        }
        System.out.println();


        // pop
        System.out.println(myStack.pop()); // 3
        for (Integer stack : myStack) {
            System.out.print(stack + "<-");
        }
        System.out.println();

        
        System.out.println(myStack.pop()); // 2
        System.out.println(myStack.peek()); // 1
        System.out.println(myStack.pop()); // 1
        System.out.println("Is Empty " + myStack.isEmpty());
        System.out.println(myStack.pop()); //error

    }
}
