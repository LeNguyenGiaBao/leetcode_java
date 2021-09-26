package hash;
import java.util.ArrayList;

public class hash_MyHashMap {
    private class Data {
        int key;
        int value;
        Data (int key, int value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            // TODO Auto-generated method stub
            if (obj instanceof Data) {
                return this.key == ((Data)obj).key;
            }
            return false;
        }
    }

    private final int SIZE = 1000;
    private ArrayList<Data> myBuckets[];
    
    public hash_MyHashMap() {
        this.myBuckets = new ArrayList[this.SIZE];
        for (int i = 0; i < myBuckets.length; i++) {
            this.myBuckets[i] = new ArrayList<>();
        }
    }

    private int hashFunction(int key) {
        return key % this.SIZE;
    }

    public void put(int key, int value) {
        int hashValueIndex = this.hashFunction(key);
        ArrayList<Data> bucket = this.myBuckets[hashValueIndex];
        Data newData = new Data(key, value);
        int keyIndex = bucket.indexOf(newData);

        if (keyIndex >= 0) {
            bucket.get(keyIndex).value = value;
        } else {
            bucket.add(newData);
        }
    }

    public void remove(int key) {
        int hashValueIndex = this.hashFunction(key);
        ArrayList<Data> bucket = this.myBuckets[hashValueIndex];
        Data tempData = new Data(key, 0);
        int keyIndex = bucket.indexOf(tempData);
        if (keyIndex >= 0) {
            bucket.remove(keyIndex);
        } 
    }

    public int get(int key) {
        int hashValueIndex = this.hashFunction(key);
        ArrayList<Data> bucket = this.myBuckets[hashValueIndex];
        Data tempData = new Data(key, 0);
        int keyIndex = bucket.indexOf(tempData);
        if (keyIndex >= 0) {
            return bucket.get(keyIndex).value;
        }
        return -1;
    }

    public static void main(String[] args) {
        hash_MyHashMap myMap = new hash_MyHashMap();
        myMap.put(1,1);
        myMap.put(1,2);
        myMap.put(10,1);
        System.out.println("get(1)" + myMap.get(1));
        System.out.println("get(2)" + myMap.get(2));
        myMap.remove(1);
        System.out.println("get(1)" + myMap.get(1));
        System.out.println("get(10)" + myMap.get(10));
    }
}
