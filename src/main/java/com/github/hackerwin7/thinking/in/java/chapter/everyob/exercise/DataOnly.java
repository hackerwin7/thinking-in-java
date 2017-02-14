package com.github.hackerwin7.thinking.in.java.chapter.everyob.exercise;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/04/01
 * Time: 2:23 PM
 * Desc:
 */
public class DataOnly {
    private int i;
    private double d;
    private boolean b;
    public static void main(String[] args) {
        DataOnly data = new DataOnly();

        data.i = 100;
        data.d = 199.99;
        data.b = true;

        System.out.println(data.i);
        System.out.println(data.d);
        System.out.println(data.b);
    }
}
