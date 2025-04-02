package com.collectionframework.Maps.HashMaps;

import java.util.HashMap;
import java.util.Map;

public class HashmapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> mpp = new HashMap<>();
        mpp.put(2, "Chandra");
        mpp.put(1, "Avanish");
        mpp.put(4, "Babu");
        mpp.put(3, "pandey");
        
        System.out.println(mpp);
        
        
        System.out.println(mpp.get(2)); // get value of key
        
        System.out.println(mpp.containsKey(5)); // check key exist
        
        System.out.println(mpp.containsValue("pandey")); // check value exist or not
        
        mpp.remove(4); // remove entry with key if exist
        
        // Iteration in map
        for(int i: mpp.keySet()){
            System.out.println(i+" " +mpp.get(i));
        }

        // put the key value if key not present in map. If present to it will not add 
        mpp.putIfAbsent(8, "Varanasi");


        for(Map.Entry<Integer, String> entry: mpp.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }

        System.out.println(mpp);
    }
    
}
