package com.github.hackerwin7.thinking.in.java.chapter.operators.instance;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/06/14
 * Time: 11:41 AM
 * Desc:
 * Tips:
 */
public class Precedence {
    public static void main(String[] args) throws Exception {
        int x = 1, y = 2, z = 3;
        int a = x + y - 2/2 + z;
        int b = x + (y - 2) / (2 + z);
        System.out.println("a = " + a + ", b = " + b);
    }
}
