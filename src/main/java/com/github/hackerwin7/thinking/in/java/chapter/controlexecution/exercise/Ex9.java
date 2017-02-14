package com.github.hackerwin7.thinking.in.java.chapter.controlexecution.exercise;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/11/16
 * Time: 4:08 PM
 * Desc:
 * Tips:
 */
public class Ex9 {
    public static int fib(int n) {
        if(n <= 2)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        for(int i = 1; i <= n; i++) {
            System.out.print(fib(i) + ", ");
        }
    }
}
