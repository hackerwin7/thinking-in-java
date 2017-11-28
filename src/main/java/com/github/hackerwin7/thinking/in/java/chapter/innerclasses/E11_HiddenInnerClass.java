package com.github.hackerwin7.thinking.in.java.chapter.innerclasses;

import com.github.hackerwin7.thinking.in.java.chapter.innerclasses.exercise6.SimpleInterface;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/06/30
 * Time: 4:15 PM
 * Desc:
 * Tips:
 */
public class E11_HiddenInnerClass {
    public static void main(String[] args) {
        Outer5 out = new Outer5();
        SimpleInterface si = out.get();
        si = out.get2();
        // won't compile -- 'Inner' not visible:
        //! Inner i1 = out.get2();
        //! Inner i2 = (Inner) si;
    }
}

class Outer5 {
    private class Inner implements SimpleInterface {
        public void f() {
            System.out.println("Outer5.Inner.f");
        }
    }
    public SimpleInterface get() { return new Inner(); }
    public Inner get2() { return new Inner(); }
}