package com.github.hackerwin7.thinking.in.java.chapter.reusing;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/15
 * Time: 4:26 PM
 * Desc:
 * Tips:
 */
public class E13_InheritedOverloading {
    public static void main(String[] args) {
        MoreOverloads mo = new MoreOverloads();
        mo.f(1);
        mo.f('c');
        mo.f(1.1);
        mo.f("Hello");
    }
}

class ThreeOverloads {
    public void f(int i) {
        System.out.println("f(int i)");
    }
    public void f(char c) {
        System.out.println("f(char c)");
    }
    public void f(double d) {
        System.out.println("f(double d)");
    }
}

class MoreOverloads extends ThreeOverloads {
    public void f(String s) {
        System.out.println("f(String s)");
    }
}