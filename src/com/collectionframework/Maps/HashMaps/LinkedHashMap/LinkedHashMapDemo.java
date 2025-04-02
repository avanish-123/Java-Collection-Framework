package com.collectionframework.Maps.HashMaps.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        /*  -order get maintained in linked hashmap
        -Insertion order get maintained in this hashmap
        -Thats why its a bit slow compare to hashmap */
        LinkedHashMap<String, Integer> lmap = new LinkedHashMap<>(10,0.3f,true);
        lmap.put("mango", 3);
        lmap.put("guava", 5);
        lmap.put("orange", 4);
        for(Map.Entry<String, Integer> el: lmap.entrySet()){
            System.out.println(el.getKey()+": "+ el.getValue()+"KG");
        }
        
        // if we try to get any input so it will put the value at the end of the map due to access order true
        // Access order true force linked hashmap to add the recent read element to the last of the map
        System.out.println(lmap.get("guava"));
        
        for(Map.Entry<String, Integer> el: lmap.entrySet()){
            System.out.println(el.getKey()+": "+ el.getValue()+"KG");
        }
    }
}
