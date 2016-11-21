package com.github.hackerwin7.thinking.in.java.chapter.four.exercise;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/11/15
 * Time: 1:59 PM
 * Desc:
 * Tips:
 */
public class Ex4_Prime2 {
    public static void main(String[] args) {
        int max = 100;
        if(args.length != 0)
            max = Integer.parseInt(args[0]);
        boolean[] sieve = new boolean[max + 1];
        System.out.println(Math.floor(4.357));
        System.out.println(Math.floor(4.739));
        int limit = (int) Math.floor(Math.sqrt(max));
        System.out.println("1");
        if(max > 1)
            System.out.println("2");
        for(int i = 3; i <= limit; i += 2) {
            if(!sieve[i]) {
                for (int j = 2 * i; j <= max; j += i) {
                    sieve[j] = true;
                }
            }
        }
        for (int i = 3; i <= max; i+= 2) {
            if(!sieve[i]) {
                System.out.println(i);
            }
        }
    }
}
