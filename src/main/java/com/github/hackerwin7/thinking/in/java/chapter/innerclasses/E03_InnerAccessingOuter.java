package com.github.hackerwin7.thinking.in.java.chapter.innerclasses;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/06/23
 * Time: 3:00 PM
 * Desc:
 * Tips:
 */
public class E03_InnerAccessingOuter {
    public static void main(String[] args) {
        Outer2 o = new Outer2("Inner accessing outer!");
        Outer2.Inner i = o.getInner();
        System.out.println(i.toString());
    }
}

class Outer2 {
    private final String data;
    class Inner {
        public String toString() { return data; }
    }
    Outer2(String data) { this.data = data; }
    Inner getInner() { return new Inner(); }
}