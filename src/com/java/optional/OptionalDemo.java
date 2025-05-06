package com.java.optional;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        String email = "ramesh123@gmail.com";

        // of, empty, nullable
        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

//        Optional<String> emailOptional = Optional.of(email);
//        System.out.println(emailOptional);

        Optional<String> emailOptional1 = Optional.ofNullable(email);
        System.out.println(emailOptional1);

        // Optional Get method to get the object value
        Optional<String> emailOptional2 = Optional.ofNullable(email);
        System.out.println(emailOptional2.get());

    }
}
