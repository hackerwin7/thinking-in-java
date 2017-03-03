package com.github.hackerwin7.thinking.in.java.chapter.interfaces;

import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/03/03
 * Time: 8:40 PM
 * Desc:
 * Tips:
 */
public class RandomDoubles {
    private static Random rand = new Random(47);
    public double next() { return rand.nextDouble(); }
    public static void main(String[] args) {
        RandomDoubles rd = new RandomDoubles();
        for(int i = 0; i < 7; i++)
            System.out.println(rd.next() + " ");
    }
}
