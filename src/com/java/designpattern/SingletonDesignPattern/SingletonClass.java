package com.java.designpattern.SingletonDesignPattern;

public class SingletonClass {

    // create the static instance of singleton class
    private static SingletonClass singletonClass = new SingletonClass();

    // create the private constructor
    private SingletonClass() {

    }

    public static SingletonClass getSingletonClass() {
        return singletonClass;
    }

    public void simpleMethod() {
        System.out.println("Hashcode of singleton class: " + singletonClass);
    }
}
