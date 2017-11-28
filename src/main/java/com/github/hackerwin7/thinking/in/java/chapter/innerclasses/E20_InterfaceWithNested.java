package com.github.hackerwin7.thinking.in.java.chapter.innerclasses;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/07/05
 * Time: 4:41 PM
 * Desc:
 * Tips:
 */
public class E20_InterfaceWithNested {
    public static void main(String[] args) {
        B2 b = new B2();
        WithNested.Nested ne = new WithNested.Nested(5);
        ne.f();
    }
}

interface WithNested {
    int k = 1; // static + final
    class Nested {
        int i;
        public Nested(int i) { this.i = i; }
        void f() { System.out.println("Nested.f"); }
    }
}

class B2 implements WithNested {
}