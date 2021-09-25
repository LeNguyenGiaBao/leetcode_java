import java.util.ArrayList;

public class hash_MyHashSet {
    private final int SIZE = 1000;
    private ArrayList<Integer> myBuckets[];

    hash_MyHashSet() {
        this.myBuckets = new ArrayList[this.SIZE];
        for (int i = 0; i < myBuckets.length; i++) {
            myBuckets[i] = new ArrayList<>();
        }
    }

    // return hashValue
    private int hashFunction(int key) {
        return key % SIZE;
    }

    public void add(int key) {
        int hashValueIndex = this.hashFunction(key);
        ArrayList<Integer> bucket = this.myBuckets[hashValueIndex];
        int keyIndex = bucket.indexOf(key);

        if (keyIndex < 0) {
            bucket.add(key);
        }
    }

    public void remove (int key) {
        int hashValueIndex = this.hashFunction(key);
        ArrayList<Integer> bucket = this.myBuckets[hashValueIndex];
        int keyIndex = bucket.indexOf(key);
        if (keyIndex >= 0) {
            bucket.remove(keyIndex);
        }
    }

    public boolean contain(int key) {
        int hashValueIndex = this.hashFunction(key);
        ArrayList<Integer> bucket = this.myBuckets[hashValueIndex];
        int keyIndex = bucket.indexOf(key);
        return keyIndex>=0;
    }

    public static void main(String[] args) {
        hash_MyHashSet mySet = new hash_MyHashSet();
        mySet.add(1);
        mySet.add(1);
        mySet.add(2);
        System.out.println("mySet.contain(1): " + mySet.contain(1));
        mySet.remove(1);
        System.out.println("mySet.contain(1): " + mySet.contain(1));
    }
}
