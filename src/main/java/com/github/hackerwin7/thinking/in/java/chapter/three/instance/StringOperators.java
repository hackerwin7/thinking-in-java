package com.github.hackerwin7.thinking.in.java.chapter.three.instance;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/07/15
 * Time: 10:51 AM
 * Desc:
 * Tips:
 */
public class StringOperators {
    public static void main(String[] args) {
        int x = 0, y = 1, z = 2;
        String s = "x, y , z";
        System.out.println(s + x + y + z);
        System.out.println(x + " " + s);
        s += "(summed) = ";
        System.out.println(s + (x + y + z));
        System.out.println("" + x);
    }
}
