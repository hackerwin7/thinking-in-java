package com.github.hackerwin7.thinking.in.java.chapter.three.exercise;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/11/08
 * Time: 4:41 PM
 * Desc:
 * Tips:
 */
public class Ex14 {
    public static void main(String[] args) {
        compare("Hello", "Hello");
        String s = new String("Hello");
        compare("Hello", s);
        compare("Hello", "Goodbye");
    }

    public static void p(String s, boolean b) {
        System.out.println(s + ": " + b);
    }

    public static void compare(String lval, String rval) {
        System.out.println("lval: " + lval + " rval: " + rval);
        p("lval == rval", lval == rval);
        p("lval != rval", lval != rval);
        p("lval.equals(rval)", lval.equals(rval));
    }
}
