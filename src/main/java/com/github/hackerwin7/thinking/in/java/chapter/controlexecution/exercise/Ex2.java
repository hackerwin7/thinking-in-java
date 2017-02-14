package com.github.hackerwin7.thinking.in.java.chapter.controlexecution.exercise;

import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/11/15
 * Time: 10:28 AM
 * Desc:
 * Tips:
 */
public class Ex2 {
    private static Random r = new Random(47);
    public static void compareRand() {
        int a = r.nextInt();
        int b = r.nextInt();
        System.out.println("a = " + a + ", b = " + b);
        if(a < b)
            System.out.println("a < b");
        else if(a > b)
            System.out.println("a > b");
        else
            System.out.println("a = b");
    }

    public static void main(String[] args) {
        for(int i = 0; i < 25; i++) {
            compareRand();
        }
    }
}
