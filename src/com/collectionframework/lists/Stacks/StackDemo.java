package com.collectionframework.lists.Stacks;
// it follows LIFO structure

import java.util.Stack;

public class StackDemo {
    public static void main(String... args){
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(40);
        st.push(50);
        st.push(60);
        st.push(70);
        System.out.println(st);

        int remoevdLastElement = st.pop(); // return last element and also remove it from the array
        System.out.println(remoevdLastElement);

        System.out.println(st.peek()); // return last 

        System.out.println(st.size()); 

        System.out.println(st.isEmpty()); 

        System.out.println(st);
        st.add(45);
        st.add(2, 80); // add  on index and adjust the exiting element to next position


        System.out.println(st.search(60)); //It has onr based indexing and also it return the idnex of element frm top i.e. from end return -1 if not exist


        System.out.println(st);
    }
    
}
