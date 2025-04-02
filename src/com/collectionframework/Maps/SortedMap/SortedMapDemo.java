package com.collectionframework.Maps.SortedMap;

import java.util.SortedMap;
import java.util.TreeMap;


// basically sorted map is a interface and tree map is the implementation class
public class SortedMapDemo {
    public static void main(String[] args) {
        SortedMap<String, Integer> mpp = new TreeMap<>();
        mpp.put("Vivek", 91);
        mpp.put("Mohit", 89);
        mpp.put("Nilesh", 98);
        System.out.println(mpp);

        System.out.println(mpp.firstKey());
        System.out.println(mpp.lastKey());
        
    }
    
}
