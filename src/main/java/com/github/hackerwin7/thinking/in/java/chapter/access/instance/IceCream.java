package com.github.hackerwin7.thinking.in.java.chapter.access.instance;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/13
 * Time: 2:40 PM
 * Desc:
 * Tips:
 */
public class IceCream {
    public static void main(String[] args) {
        Sundae x = Sundae.makeASundae();
    }
}

class Sundae {
    private Sundae() {}
    static Sundae makeASundae() {
        return new Sundae();
    }
}