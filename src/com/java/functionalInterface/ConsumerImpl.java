package com.java.functionalInterface;

import java.util.function.Consumer;

class ConsumerDemo implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}

public class ConsumerImpl {

    public static void main(String[] args) {
        Consumer<String> consumer = new ConsumerDemo();
        consumer.accept("Hello, World!");

        Consumer<String> consumer1 = (String s) -> System.out.println(s);
        consumer1.accept("Hello, World!");
    }
}
