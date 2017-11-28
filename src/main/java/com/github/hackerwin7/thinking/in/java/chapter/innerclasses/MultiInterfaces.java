package com.github.hackerwin7.thinking.in.java.chapter.innerclasses;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/07/06
 * Time: 10:52 AM
 * Desc:
 * Tips:
 */
public class MultiInterfaces {
    static void takesA(A a) {}
    static void takesB(B b) {}
    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        takesA(x);
        takesA(y);
        takesB(x);
        takesB(y.makeB());
    }
}

interface A {}
interface B {}

class X implements A, B {}

class Y implements A {
    B makeB() {
        return new B() {
        };
    }
}