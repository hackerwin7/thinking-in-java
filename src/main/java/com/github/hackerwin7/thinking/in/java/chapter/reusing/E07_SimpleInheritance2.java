package com.github.hackerwin7.thinking.in.java.chapter.reusing;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/15
 * Time: 10:22 AM
 * Desc:
 * Tips:
 */
public class E07_SimpleInheritance2 {
    public static void main(String[] args) {
        new C2("Init string");
    }
}

class A2 {
    public A2(String s) { System.out.println("A2(): " + s); }
}

class B2 {
    public B2(String s) { System.out.println("B2(): " + s); }
}

class C2 extends A2 {
    B2 b;
    public C2(String s) {
        super(s);
        b = new B2(s);
    }
}