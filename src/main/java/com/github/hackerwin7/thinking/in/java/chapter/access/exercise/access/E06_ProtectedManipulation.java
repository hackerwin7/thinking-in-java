package com.github.hackerwin7.thinking.in.java.chapter.access.exercise.access;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/13
 * Time: 3:34 PM
 * Desc:
 * Tips:
 */
public class E06_ProtectedManipulation {
    public static void main(String args[]) {
        WithProtected wp = new WithProtected();
        wp.i = 47;
        System.out.println("wp.i = " + wp.i);
    }
}

class WithProtected {
    protected int i;
}