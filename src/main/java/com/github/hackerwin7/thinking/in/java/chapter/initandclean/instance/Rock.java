package com.github.hackerwin7.thinking.in.java.chapter.initandclean.instance;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/11/16
 * Time: 4:59 PM
 * Desc:
 * Tips:
 */
public class Rock {
    Rock() {
        System.out.print("Rock ");
    }

    static class Rock2 {
        Rock2(int i) {
            System.out.print("Rock " + i + " ");
        }
    }

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++)
            //new Rock();
        new Rock2(i);
    }
}