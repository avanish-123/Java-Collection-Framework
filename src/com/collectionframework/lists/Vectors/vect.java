package com.collectionframework.lists.Vectors;

import java.util.Vector;

public class vect {
    public static void main(String[] args) {
        // Unlike AL and LL its methods are thread safe which means multiple threads can work on vector without corrupting the data. Apart from this its almost same as AL

        Vector<Integer> vact = new Vector<>();
        vact.add(10);
        vact.add(20);
        vact.add(30);
        vact.add(15);
        System.out.println(vact);

        System.out.println(vact.get(0));
        System.out.println(vact.contains(20));

        System.out.println(vact.isEmpty());

        // all other methods are almost same as arraylist
        
        
        
        
        System.out.println(vact);
    }
}
