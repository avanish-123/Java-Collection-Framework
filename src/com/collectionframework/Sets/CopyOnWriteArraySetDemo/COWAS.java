package com.collectionframework.Sets.CopyOnWriteArraySetDemo;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class COWAS {
    public static void main(String[] args) {
        // Thread safe
        // Copy-on-write machenism
        // no duplicate
        // Iterable do not reflact modification

        CopyOnWriteArraySet<Integer> copyOnWriteSet = new CopyOnWriteArraySet<>();
        copyOnWriteSet.add(1);
        copyOnWriteSet.add(2);
        copyOnWriteSet.add(3);
        copyOnWriteSet.add(4);
        // we don't get 5 in iteration list 
        for(Integer i: copyOnWriteSet){
            System.out.println(i);
            copyOnWriteSet.add(5);
        }
        System.out.println(copyOnWriteSet);






        ConcurrentSkipListSet<Integer> concurrentSkipListSet = new ConcurrentSkipListSet<>();
        concurrentSkipListSet.add(1);
        concurrentSkipListSet.add(2);
        concurrentSkipListSet.add(3);
        concurrentSkipListSet.add(4);
        // here we will get 5 in iteration list 
        for(Integer i: concurrentSkipListSet){
            System.out.println(i);
            concurrentSkipListSet.add(5);
        }
        System.out.println(concurrentSkipListSet);
    }
}
