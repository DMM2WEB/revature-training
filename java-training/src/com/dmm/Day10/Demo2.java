package com.dmm.Day10;

class ThreadClassDemo2 implements Runnable {
    @Override
    public void run () {
        System.out.println("Thread is running with implements...");
    }
}

public class Demo2 {
    public static void main(String[] args) {
        ThreadClassDemo2 thread = new ThreadClassDemo2();
        Thread t1 = new Thread (thread);
        t1.start();
    }
}
