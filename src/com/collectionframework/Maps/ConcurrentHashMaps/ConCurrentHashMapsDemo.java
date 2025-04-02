package com.collectionframework.Maps.ConcurrentHashMaps;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class ConCurrentHashMapsDemo {
    public static void main(String[] args) {
        // in short concurrent version of Hashmap
        ConcurrentHashMap<String, Integer> mpp = new ConcurrentHashMap<>();
        
        
        // In short concurrent version of tree map
        ConcurrentSkipListMap<String, Integer> map = new ConcurrentSkipListMap<>();
    }
}
