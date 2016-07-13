package com.github.hackerwin7.thinking.in.java.chapter.three.instance;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/06/29
 * Time: 4:16 PM
 * Desc:
 * Tips:
 */
public class Exponents {
    public static void main(String[] args) throws Exception {
        float expFloat = 1.39e-43f;
        expFloat = 1.39E-43f;
        System.out.println(expFloat);
        double expDouble = 47e47d;
        double expDouble2 = 47e47;
        System.out.println(expDouble);
        System.out.println(expDouble2);
        System.out.println(Math.E);
        System.out.println(0.1e1);// in program language, e not for natural logarithms but 10
    }
}
