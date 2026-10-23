package com.balia.MultiThreading;

public class DOcument_Difference_of_Thread_use_and_Runnable_use {

}
/**
 * 
 *
class Employee {
    void display() {
        System.out.println("Employee details");
    }
}

class Developer extends Thread {

    public void run() {
        System.out.println("Developer is writing code");
    }
}

public class Main {
    public static void main(String[] args) {

        Developer d = new Developer();

        d.start();
    }
}






class Employee {
    void display() {
        System.out.println("Employee details");
    }
}

class Developer extends Employee implements Runnable {

    public void run() {
        System.out.println("Developer is writing code");
    }
}

public class Main {
    public static void main(String[] args) {

        Developer d = new Developer();

        d.display();

        Thread t = new Thread(d);

        t.start();
    }
}
*/