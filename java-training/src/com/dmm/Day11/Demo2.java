package com.dmm.Day11;

//without synchronization
/*class Table {
    public void printTable (int number) {
        for (int i=1; i<=10; i++) {
            System.out.println(number + "x" + i + "=" + number * i);
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}*/

//with synchronization
class Table {
    public synchronized void printTable (int number) {
        for (int i=1; i<=10; i++) {
            System.out.println(number + "x" + i + "=" + number * i);
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThread1 extends Thread {
    Table table;

    public MyThread1 (Table table) {
        this.table = table;
    }

    @Override
    public void run() {
        table.printTable(5);
    }
}

class MyThread2 extends Thread {
    Table table;

    public MyThread2 (Table table) {
        this.table = table;
    }

    @Override
    public void run() {
        table.printTable(50);
    }
}

public class Demo2 {
    public static void main(String[] args) {
        Table table = new Table();
        MyThread1 t1 = new MyThread1(table);
        MyThread2 t2 = new MyThread2(table);

        t1.start();
        t2.start();

    }
}
