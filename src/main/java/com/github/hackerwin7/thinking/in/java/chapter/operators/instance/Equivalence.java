package com.github.hackerwin7.thinking.in.java.chapter.operators.instance;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/06/14
 * Time: 2:39 PM
 * Desc:
 * Tips:
 */
public class Equivalence {
    public static void main(String[] args) throws Exception {
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        System.out.println(n1 == n2);
        System.out.println(n1 != n2);
        System.out.println(n1.equals(n2));

        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = v2.i = 100;
        System.out.println(v1.equals(v2));
    }
}

class Value {
    int i;
}
