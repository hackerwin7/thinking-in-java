package com.github.hackerwin7.thinking.in.java.chapter.innerclasses;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/06/23
 * Time: 11:33 AM
 * Desc:
 * Tips:
 */
public class E01_ReferenceToInnerClass {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.getInner();
    }
}

class Outer {
    class Inner {
        { System.out.println("Inner created"); }
    }
    Inner getInner() { return new Inner(); }
}