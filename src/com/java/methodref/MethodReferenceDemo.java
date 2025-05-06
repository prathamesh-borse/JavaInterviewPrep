package com.java.methodref;

import java.util.function.BiFunction;
import java.util.function.Function;

interface Printable {
    void print(String msg);
}

public class MethodReferenceDemo {

    public void display(String msg) {
        msg = msg.toUpperCase();
        System.out.println(msg);
    }

    private static int addition(int a, int b) {
        return (a + b);
    }


    public static void main(String[] args) {

        // 1. Method Reference to a static method
        // Lambda Expression
        Function<Integer, Double> function = (input) -> Math.sqrt(input);
        System.out.println(function.apply(4));

        // Method Reference
        Function<Integer, Double> functionMethodRef = Math::sqrt;
        System.out.println(functionMethodRef.apply(4));


        // lambda Expression
        BiFunction<Integer, Integer, Integer> biFunctionLambda = (a, b) -> MethodReferenceDemo.addition(a, b);
        System.out.println(biFunctionLambda.apply(10, 20));

        // Using Method Reference
        BiFunction<Integer, Integer, Integer> biFunctionLambdaAddition = MethodReferenceDemo::addition;
        System.out.println(biFunctionLambdaAddition.apply(10, 20));

        // 2. Method reference to an instance of an object
        MethodReferenceDemo methodReferenceDemo = new MethodReferenceDemo();

        // Lambda Expression
        Printable printable = (msg) -> methodReferenceDemo.display(msg);
        printable.print("hello, world");

        Printable printable1 = methodReferenceDemo::display;
        printable1.print("hello, world");
    }
}
