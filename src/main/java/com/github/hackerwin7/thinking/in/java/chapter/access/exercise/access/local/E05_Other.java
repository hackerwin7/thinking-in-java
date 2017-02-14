package com.github.hackerwin7.thinking.in.java.chapter.access.exercise.access.local;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/13
 * Time: 3:28 PM
 * Desc:
 * Tips:
 */
public class E05_Other {
    public E05_Other() {
        E05_AccessControl test = new E05_AccessControl();
        test.a = 1;
        //! test.b = 2;
        test.c = 3;
        test.d = 4;
        test.f1();
        //! test.f2();
        test.f3();
        test.f4();
    }
}
