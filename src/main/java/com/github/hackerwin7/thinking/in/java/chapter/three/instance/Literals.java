package com.github.hackerwin7.thinking.in.java.chapter.three.instance;

import static com.github.hackerwin7.thinking.in.java.chapter.three.instance.Assignment.*;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/06/14
 * Time: 2:50 PM
 * Desc:
 * Tips:
 */
public class Literals {
    public static void main(String[] args) throws Exception {
        int i1 = 0x2f;
        print("i1 = " + Integer.toBinaryString(i1));
        int i2 = 0x2F;
        print("i2 = " + Integer.toBinaryString(i2));
        int i3 = 0177;//octal
        print("i3 = " + Integer.toBinaryString(i3));
        int i31 = 177;
        print("i31 = " + Integer.toBinaryString(i31));
        char c = 0xffff; // 2^16 - 1, 1111111111111111 = 1000000000000 - 1
        print("c = " + Integer.toBinaryString(c));
        byte b = 0x7f;
        print("b = " + Integer.toBinaryString(b));
        short s = 0x7fff;
        print("s = " + Integer.toBinaryString(s));
        long n1 = 200L;
        long n2 = 200l;
        long n3 = 200;
        float f1 = 1;
        float f2 = 1F;
        float f3 = 1f;
        double d1 = 1d;
        double d2 = 1D;
    }
}
