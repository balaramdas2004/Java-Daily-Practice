package com.balia.MultiThreading;

class SharedData {
private volatile boolean flag = false;

public void startThread() {

    Thread writer = new Thread(() -> {
        try {
            System.out.println("Writer thread started");

            Thread.sleep(2000);

            flag = true;

            System.out.println("Writer changed flag to true");

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    });

    Thread reader = new Thread(() -> {
        System.out.println("Reader thread started");

        while (!flag) {
            // Wait until flag becomes true
        }

        System.out.println("Reader detected the updated flag");
    });

    writer.start();
    reader.start();
}

}

public class Volatile_Keyword_used_and_its_benifits_demo1 {
public static void main(String[] args) {
new SharedData().startThread();
}
}
