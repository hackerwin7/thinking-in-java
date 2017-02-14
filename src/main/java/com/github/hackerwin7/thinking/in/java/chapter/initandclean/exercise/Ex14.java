package com.github.hackerwin7.thinking.in.java.chapter.initandclean.exercise;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/11/22
 * Time: 2:54 PM
 * Desc:
 * Tips:
 */
public class Ex14 {
    static String s1 = "Initialized at definition";
    static String s2;
    static {
        s2 = "Initialized in static block";
    }

    public static void main(String[] args) {
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
    }
}
