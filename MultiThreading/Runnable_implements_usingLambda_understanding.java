package com.balia.MultiThreading;

/**	Here we use lambda because the anonymous class is implementing 
	runnable Functional interface so reference type is Runnable;*/
class Runnable_implements_usingLambda_understanding {
    public static void main(String[] args) throws InterruptedException {

        Runnable task = () -> System.out.print("Hello");

        Thread t = new Thread(task);

        System.out.println(t.isAlive());

        t.start();
        t.join();

        System.out.println(t.isAlive());
    }
}

// another format of this lambda expression

/**
	class Main {
    public static void main(String[] args) throws InterruptedException {
		
		//**here - Runnable r = ()-> System.out.print("hello"); is not required
		
      	Thread t = new Thread(() -> System.out.print("Hello"));

        System.out.println(t.isAlive());

        t.start();
        t.join();

        System.out.println(t.isAlive());
    }
}
*/