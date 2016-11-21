package com.github.hackerwin7.thinking.in.java.chapter.five.instance;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/11/21
 * Time: 3:48 PM
 * Desc:
 * Tips:
 */
public class OverloadingVarargs {
    static void f(Character... args) {
        System.out.print("first");
        for(Character c : args)
            System.out.print(" " + c);
        System.out.println();
    }

    static void f(Integer... args) {
        System.out.print("second");
        for(Integer i : args)
            System.out.print(" " + i);
        System.out.println();
    }

    static void f(Long... args) {
        System.out.println("third");
    }

    public static void main(String[] args) {
        f('a', 'b', 'c');
        f(1);
        f(2, 1);
        f(0);
        f(0L);
        // f(); // ambiguous
    }
}
