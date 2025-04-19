package com.collectionframework.Streams.StreamsDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperations {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Avanish", "Shivam", "Himanshu", "Aditya", "Avanish");
        // filter
        System.out.println(list.stream().filter(x -> x.startsWith("A")).count());
        

        // MAP
        Stream<String> uppercaseName = list.stream().map(x -> x.toUpperCase());

        // sorted
        Stream<String> sorted = list.stream().sorted(); // by natural ordering
        Stream<String> compSorted = list.stream().sorted((a,b) -> b.length() - a.length()); // own comparator


        // distinct
        Stream<String> distinct = list.stream().distinct();
        System.out.println(list.stream().distinct().count());


        // limit
        System.out.println(Stream.iterate(1, x -> x+1).limit(3).count());

        // 


    }
}
