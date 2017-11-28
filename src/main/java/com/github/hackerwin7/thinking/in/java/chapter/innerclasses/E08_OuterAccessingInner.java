package com.github.hackerwin7.thinking.in.java.chapter.innerclasses;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/06/30
 * Time: 3:05 PM
 * Desc:
 * Tips:
 */
public class E08_OuterAccessingInner {
    public static void main(String[] args) {
        Outer4 o = new Outer4();
        o.testInnerAccess();
    }
}

class Outer4 {
    class Inner {
        private int j;
        private void h() {
            System.out.println("Inner.h called");
            System.out.println("Inner.j = " + j);
        }
    }
    public void testInnerAccess() {
        Inner i = new Inner();
        i.j = 47; // Outer class can access inner class's private field
        i.h();
    }
}