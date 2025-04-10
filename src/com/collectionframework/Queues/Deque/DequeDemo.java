package com.collectionframework.Queues.Deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
    public static void main(String[] args) {
        // Double ended queue
        // Allow insertion and removal of elements from both ends
        // Verstile than regular queues and stacks because they support all operations

        Deque<Integer> dequeOne = new ArrayDeque<>(); // faster iteration, no null, low memory
        dequeOne.addFirst(10);
        dequeOne.addLast(15);
        dequeOne.offerFirst(12);
        dequeOne.offerLast(23);
        System.out.println(dequeOne);
        System.out.println(dequeOne.getFirst());
        System.out.println(dequeOne.getLast());
        dequeOne.removeFirst();
        dequeOne.pollLast();
        System.out.println(dequeOne);



        

        System.out.println("----DequeTwo(LinkedList)----");
        Deque<Integer> dequeTwo = new LinkedList<>(); // better for insertion, deletion
        dequeTwo.addFirst(10);
        dequeTwo.addLast(15);
        dequeTwo.offerFirst(12);
        dequeTwo.offerLast(23);
        System.out.println(dequeTwo);
        System.out.println(dequeTwo.getFirst());
        System.out.println(dequeTwo.getLast());
        dequeTwo.removeFirst();
        dequeTwo.pollLast();
        System.out.println(dequeTwo);

        
    }
    
}
