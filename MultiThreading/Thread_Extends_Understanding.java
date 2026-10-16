package com.balia.MultiThreading;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello");
    }
}

class Thread_Extends_Understanding {
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();

        System.out.println(t.isAlive());

        t.start();
        t.join();

        System.out.println(t.isAlive());
    }
}