package com.github.hackerwin7.thinking.in.java.chapter.five.instance;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/11/18
 * Time: 5:21 PM
 * Desc:
 * Tips:
 */
public class InitVal {

    public static int s = 0;

    InitVal() {
        s = 10;
    }

    public static void main(String[] args) {
        System.out.println(InitVal.s);
        InitVal val = new InitVal();
        System.out.println(val.s);
        System.out.println(InitVal.s);
    }
}
