package com.balia.MultiThreading;

class SharedData1 {
    boolean flag = false;

    public void startThread() {

        // Writer thread
        Thread writer = new Thread(() -> {
            try {
                System.out.println("Writer started");
                Thread.sleep(2000);

                flag = true;

                System.out.println("Writer changed flag to true");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Reader thread
        Thread reader = new Thread(() -> {
            System.out.println("Reader started");

            while (!flag) {
                // Waiting
            }

            System.out.println("Reader detected the updated flag");
        });

        writer.start();
        reader.start();
    }
}

public class NOt_Volatile_Keyword_used_and_its_benifits_demo1 {
    public static void main(String[] args) {
        new SharedData1().startThread();
    }
}