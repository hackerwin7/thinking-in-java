package com.github.hackerwin7.thinking.in.java.chapter.innerclasses;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/06/23
 * Time: 4:15 PM
 * Desc:
 * Tips:
 */
public class E05_InstanceOfInner {
    public static void main(String[] args) {
        Outer3 o = new Outer3();
        Outer3.Inner i = o.new Inner();
    }
}

class Outer3 {
    class Inner {
        { System.out.println("Inner created"); }
    }
}