package com.dmm.Day03;

// Without static
/*class Counter {
    int count = 0;

    public Counter () {
        count++; // increment value
        System.out.println(count);
    }
}*/

// With static
class Counter {
    static int count = 0;

    public Counter () {
        count++; // increment value
        System.out.println(count);
    }
}

public class Demo9 {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
    }
}
