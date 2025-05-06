package com.java.functionalInterface;

class ThreadDemo implements Runnable {

    @Override
    public void run() {
        System.out.println("Run method called ... ");
    }
}

public class ThreadRunnable {

    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadDemo());
        thread.start();

        // Lambda Expression using Runnable
        Runnable runnable = () -> System.out.println("Run method called using lambda expression ... ");
        Thread thread1 = new Thread(runnable);
        thread1.start();

        Thread thread2 = new Thread(() -> System.out.println("Run method called using lambda expression ... "));
        thread2.start();
    }
}
