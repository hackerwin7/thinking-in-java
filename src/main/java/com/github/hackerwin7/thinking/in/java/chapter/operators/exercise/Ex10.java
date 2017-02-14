package com.github.hackerwin7.thinking.in.java.chapter.operators.exercise;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/11/08
 * Time: 4:16 PM
 * Desc:
 * Tips:
 */
public class Ex10 {
    public static void main(String[] args) {
        int i1 = 0xaaaaaaaa; // 8 x a
        int i2 = 0x55555555;
        System.out.println("i1 = " + Integer.toBinaryString(i1));
        System.out.println("i2 = " + Integer.toBinaryString(i2));
        System.out.println("~i1 = " + Integer.toBinaryString(~i1));
        System.out.println("~i2 = " + Integer.toBinaryString(~i2));
        System.out.println("i1 & i1 = " + Integer.toBinaryString(i1 & i1));
        System.out.println("i1 | i1 = " + Integer.toBinaryString(i1 | i1));
        System.out.println("i1 ^ i1 = " + Integer.toBinaryString(i1 ^ i1));
        System.out.println("i1 $ i2 = " + Integer.toBinaryString(i1 & i2));
        System.out.println("i1 | i2 = " + Integer.toBinaryString(i1 | i2));
        System.out.println("i1 ^ i2 = " + Integer.toBinaryString(i1 ^ i2));
    }
}
