package com.github.hackerwin7.thinking.in.java.chapter.initandclean.instance;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/11/21
 * Time: 3:35 PM
 * Desc:
 * Tips:
 */
public class VarargType {
    static void f(Character... args) {
        System.out.print(args.getClass());
        System.out.println(" length " + args.length);
    }

    static void g(int... args) {
        System.out.print(args.getClass());
        System.out.println(" length " + args.length);
    }

    public static void main(String[] args) {
        f('a');
        f();
        g(1);
        g();
        System.out.println("int[]: " + new int[0].getClass());
    }
}
