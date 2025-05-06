package com.java.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamAPIDemo {
    public static void main(String[] args) {

        // filter the numbers which is divisible by 2 using predicate
        Integer[] arr = {2, 4, 5, 6, 8, 10, 15, 20, 30};

        Predicate<Integer> checkNumbers = a -> a % 2 == 0;

        List<Integer> collect = Arrays.stream(arr).filter(checkNumbers).collect(Collectors.toList());
        System.out.println(collect);
    }
}
