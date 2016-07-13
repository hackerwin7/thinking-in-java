package com.github.hackerwin7.thinking.in.java.chapter.two.exercise;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/04/01
 * Time: 3:25 PM
 * Desc:
 */
public class Incrementable {

    static class StaticTest {
        private static int i = 47;
    }

    public static void main(String[] args) {
        Incrementable.increment();
        System.out.println(StaticTest.i);
    }

    public static void increment() {
        StaticTest.i++;
    }
}
