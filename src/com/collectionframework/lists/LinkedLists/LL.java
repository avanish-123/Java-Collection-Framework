package com.collectionframework.lists.LinkedLists;

import java.util.LinkedList;
import java.util.List;

public class LL {
    public static void main(String[] args) {
        // LL is a linear DS where each element is a separate object classed a node.
        List<Integer> numberLList = new LinkedList<>();
        numberLList.add(10);
        numberLList.add(50);
        numberLList.add(30);
        numberLList.add(20);
        System.out.println(numberLList);
        
        
        System.out.println(numberLList.get(2)); // get node/index element O(n)
        
        numberLList.remove(2); // remove any node/index O(1)
        System.out.println(numberLList);


        numberLList.set(1, 5); // replace a node/index

        numberLList.add(2, 15); // add a new element in LL and move next element to next index/node


        numberLList.addLast(3);
        numberLList.addFirst(6);



        System.out.println(numberLList);

    }
}
 