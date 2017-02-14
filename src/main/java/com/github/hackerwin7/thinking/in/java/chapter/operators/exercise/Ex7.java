package com.github.hackerwin7.thinking.in.java.chapter.operators.exercise;

import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/11/08
 * Time: 3:55 PM
 * Desc:
 * Tips:
 */
public class Ex7 {
    public static void main(String[] args) {
        Random rand = new Random();
        //Random rand = new Random(47);
        boolean flip = rand.nextBoolean();
        System.out.print("outcome: ");
        System.out.println(flip ? "HEAD" : "TAIL");
    }
}
