package com.java.Exception;

public class SimpleException {
    public void validateAge(int age) throws IllegalAgeException {
        if (age < 18) {
            throw new IllegalAgeException("Age is less than 18");
        } else {
            System.out.println("Age is valid");
        }
    }


    public static void main(String[] args) throws IllegalAgeException {
        SimpleException ageValidator = new SimpleException();
        ageValidator.validateAge(10);
    }
}
