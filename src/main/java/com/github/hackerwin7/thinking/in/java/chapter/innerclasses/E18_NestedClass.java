package com.github.hackerwin7.thinking.in.java.chapter.innerclasses;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/07/05
 * Time: 4:10 PM
 * Desc:
 * Tips:
 */
public class E18_NestedClass {
    static class Nested {
        void f() { System.out.println("Nested.f"); }
    }
    public static void main(String args[]) {
        Nested ne = new Nested();
        ne.f();
    }
    class Nested1 {
        void f() { System.out.println("Nested1.f"); }
    }
}

class Other {
    void f() {
        E18_NestedClass.Nested ne = new E18_NestedClass.Nested();
        E18_NestedClass nc = new E18_NestedClass();
        E18_NestedClass.Nested1 ne1 = nc.new Nested1();
    }
}
