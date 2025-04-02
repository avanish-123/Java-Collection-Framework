package com.collectionframework.Maps.HashMaps.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCacheExample<K, V> extends LinkedHashMap<K, V> {
    private int capacity;
    public LRUCacheExample(int capacity){
        super(capacity, 0.3f, true);
        this.capacity = capacity;
    }

    @Override
    public boolean removeEldestEntry(Map.Entry<K,V> eldest){
        return size()>capacity;

    }

    public static void main(String[] args) {
        LRUCacheExample<String, Integer> students = new LRUCacheExample<>(3);
        students.put("Avanish", 1);
        students.put("Shivam", 2);
        students.put("Himanshu", 3);
        students.get("Avanish");
        students.put("Saurabh", 6);
        students.put("Karan", 8);

        System.out.println(students);

    }
}
