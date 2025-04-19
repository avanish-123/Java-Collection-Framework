package com.collectionframework.Streams.StreamsDemo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOperations {
    public static void main(String[] args) {
        List<Integer> list  = Arrays.asList(1,6,2,2,3,3,4,5,6,7,11);
        // collect, count
        

        //Count
        System.out.println(list.stream().skip(1).collect(Collectors.toList()));
        System.out.println(list.stream().skip(1).collect(Collectors.toSet()));

        //forEach
        list.stream().forEach(x -> System.out.print(x + " "));
        System.out.println();


        // reduce
        Optional<Integer> opInt = list.stream().reduce((x,y) -> x+y);
        System.out.println(opInt.get());

        // count
        System.out.println(list.stream().filter(x -> x%2==0).count());


        // anyMatch, allMatch, AnyMatch
        boolean isEvenPresent = list.stream().anyMatch(x -> x%2==0);
        System.out.println(isEvenPresent);

        boolean isAllGreaterThenZero = list.stream().allMatch(x -> x>0);
        System.out.println(isAllGreaterThenZero);

        boolean isAllSmallerThenTen = list.stream().noneMatch(x -> x>10);
        System.out.println(isAllSmallerThenTen);


        // findFirst, findAny
        System.out.println(list.stream().findFirst().get());
        System.out.println(list.stream().findAny().get());




        // Examples
        List<String> names = Arrays.asList("Anna", "Bob", "Charlie","Mo");
        System.out.println(names.stream().filter(x -> x.length()>3).collect(Collectors.toList()));


        List<Integer> nums = Arrays.asList(5,2,9,1,6);
        System.out.println(nums.stream().map(x -> x*x).sorted().collect(Collectors.toList()));
        
        
        
        List<Integer> ints = Arrays.asList(5,2,9,1,6);
        System.out.println(ints.stream().reduce((x,y) -> (x+y)).get());


        String sentence = "Hello World!";
        System.out.println(sentence.chars().filter(x -> x=='l').count());
    }
}
