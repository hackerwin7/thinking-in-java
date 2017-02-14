package com.github.hackerwin7.thinking.in.java.chapter.initandclean.exercise;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/11/22
 * Time: 2:28 PM
 * Desc:
 * Tips:
 */
public class Ex10 {
    protected void finalize() {
        System.out.println("finalize() called");
    }

    public static void main(String[] args) {
        new Ex10();
        //System.gc();
    }
}
