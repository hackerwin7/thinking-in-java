package com.github.hackerwin7.thinking.in.java.chapter.access.instance;

import java.io.PrintStream;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/12/30
 * Time: 11:29 AM
 * Desc:
 * Tips:
 */
public class Print {
    public static void print(Object obj) {
        System.out.println(obj);
    }

    public static void print() {
        System.out.println();
    }

    public static void printnb(Object obj) {
        System.out.print(obj);
    }

    public static PrintStream printf(String format, Object... args) {
        return System.out.printf(format, args);
    }
}
