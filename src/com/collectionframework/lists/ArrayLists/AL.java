package com.collectionframework.lists.ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AL {
    public static void main(String[] args) {
        //Internally its an array but it can grow or shrink its size
        // by default capacity is 10 and size is 0
        ArrayList<Integer> arrayList = new ArrayList<>();
        // List<Integer> arrayList = new ArrayList<>(20); user defined initial capacity of ArrayList
        // add element
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);

        // get element
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(2));
        System.out.println(arrayList.get(3));
        // System.out.println(arrayList.get(4)); exception becouse we dont have 4 elements

        // check existance
        System.out.println(arrayList.contains(10)); //true
        System.out.println(arrayList.contains(35)); //false


        // remove a perticular index element
        // for safety always pass wrapper class in case integers
        arrayList.remove(Integer.valueOf(2)); // index two element remove
        
        // automatic trim the size of array in case of element removal to save the memory
        arrayList.trimToSize();


        // remove existing element and add an element at perticulat element
        arrayList.add(3, 60);
        
        
        // replace a particular index element with new value
        arrayList.set(1, 50);
        
        
        
        
        
        
        System.out.println(arrayList);
        // Create on the fly array list 
        // add ot removal not allowed only replace is allowed
        System.out.println(Arrays.asList(10,20, 30, 40));
        // its import to refer List only
        List<String> weekends = Arrays.asList("Saturday", "Sunday");
        weekends.set(1, "Ravivaar");
        System.out.println(weekends);
        // another method
        // add, remove and replace all are not allowed
        System.out.println(List.of('A', 'B', 'C', 'D'));


        // Convert list to array
        Integer[] newArrList = arrayList.toArray(new Integer[0]); // Its an array now
        System.out.println(Arrays.toString(newArrList));
     } 
}

