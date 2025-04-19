package com.collectionframework.Streams.StreamsDemo;

import java.util.List;
import java.util.stream.Stream;

public class ParallelStream {
    public static void main(String[] args) {
        // a type of stream that enables parellal processing of stream
        // aloowing multiple threads to process parts of the stream simultaniously
        // This can singnificantly improve performance for large data sets
        // Workload is distributed across multiple threads

        long startTime = System.currentTimeMillis();
        List<Integer> list = Stream.iterate(1, x->x+1).limit(20000).toList();
        List<Long> factoralList = list.parallelStream().map(x -> factorial(x)).toList();
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime + " ms");


    }
    private static long factorial(int n){
        long result = 1;
        for(int i = 2; i<=n; i++){
            result*=i;
        }
        return result;
    }
}
