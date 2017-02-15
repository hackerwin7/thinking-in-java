package com.github.hackerwin7.thinking.in.java.chapter.reusing;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/15
 * Time: 8:14 PM
 * Desc:
 * Tips:
 */
public class BlankFinal {
    private final int i = 0;
    private final int j;
    private final Poppet p;
    public BlankFinal() {
        j = 1;
        p = new Poppet(1);
    }
    public BlankFinal(int x) {
        j = x;
        p = new Poppet(x);
    }
    public static void main(String[] args) {
        new BlankFinal();
        new BlankFinal(47);
    }
}

class Poppet {
    private int i;
    Poppet(int ii) { i = ii; }
}