package com.collectionframework.Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class About {
    public static void main(String[] args) {
        // A DS that works on the FIFO principle
        // LL as queue
        
        LinkedList<Integer> q = new LinkedList<>();
        q.addLast(1); // enqueue
        q.addLast(3);
        q.addLast(2);
        q.addLast(4);
        System.out.println(q);

        q.removeFirst(); // dequeue
        System.out.println(q);

        System.out.println(q.peek());





        // In hava we have queue but in interface form we can use it with linked list
        Queue<Integer> qlist = new LinkedList<>();
        qlist.add(1); 
        qlist.add(3); 
        qlist.add(2); 
        qlist.add(5);
        System.out.println(qlist.poll()); //use poll intead of remove, poll return null and remove return exception in case of empty
        System.out.println(qlist.peek());
        System.out.println(qlist); 



        // queue with fixed size
        Queue<Integer> listTwo = new ArrayBlockingQueue<>(2);
        listTwo.add(1);
        listTwo.add(2);
        // no exception if we use offer
        listTwo.offer(4); // return boolean
        listTwo.offer(5);
        listTwo.offer(6);
        // // throws exception 
        // listTwo.add(3);

        System.out.println(listTwo);

    }
}
