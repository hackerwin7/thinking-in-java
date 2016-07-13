package com.github.hackerwin7.thinking.in.java.chapter.three.instance;

import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/06/29
 * Time: 5:09 PM
 * Desc:
 * Tips:
 */
public class BitManipulation {
    public static void main(String[] args) throws Exception {
        Random random = new Random(47);
        int i = random.nextInt();
        int j = random.nextInt();
        printBinaryInt("-1", -1);
        printBinaryInt("+1", +1);
        int maxpos = 2147483647;
        printBinaryInt("maxpos", maxpos);
        int maxneg = -2147483648;
        printBinaryInt("maxneg", maxneg);
        printBinaryInt("i", i);
        printBinaryInt("~i", ~i);
        printBinaryInt("-i", -i);
        printBinaryInt("j", j);
        printBinaryInt("i & j", i & j);
        printBinaryInt("i | j", i | j);
        printBinaryInt("i ^ j", i ^ j);
        printBinaryInt("i << 5", i << 5);
        printBinaryInt("i >> 5", i >> 5);
        printBinaryInt("(~i) >> 5", (~i) >>> 5);
        printBinaryInt("i >>> 5", i >>> 5);
        printBinaryInt("(~i) >>> 5", (~i) >>> 5);

        long l = random.nextLong();
        long m = random.nextLong();
        printBinaryLong("-1L", -1L);
        printBinaryLong("+1L", +1L);
        long ll = 9223372036854775807L;
        printBinaryLong("ll", ll);
        long lln = -9223372036854775808L;
        printBinaryLong("lln", lln);
        printBinaryLong("l", l);
        printBinaryLong("~l", ~l);
        printBinaryLong("-l", -l);
        printBinaryLong("m", m);
        printBinaryLong("l & m", l & m);
        printBinaryLong("l | m", l | m);
        printBinaryLong("l ^ m", l ^ m);
        printBinaryLong("l << 5", l << 5);
        printBinaryLong("l >> 5", l >> 5);
        printBinaryLong("(~l) >> 5", (~l) >> 5);
        printBinaryLong("l >>> 5", l >>> 5);
        printBinaryLong("(~l) >>> 5", (~l) >>> 5);
    }

    static void printBinaryInt(String s, int i) {
        System.out.println(s + ", int: " + i + ", binary:\n   " +
        Integer.toBinaryString(i));
    }

    static void printBinaryLong(String s, long l) {
        System.out.println(s + ", long: " + l + ", binary:\n   " +
        Long.toBinaryString(l));
    }
}
