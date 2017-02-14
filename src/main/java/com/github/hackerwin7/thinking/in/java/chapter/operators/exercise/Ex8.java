package com.github.hackerwin7.thinking.in.java.chapter.operators.exercise;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/11/08
 * Time: 4:04 PM
 * Desc:
 * Tips:
 */
public class Ex8 {
    public static void main(String[] args) {
        long l1 = 0x2f;
        System.out.println("l1: " + Long.toBinaryString(l1));
        long l2 = 0X2F;
        System.out.println("l2: " + Long.toBinaryString(l2));
        long l3 = 0177;// octal (leading zero)
        System.out.println("l3: " + Long.toBinaryString(l3));
    }
}
