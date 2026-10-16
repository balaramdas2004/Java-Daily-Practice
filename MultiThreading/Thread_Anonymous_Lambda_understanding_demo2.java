package com.balia.MultiThreading;

class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.print("Hello");
    }
}

class Thread_Anonymous_Lambda_understanding_demo2 {
    public static void main(String[] args) throws InterruptedException {
        MyThread2 t = new MyThread2();

        System.out.println(t.isAlive());

        t.start();
        t.join();

        System.out.println(t.isAlive());
    }
}
/**
 * Thread t = new Thread() 
 * {
    	@Override
    	public void run() 
    	{
        	System.out.print("Hello");
    	}
	};
 * 
 * 
 * This code is not compile because Lambda expression only work on 
 * functional interface but Thread is a class not a functional interface 
 * 
	Thread t = () -> System.out.print("Hello"); // Compilation error
 */
