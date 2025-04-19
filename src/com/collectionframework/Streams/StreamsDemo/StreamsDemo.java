package com.collectionframework.Streams.StreamsDemo;

import java.util.Arrays;
import java.util.List;

public class StreamsDemo {
    public static void main(String[] args) {
        // Feature in java 8
        // process collections of data in a functional and declarative manner
        // Simplefy data processing
        // Embrace functional programming
        //Improve readibilify and maintainability,
        // Enable easy parallalism


        // what's stream?
        // A sequence of elements supporting functional and declarative programming


        // How to use stream?
        // Source, intermediate operation and terminal operation
        
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        System.out.println(numbers.stream().count());
        System.out.println(numbers.stream().filter(x -> x%2==0).count());
        

        
        
        


    }
}
