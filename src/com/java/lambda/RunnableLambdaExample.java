package com.java.lambda;

class ThreadDemo implements Runnable {

    @Override
    public void run() {
        System.out.println("Run method called ...");
    }
}

public class RunnableLambdaExample {
    public static void main(String[] args) {

        Thread thread = new Thread(new ThreadDemo());
        thread.start();

        Runnable runnable = () -> System.out.println("Run method called using lambda ...");
        Thread threadLambda = new Thread(runnable);
        threadLambda.start();

        // Lambda Expression as a Method Parameter
        Thread threadLambda1 = new Thread(() -> System.out.println("Run method called using lambda as Method Parameter ..."));
        threadLambda1.start();
    }
}
