package com.github.hackerwin7.thinking.in.java.chapter.innerclasses;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/07/05
 * Time: 4:50 PM
 * Desc:
 * Tips:
 */
public class E21_InterfaceWithNested2 {
    public static void main(String[] args) {
        I impl = new I() {
            public void f() {

            }

            public void g() {

            }
        };
        I.Nested.call(impl);
    }
}

interface I {
    void f();
    void g();
    class Nested {
        static void call(I impl) {
            System.out.println("Calling I.f()");
            impl.f();
            System.out.println("Calling I.g()");
            impl.g();
        }
    }
}