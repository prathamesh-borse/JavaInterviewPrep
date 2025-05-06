package com.java.functionalInterface;

import java.util.function.Function;

class FunctionImpl implements Function<String, Integer> {

    @Override
    public Integer apply(String s) {
        return s.length();
    }
}

public class FunctionDemo {
    public static void main(String[] args) {
//        Function<String, Integer> function = new FunctionImpl();
//        System.out.println(function.apply("Ramesh"));

        Function<String, Integer> function1 = (String s) -> s.length();
        System.out.println(function1.apply("Ramesh"));

        // Replaced Lambda Expression with static method reference
        Function<String, Integer> function2 = String::length;
        System.out.println(function2.apply("Ramesh"));
    }
}
