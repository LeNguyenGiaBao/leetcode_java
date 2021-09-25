import java.util.ArrayList;

public class _705_design_hashset {
    
    static class MyHashSet {

        private final int SIZE = 1000;
        private ArrayList<Integer> buckets[];
        /** Initialize your data structure here. */
        public MyHashSet() {
            this.buckets = new ArrayList[this.SIZE];
            for (int i = 0; i < buckets.length; i++) {
                this.buckets[i] = new ArrayList<>();
            }
        }

        private int hashFunction(int key) {
            return key%this.SIZE;
        }
        
        public void add(int key) {
            int hashValueIndex = this.hashFunction(key);
            ArrayList<Integer> bucket = this.buckets[hashValueIndex];
            int keyIndex = bucket.indexOf(key);

            if (keyIndex < 0) {
                bucket.add(key);
            }
        }
        
        public void remove(int key) {
            int hashValueIndex = this.hashFunction(key);
            ArrayList<Integer> bucket = this.buckets[hashValueIndex];
            int keyIndex = bucket.indexOf(key);

            if (keyIndex >= 0) {
                bucket.remove(keyIndex);
            }
        }
        
        /** Returns true if this set contains the specified element */
        public boolean contains(int key) {
            int hashValueIndex = this.hashFunction(key);
            ArrayList<Integer> bucket = this.buckets[hashValueIndex];
            int keyIndex = bucket.indexOf(key);

            return keyIndex >= 0;
        }
    }

    public static void main(String[] args) {
        MyHashSet mySet = new MyHashSet();
        mySet.add(1);
        mySet.add(1);
        mySet.add(2);
        System.out.println(mySet.contains(1));
        mySet.remove(1);
        System.out.println(mySet.contains(1));
    }
}
