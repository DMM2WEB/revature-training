package com.dmm.Day10;

class ThreadClassDemo extends Thread {
    @Override
    public void run () {
        System.out.println("Thread is running with extends...");
    }
}

public class Demo1 {
    public static void main(String[] args) {
        ThreadClassDemo thread = new ThreadClassDemo();
        thread.start();
    }
}
