package com.github.hackerwin7.thinking.in.java.chapter.three.exercise;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/08/22
 * Time: 4:48 PM
 * Desc:
 * Tips:
 */
public class Ex3 {
    static void f(Integral y) {
        y.f = 1.0f;
    }

    public static void main(String[] args) throws Exception {
        Integral x = new Integral();
        x.f = 2.0f;
        System.out.println(x.f);
        f(x);
        System.out.println(x.f);
    }
}
