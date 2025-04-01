package com.collectionframework.lists.CopyOnWriteArrayLists;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDEmo {
    public static void main(String[] args) {
        // When write operation done it create new copy of list and do the write operation. In multithreading, the other thread will not get the updated data if any thread do any type of write operation
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);


        // we are doing both read and write operation in read it will only print upto 3 becouse of the copy and add the element in if condition
        for(int i: list){
            System.out.println(i);
            if(i==2){
                list.add(4);
            }
        }

        // Effective for read more operation becouse in write in create copy so its use more memory
        System.out.println(list);

        
    }
    
}
