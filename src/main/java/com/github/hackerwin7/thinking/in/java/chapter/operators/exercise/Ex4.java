package com.github.hackerwin7.thinking.in.java.chapter.operators.exercise;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/08/22
 * Time: 4:51 PM
 * Desc:
 * Tips:
 */
public class Ex4 {
    public static void main(String[] args) {
        if(args.length < 2) {
            System.err.println("Usage: java distance time");
            System.exit(1);
        }
        float distance = Float.parseFloat(args[0]);
        float time = Float.parseFloat(args[1]);
        System.out.println("Velocity = " + (distance / time) + " m/s");
    }
}
