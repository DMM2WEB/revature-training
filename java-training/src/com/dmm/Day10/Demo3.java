package com.dmm.Day10;

class ThreadSleepDemo extends Thread {
    @Override
    public void run () {
        for (int i=0; i<10; i++) {
            System.out.println(i);

            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Demo3 {
    public static void main(String[] args) {
        ThreadSleepDemo t1 = new ThreadSleepDemo();
        ThreadSleepDemo t2 = new ThreadSleepDemo();

        t1.start();
        t2.start();

        System.out.println("Thread is running with sleeps in 1000 millis...");
    }
}
