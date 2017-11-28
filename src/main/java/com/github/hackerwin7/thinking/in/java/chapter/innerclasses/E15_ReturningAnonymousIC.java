package com.github.hackerwin7.thinking.in.java.chapter.innerclasses;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/07/03
 * Time: 3:30 PM
 * Desc:
 * Tips:
 */
public class E15_ReturningAnonymousIC {
    public static void main(String[] args) {
        Second sec = new Second();
        NoDefault nd = sec.get1(47);
        nd.f();
        nd = sec.get2(99);
        nd.f();
    }
}

class NoDefault {
    private int i;
    public NoDefault(int i) { this.i = i; }
    public void f() { System.out.println("NoDefault.f"); }
}

class Second {
    public NoDefault get1(int i) {
        return new NoDefault(i) {};
    }
    public NoDefault get2(int i) {
        return new NoDefault(i) {
            public void f() {
                System.out.println("Second.get2.f");
            }
        };
    }
}