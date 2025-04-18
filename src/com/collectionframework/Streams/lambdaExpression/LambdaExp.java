package com.collectionframework.Streams.lambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaExp {
    public static void main(String[] args) {
        // lambda expression is a anonymous function (No name, no return type, no access modifiers)

        Thread t1 = new Thread(new Task());
        
        // Example One
        // with lambda
        Thread t2Thread = new Thread(() -> {
            System.out.println("World");
        });
        

        
        // Example Two
        MathOperation SumOps = (int a, int b) -> {return a+b;};
        MathOperation SubtractOps = (int a, int b) -> {return a-b;};
        System.out.println(SumOps.operate(2, 3));
        System.out.println(SubtractOps.operate(2, 3));




        // Predicate ----> Functional interface (Boolena valued function)
        Predicate<Integer> isEven = x -> x%2==0;
        System.out.println(isEven.test(10));
        System.out.println(isEven.test(7));


        // function
        Function<Integer, Integer> doubleInt = x -> 2*x;
        Function<Integer, Integer> TripleInt = x -> 3*x;
        System.out.println(doubleInt.apply(10));
        System.out.println(TripleInt.apply(10));



        // Consumer (only consume didn't return anything)
        Consumer<Integer> cons = (x) -> System.out.println(x);
        cons.accept(10);


        // Supplier
        Supplier<String> giveHelloWorld = () -> "Hello! World";
        System.out.println(giveHelloWorld.get());



        // combined example
        Predicate<Integer> even = (x) -> x%2==0;
        Function<Integer, Integer> sqr = (x) -> x*x;
        Consumer<Integer> consumer = (x) -> System.out.println(x);
        Supplier<Integer> supp = () -> 101;   
        
        if(even.test(supp.get())){
            consumer.accept(sqr.apply(supp.get()));
        }




        // BiPredicate, BiConsumer, BiFunction
        BiPredicate<Integer, Integer> isSumEven = (x,y) -> (x+y)%2==0;
        BiConsumer<Integer, Integer> print  =(x, y) -> {
            System.out.println(x + " " +y);
        };
        // first two are types of input last one is return type
        BiFunction<String, String, Integer> biFunc = (x, y) -> (x+y).length();
        System.out.println(biFunc.apply("a", "bcd"));





        // Method reference ---> use method without envoking and in place of lambda expression
        List<String> std = Arrays.asList("Avanish", "Shivam", "Himanshu");
        std.forEach(x -> System.out.println(x));
        std.forEach(System.out::println); // with method reference



    }
}

class Task implements Runnable {
    @Override
    public void run(){
        System.out.println("Hello");
    }
}



interface MathOperation {
    int operate(int a, int b);
}
