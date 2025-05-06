package com.java.PredicateDemo;

import java.util.function.Predicate;

public class PredicateFunctionDemo {
    public static void main(String[] args) {

        PredicateFunctionDemo predicateFunctionDemo = new PredicateFunctionDemo();
        boolean result = predicateFunctionDemo.lengthString("Prathamesh");
        System.out.println("result: " + result);

        Predicate<String> checkLength = (String s) -> s.length() >= 5;
        System.out.println("The length of string is greater than 5: " + checkLength.test("Ram"));

    }

    public boolean lengthString(String s) {
        if (s.length() >= 5) {
            return true;
        }
        return false;
    }
}
