package com.github.hackerwin7.thinking.in.java.chapter.access.instance;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/13
 * Time: 5:05 PM
 * Desc:
 * Tips:
 */
public class SinglePublicUnitFile {
    public class X {
        int a;
    }

    public static void main(String[] args) {
        SinglePublicUnitFile spuf = new SinglePublicUnitFile();
        spuf.test();
    }

    public void test() {
        X x = new X();
        x.a = 30;
    }
}