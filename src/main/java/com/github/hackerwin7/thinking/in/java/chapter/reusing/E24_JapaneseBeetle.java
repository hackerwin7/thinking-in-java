package com.github.hackerwin7.thinking.in.java.chapter.reusing;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/16
 * Time: 2:55 PM
 * Desc:
 * Tips:
 */
public class E24_JapaneseBeetle {
    public static void main(String[] args) {
        new JapaneseBeetle();
    }
}

class JapaneseBeetle extends Beetle {
    int m = printInit("JapaneseBeetle.m initialized");
    JapaneseBeetle() {
        System.out.println("m = " + m);
        System.out.println("j = " + j);
    }
    static int x3 = printInit("static JapaneseBeetle.x3 initialized");
}