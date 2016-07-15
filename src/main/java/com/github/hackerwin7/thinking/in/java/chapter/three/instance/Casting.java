package com.github.hackerwin7.thinking.in.java.chapter.three.instance;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/07/15
 * Time: 10:58 AM
 * Desc:
 * Tips:
 */
public class Casting {
    public static void main(String[] args) {
        int i = 200;
        long lng = (long)i;
        lng = i;
        long lng2 = (long)200;
        lng2 = 200;
        i = (int)lng2;
    }
}
