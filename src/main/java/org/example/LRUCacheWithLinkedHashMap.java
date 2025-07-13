package org.example;

import java.util.LinkedHashMap;
import java.util.Map;

// LRUCacheWithLinkedHashMap

public class LRUCacheWithLinkedHashMap extends LinkedHashMap {
    private final int capacity;

    public LRUCacheWithLinkedHashMap(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    public int get(int key) {
        return (int) super.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        super.put(key, value);
    }

    protected boolean removeOldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > capacity;
    }
}
