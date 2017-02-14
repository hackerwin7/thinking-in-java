package com.github.hackerwin7.thinking.in.java.chapter.reusing;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/14
 * Time: 7:57 PM
 * Desc:
 * Tips:
 */
public class Cartoon extends Drawing {
    public Cartoon() { System.out.println("Cartoon constructor"); }
    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }
}

class Art {
    Art() { System.out.println("Art constructor"); }
}

class Drawing extends Art {
    Drawing() { System.out.println("Drawing constructor"); }
}