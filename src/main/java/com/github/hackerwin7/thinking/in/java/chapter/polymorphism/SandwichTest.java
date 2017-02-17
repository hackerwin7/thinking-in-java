package com.github.hackerwin7.thinking.in.java.chapter.polymorphism;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/17
 * Time: 7:53 PM
 * Desc:
 * Tips:
 */
public class SandwichTest {
    public static int call() {
        System.out.println("call sandwich");
        return 0;
    }

    public static int s = call();
}

class Test {

    public static int call() {
        System.out.println("call test");
        return 1;
    }

    public static int t = call();

    public static void main(String[] args) {
        System.out.println("test main");
    }
}