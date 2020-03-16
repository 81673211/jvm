package main.java;

import java.util.Scanner;

public class JConsoleShowJVM {

    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        in.next();
        createBusyThread();

        in.next();

        final Object lock = new Object();
        createLockThread(lock);
    }

    private static void createBusyThread() {
        new Thread(() -> {
            while (true) {

            }
        }, "while_true").start();
    }

    private static void createLockThread(Object lock) {
        new Thread(() -> {
            synchronized (lock) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "lock").start();
    }
}
