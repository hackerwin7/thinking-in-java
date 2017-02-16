package com.github.hackerwin7.thinking.in.java.chapter.reusing;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/16
 * Time: 2:49 PM
 * Desc:
 * Tips:
 */
public class E23_ClassLoading {
    public static void main(String[] args) {
//        System.out.println("Calling static member");
//        LoadTest.staticMember();
//        System.out.println("Creating an object");
//        new LoadTest();

        new LoadTest();
        System.out.println("Calling static member");
        LoadTest.staticMember();
        System.out.println("Creating an object");

    }
}

class LoadTest {
    static {
        System.out.println("Loading LoadTest");
    }
    static void staticMember() {}
}