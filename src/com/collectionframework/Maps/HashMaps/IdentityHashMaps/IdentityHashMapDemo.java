package com.collectionframework.Maps.HashMaps.IdentityHashMaps;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        // identity hash map hascode of object class is used which means below both objects have same value but different objects so it will create different hashcodes 
        String keyOne = new String("key");
        String keyTwo = new String("key");
        IdentityHashMap<String, Integer> mpp = new IdentityHashMap<>();
        mpp.put(keyOne, 1);   
        mpp.put(keyTwo, 2);
        System.out.println(mpp);    
    }
}
