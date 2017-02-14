package com.github.hackerwin7.thinking.in.java.chapter.access.exercise.access;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/13
 * Time: 5:40 PM
 * Desc:
 * Tips:
 */
public class Lunch {
    void testPrivate() {
        //! Soup1 soup = new Soup1();
    }

    void testStatic() {
        Soup1 soup = Soup1.makeSoup();
    }

    void testSingleton() {
        Soup2.access().f();
    }
}

class Soup1 {
    private Soup1() {}
    public static Soup1 makeSoup() {
        return new Soup1();
    }
}

class Soup2 {
    private Soup2() {}
    private static Soup2 ps1 = new Soup2();
    public static Soup2 access() {
        return ps1;
    }
    public void f() {}
}