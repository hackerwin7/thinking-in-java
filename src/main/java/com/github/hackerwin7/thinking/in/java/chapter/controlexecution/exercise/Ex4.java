package com.github.hackerwin7.thinking.in.java.chapter.controlexecution.exercise;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/11/15
 * Time: 10:50 AM
 * Desc:
 * Tips:
 */
public class Ex4 {
    public static void main(String[] args) {
        int max = 100;
        if(args.length != 0)
            max = Integer.parseInt(args[0]);
        for(int i = 2; i <= max; i++) {
            boolean prime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if(i % j == 0)
                    prime = false;
            }
            if(prime)
                System.out.println(i);
        }
    }
}
