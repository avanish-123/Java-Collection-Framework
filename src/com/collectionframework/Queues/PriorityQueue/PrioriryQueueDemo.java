package com.collectionframework.Queues.PriorityQueue;

import java.util.PriorityQueue;

public class PrioriryQueueDemo {
    public static void main(String[] args) {
        // Part of queue interface
        // Order element based on their natural ordering (for primitive lowest first) 
        // Does not allow null elements

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(15);
        pq.add(10);
        pq.add(30);
        pq.add(40);
        pq.add(35);
        pq.add(5);
        System.out.println(pq);
        pq.remove(); 
        System.out.println(pq);

        
    }
}
