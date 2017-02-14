package com.github.hackerwin7.thinking.in.java.chapter.reusing;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/14
 * Time: 8:29 PM
 * Desc:
 * Tips:
 */
public class E05_SimpleInheritance {
    public static void main(String[] args) {
        new C();
    }
}

class A {
    public A() { System.out.println("A()"); }
}

class B {
    public B() { System.out.println("B()"); }
}

class C extends A {
    B b = new B();
}