package com.github.hackerwin7.thinking.in.java.chapter.initandclean.exercise;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/11/22
 * Time: 2:33 PM
 * Desc:
 * Tips:
 */
public class Ex11 {
    protected void finalize() {
        System.out.println("finalize() called");
    }

    public static void main(String[] args) {
        new Ex11();
        System.gc();
        System.runFinalization();
    }
}
