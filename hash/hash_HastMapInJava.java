package hash;

import java.util.HashMap;
import java.util.Map;

public class hash_HastMapInJava {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,2};
        Map<Integer, Integer> myMap = new HashMap<>();

        for (int i : arr) {
            if (myMap.containsKey(i) == false) {
                // not exist yet
                myMap.put(i, 1);
            } else {
                int count = myMap.get(i);
                count ++;
                myMap.put(i, count);
            }
        }

        for (Map.Entry entry : myMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
