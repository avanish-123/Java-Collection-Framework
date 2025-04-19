package com.collectionframework.Streams.StreamsDemo;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        // its utility class
        // provides a set of methods to create common collectors


        // collecting to a list
        List<String> list = Arrays.asList("Alice", "Bob", "Charlie", "Aiden");
        System.out.println(list.stream().filter(x -> x.startsWith("A")).collect(Collectors.toList()));    
        
        
        // collecting to a set
        List<Integer> nums = Arrays.asList(1,2,3,4,4,4,3,2,5,6);
        System.out.println(nums.stream().collect(Collectors.toSet()));


        // collecting to a map
        System.out.println(list.stream().collect(Collectors.toMap(x-> x.toUpperCase(), x-> x.length())));

        // collecting to a specific collection
        System.out.println(list.stream().collect(Collectors.toCollection(() -> new ArrayDeque<>())));

        // Joining strings
        System.out.println(list.stream().map(x ->x.toUpperCase()).collect(Collectors.joining(", ")));


        // Summerizing data
        // Generate statistical summary (Count, sum, min, average, max)
        IntSummaryStatistics stats = nums.stream().collect(Collectors.summarizingInt(x -> x));
        System.out.println("Count "+stats.getCount());
        System.out.println("Average "+stats.getAverage());
        System.out.println("Sum "+stats.getSum());
        System.out.println("Min "+stats.getMin());
        System.out.println("Max "+stats.getMax());


        // calculating average
        Double avg = nums.stream().collect(Collectors.averagingInt(x -> x));
        System.out.println(avg);

        // count
        System.out.println(nums.stream().collect(Collectors.counting()));


    }
}
