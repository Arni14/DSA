import java.util.LinkedList;

public class HashMap<K, V> {
    private int CAPACITY = 10;
    private MapEntry[] buckets;
    private int size;

    public HashMap() {
        this.buckets = new MapEntry[CAPACITY];
        this.size = 0;
    }

    private int getHash(K key) {
        return (key.hashCode() & 0xfffffff) % CAPACITY;
    }

    public V get(K key) {
        int hash = getHash(key);
        for (KeyValue pair : this.buckets[hash].getEntries()) {
            K currKey = (K) pair.getKey();
            V currValue = (V) pair.getValue();
            if (currKey.equals(key)) {
                return currValue;
            }
        }
        return null;
    }

    public void put(K key, V value) {
        int hash = getHash(key);

    }

    public boolean containsKey(K key) {
        return true;
    }

}


