package com.github.hackerwin7.thinking.in.java.chapter.two.exercise;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/04/01
 * Time: 5:52 PM
 * Desc:
 */
public class AutoBoxing {
    public static void main(String[] args) {
        Byte by = 1;
        byte bt = by;
        System.out.println("byte = " + bt);
        Short sh = 1;
        short s = sh;
        System.out.println("short = " + s);
        Integer in = 1;
        int i = in;
        System.out.println("int = " + i);
        Long lo = 1L;
        long l = lo;
        System.out.println("long = " + l);
        Boolean bo = true;
        boolean b = bo;
        System.out.println("boolean = " + b);
        Character ch = 'x';
        char c = ch;
        System.out.println("char = " + c);
        Float fl = 1.0f;
        float f = fl;
        System.out.println("float = " + f);
        Double db = 1.0d;
        double d = db;
        System.out.println("double = " + d);
    }
}
