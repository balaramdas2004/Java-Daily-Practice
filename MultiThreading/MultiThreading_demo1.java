package com.balia.MultiThreading;


class MyTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}

public class MultiThreading_demo1 {
    public static void main(String[] args) {

        MyTask task = new MyTask();

        Thread t = new Thread(task);

        t.start();
    }
}