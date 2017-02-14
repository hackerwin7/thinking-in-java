package com.github.hackerwin7.thinking.in.java.chapter.access.exercise.access.local;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/13
 * Time: 3:23 PM
 * Desc:
 * Tips:
 */
public class E05_AccessControl {
    public int a;
    private int b;
    protected int c;
    int d;
    public void f1() {}
    private void f2() {}
    protected void f3() {}
    void f4() {}
    public static void main(String[] args) {
        E05_AccessControl test = new E05_AccessControl();
        // No problem in access problem in self main method
        test.a = 1;
        test.b = 2;
        test.c = 3;
        test.d = 4;
        test.f1();
        test.f2();
        test.f3();
        test.f4();
    }
}
