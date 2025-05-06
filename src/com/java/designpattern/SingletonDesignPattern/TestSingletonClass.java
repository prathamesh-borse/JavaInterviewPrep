package com.java.designpattern.SingletonDesignPattern;

import com.java.designpattern.AbstractFactoryDesignPattern.Teacher;

public class TestSingletonClass {
    public static void main(String[] args) {
        SingletonClass singletonClass = SingletonClass.getSingletonClass();
        singletonClass.simpleMethod();

        SingletonClass singletonClass1 = SingletonClass.getSingletonClass();
        singletonClass1.simpleMethod();

        Teacher teacher = new Teacher();
        System.out.println(teacher);

        Teacher teacher1 = new Teacher();
        System.out.println(teacher1);
    }
}
