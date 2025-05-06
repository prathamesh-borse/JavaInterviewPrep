package com.java.lambda;

interface Shape {
    void draw();
}

class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle Class : draw() method");
    }
}

class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square Class : draw() method");
    }
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle Class : draw() method");
    }
}

public class LambdaExample {
    public static void main(String[] args) {
//        Shape rectangle = () -> System.out.println("Rectangle Class : draw() method");
//        rectangle.draw();
//        Shape square = () -> System.out.println("Square Class : draw() method");
//        square.draw();
//        Shape circle = () -> System.out.println("Circle Class : draw() method");
//        circle.draw();

        // Passing Lambda Expression as a Method Parameter
        print(() -> System.out.println("Rectangle Class : draw() method"));
        print(() -> System.out.println("Square Class : draw() method"));
        print(() -> System.out.println("Circle Class : draw() method"));

    }

    private static void print(Shape shape) {
        shape.draw();
    }
}