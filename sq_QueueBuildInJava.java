import java.util.LinkedList;
import java.util.Queue;

public class sq_QueueBuildInJava {
    public static void main(String[] args) {
        Queue<Integer> myQueue = new LinkedList<>();

        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);

        for (Integer integer : myQueue) {
            System.out.print(integer + " ");
        }
        System.out.println();

        System.out.println(myQueue.isEmpty());
        System.out.println("Remove: " + myQueue.remove());

        for (Integer integer : myQueue) {
            System.out.print(integer + " ");
        }
        System.out.println();

        System.out.println("Remove: " + myQueue.remove());
        System.out.println("Remove: " + myQueue.remove());
        System.out.println(myQueue.isEmpty());
        System.out.println("Remove: " + myQueue.poll()); // throw exception: null
        System.out.println("Remove: " + myQueue.remove()); // not throw exception-> error


    }
}
