package org.example.week05.thread;

public class TestThread extends Thread {
    @Override
    public void run() {
        System.out.println("test!");
        for (int i = 0; i < 100; i++) {
            System.out.print("*");
        }
    }
}
