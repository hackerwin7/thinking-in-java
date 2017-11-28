package com.github.hackerwin7.thinking.in.java.chapter.innerclasses;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/07/06
 * Time: 10:58 AM
 * Desc:
 * Tips:
 */
public class MultiImplementation {
    static void takesD(D d) {}
    static void takesE(E e) {}
    public static void main(String[] args) {
        Z z = new Z();
        takesD(z);
        takesE(z.makeE());
    }
}

class D {}

abstract class E {}

class Z extends D {
    E makeE() { return new E() {
    }; }
}