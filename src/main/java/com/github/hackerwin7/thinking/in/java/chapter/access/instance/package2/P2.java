package com.github.hackerwin7.thinking.in.java.chapter.access.instance.package2;

import com.github.hackerwin7.thinking.in.java.chapter.access.instance.package1.P1;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/01/03
 * Time: 7:59 PM
 * Desc:
 * Tips:
 */
public class P2 {
    public static void main(String[] args) {
        P1 p1 = new P1();
        p1.a1 = p1.a1;
    }
}
