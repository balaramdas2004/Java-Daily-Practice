package com.balia.MultiThreading;

class MyThreads implements Runnable {
    @Override
    public void run() {
        System.out.print("Hello");
    }
}

class Runnable_Implementing_understanding {
    public static void main(String[] args) throws InterruptedException {
        MyThreads task = new MyThreads();

        Thread t = new Thread(task);

        System.out.println(t.isAlive());

        t.start();
        t.join();

        System.out.println(t.isAlive());
    }
}