package com.collectionframework.Sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;

public class About {
    public static void main(String[] args) {
        // its a set of collection that can not contains duplicates
        // Faster operation

        // unordered
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(15);
        set.add(12);
        set.add(18);
        System.out.println(set);


        // ordered (input order)
        Set<Integer> setTwo = new LinkedHashSet<>();
        setTwo.add(10);
        setTwo.add(15);
        setTwo.add(12);
        setTwo.add(18);
        System.out.println(setTwo);


        // sorted
        Set<Integer> setThree = new TreeSet<>();
        setThree.add(10);
        setThree.add(15);
        setThree.add(12);
        setThree.add(18);
        System.out.println(setThree);



        // Create any set a thread safe set
        Set<Integer> threadSafeSet = Collections.synchronizedSet(setThree); // its now a good choice to use this for thread safety
        Set<Integer> threadSafeSetTwo = new ConcurrentSkipListSet<>(); // recommonded
    }    
}
