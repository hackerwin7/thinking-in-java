package com.github.hackerwin7.thinking.in.java.chapter.interfaces;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/03/02
 * Time: 8:42 PM
 * Desc:
 * Tips:
 */
public class E13_Diamond {
    public static void main(String[] args) {
        new CombinedImpl().f();
    }
}

interface BaseInterface {
    void f();
}

interface IntermediateInterface1 extends BaseInterface {
    void f();
}

interface IntermediateInterface2 extends BaseInterface {
    void f();
}

interface CombinedInterface extends IntermediateInterface1, IntermediateInterface2 {
    void f();
}

class CombinedImpl implements CombinedInterface {
    public void f() {
        System.out.println("CombinedImpl.f()");
    }
}