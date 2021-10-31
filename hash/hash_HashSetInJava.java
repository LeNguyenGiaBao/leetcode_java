package hash;

import java.util.HashSet;
import java.util.Set;

public class hash_HashSetInJava {
    public static void main(String[] args) {
        Set<Integer> myIntSet = new HashSet<>();

        myIntSet.add(1);
        myIntSet.add(2);
        myIntSet.add(3);
        myIntSet.add(1);

        for (Integer integer : myIntSet) {
            System.out.println(integer);
        }
    }
}
