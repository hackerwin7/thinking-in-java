package com.github.hackerwin7.thinking.in.java.chapter.reusing;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/14
 * Time: 8:23 PM
 * Desc:
 * Tips:
 */
public class E04_ConstructorOrder {
    public static void main(String[] args) {
        new Derived2();
    }
}

class Base1 {
    public Base1() { System.out.println("Base1"); }
}

class Derived1 extends Base1 {
    public Derived1() { System.out.println("Derived1"); }
}

class Derived2 extends Derived1 {
    public Derived2() { System.out.println("Derived2"); }
}