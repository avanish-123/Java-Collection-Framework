package com.collectionframework.Maps.ImmutableMaps;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapDemo {
    public static void main(String[] args) {
    Map<String, Integer> mpp = new HashMap<>();
    mpp.put("Avanish", 1);
    mpp.put("Chandra", 2);
    mpp.put("Pandey", 4);
    mpp.put("Varanasi", 3);

    Map<String, Integer> mppTwo = Collections.unmodifiableMap(mpp);
    System.out.println(mppTwo);
    // mppTwo.put('Shivam', 8); //not allowed throws exception
    }
}
