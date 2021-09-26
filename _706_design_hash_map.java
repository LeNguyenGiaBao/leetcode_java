import java.util.ArrayList;

public class _706_design_hash_map {
    class Data {
        int key;
        int value;
        Data(int key, int value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            // TODO Auto-generated method stub
            if(obj instanceof Data) {
                return this.key == ((Data)obj).key;
            }
            return false;
        }
    }

    class MyHashMap {
        private final int SIZE = 1000;
        private ArrayList<Data> myBuckets[];

        /** Initialize your data structure here. */
        public MyHashMap() {
            this.myBuckets = new ArrayList[this.SIZE];
            for (int i = 0; i < myBuckets.length; i++) {
                this.myBuckets[i] = new ArrayList<>();
            }
        }
        
        private int hashFunction(int key) {
            return key % this.SIZE;
        }
        
        /** value will always be non-negative. */
        public void put(int key, int value) {
            int hashValueIndex = this.hashFunction(key);
            ArrayList<Data> bucket = this.myBuckets[hashValueIndex];
            Data putData = new Data(key, value);
            int keyIndex = bucket.indexOf(putData);

            if (keyIndex < 0) {
                bucket.add(putData);
            } else {
                bucket.get(keyIndex).value = value;
            }
        }
        
        /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
        public int get(int key) {
            int hashValueIndex = this.hashFunction(key);
            ArrayList<Data> bucket = this.myBuckets[hashValueIndex];
            Data getData = new Data(key, 0);
            int keyIndex = bucket.indexOf(getData);
            if (keyIndex >= 0) {
                return bucket.get(keyIndex).value;
            }
            return -1;
        }
        
        /** Removes the mapping of the specified value key if this map contains a mapping for the key */
        public void remove(int key) {
            int hashValueIndex = this.hashFunction(key);
            ArrayList<Data> bucket = this.myBuckets[hashValueIndex];
            Data delData = new Data(key, 0);
            int keyIndex = bucket.indexOf(delData);

            if(keyIndex >= 0) {
                bucket.remove(keyIndex);
            }
        }
    }

    public static void main(String[] args) {
        
    }
}
