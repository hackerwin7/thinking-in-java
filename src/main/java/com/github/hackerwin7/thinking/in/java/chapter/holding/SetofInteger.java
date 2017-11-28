package com.github.hackerwin7.thinking.in.java.chapter.holding;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/10/13
 * Time: 4:16 PM
 * Desc:
 */
public class SetofInteger {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Set<Integer> intset = new HashSet<>();
        for (int i = 0; i < 10000; i++)
            intset.add(rand.nextInt(30));
        System.out.println(intset);
    }
}
