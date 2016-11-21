package com.github.hackerwin7.thinking.in.java.chapter.four.exercise;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/11/15
 * Time: 5:20 PM
 * Desc:
 * Tips:
 */
public class Ex5 {
    public static void toBinaryString(int i) {
        char[] buffer = new char[32];
        int bufferPosition = 32;
        do {
            buffer[--bufferPosition] = ((i & 0x01) != 0) ? '1' : '0';
            i >>>= 1;
        } while (i != 0);
        for(int j = bufferPosition; j < 32; j++)
            System.out.print(buffer[j]);
        System.out.println();
    }

    public static void main(String[] args) {
        int i1 = 0xaaaaaaaa;
        int i2 = 0x55555555;
        System.out.print("i1 = "); toBinaryString(i1);
        System.out.print("i2 = "); toBinaryString(i2);
        System.out.print("~i1 = "); toBinaryString(~i1);
        System.out.print("~i2 = "); toBinaryString(~i2);
        System.out.print("i1 & i1 = "); toBinaryString(i1 & i1);
        System.out.print("i1 | i1 = "); toBinaryString(i1 | i1);
        System.out.print("i1 ^ i1 = "); toBinaryString(i1 ^ i1);
        System.out.print("i1 & i2 = "); toBinaryString(i1 & i2);
        System.out.print("i1 | i2 = "); toBinaryString(i1 | i2);
        System.out.print("i1 ^ i2 = "); toBinaryString(i1 ^ i2);
    }
}
