package com.github.hackerwin7.thinking.in.java.chapter.operators.exercise;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/08/22
 * Time: 4:45 PM
 * Desc:
 * Tips:
 */

class Integral {
    float f;
}


public class Ex2 {
    public static void main(String[] args) throws Exception {
        Integral n1 = new Integral();
        Integral n2 = new Integral();
        n1.f = 9f;
        n2.f = 47f;
        System.out.println(n1.f + " " + n2.f);
        n1 = n2;
        System.out.println(n1.f + " " + n2.f);
        n1.f = 27f;
        System.out.println(n1.f + " " + n2.f);
    }
}
