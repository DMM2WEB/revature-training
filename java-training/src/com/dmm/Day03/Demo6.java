package com.dmm.Day03;

// Simple
/*class A {
    public void test1 () {

    }
}

class B extends A {
    public void test2 () {

 }
}*/


// Multi-level
/*class A {
    public void test1 () {

    }
}

class B extends A {
    public void test2 () {

    }
}

class C extends B {
    public void test3 () {

    }
}*/


// Hierarchy
class A {
    public void test1 () {
        System.out.println("Class A");
    }
}

class B extends A {
    public void test2 () {
        System.out.println("Class B");
    }
}

class C extends A {
    public void test3 () {
        System.out.println("Class C");
    }
}

// Multiple (Not allowed)
/*class A {
    public void test1 () {

    }
}

class B extends A {
    public void test2() {

    }
}*/


// Hybrid (Not allowed)
/*class C extends A, B {
    public void test3 () {

    }
}*/


public class Demo6 {
    public static void main(String[] args) {

/*        A a = new A ();
        a.test1();

        B b = new B ();
        b.test2();
        b.test1();*/

/*         A a = new A ();
         a.test1();

         B b = new B ();
         b.test1();
         b.test2();

         C c = new C();
         c.test1();
         c.test2();
         c.test3();*/

        A a = new A ();
        a.test1();

        B b = new B ();
        b.test2();
        b.test1();

        C c = new C ();
        c.test3();
        c.test1();

    }
}
