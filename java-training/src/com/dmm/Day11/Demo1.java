package com.dmm.Day11;

class ThreadJoinMethod extends Thread {
    @Override
    public void run() {
        for (int i=0; i<5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread Name:" + Thread.currentThread().getName());
            System.out.println(i);
        }
    }
}

public class Demo1 {
    public static void main(String[] args) {
        ThreadJoinMethod t1 = new ThreadJoinMethod();
        ThreadJoinMethod t2 = new ThreadJoinMethod();
        ThreadJoinMethod t3 = new ThreadJoinMethod();
        t1.start();
        try {
            t1.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
       /* try {
            t2.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        t3.start();
        /*try {
            t3.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }
}
