package leetcode.easy;

import java.util.LinkedList;

public class MyHashSet {

    private final int bucketsQuantity;
    private LinkedList<Integer>[] buckets;

    public MyHashSet() {
        bucketsQuantity = 8;
        buckets = new LinkedList[bucketsQuantity];
        for (int i = 0; i < bucketsQuantity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public void add(int key) {
        int index = key % bucketsQuantity;
        LinkedList<Integer> bucket = buckets[index];
        if (!bucket.contains(key)) {
            bucket.add(key);
        }
    }

    public boolean contains(int key) {
        int index = key % bucketsQuantity;
        LinkedList<Integer> bucket = buckets[index];
        return bucket.contains(key);
    }

    public void remove(int key) {
        int index = key % bucketsQuantity;
        LinkedList<Integer> bucket = buckets[index];
        bucket.remove(Integer.valueOf(key));
    }
}
