package com.github.hackerwin7.thinking.in.java.chapter.initandclean.exercise;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/11/22
 * Time: 11:10 AM
 * Desc:
 * Tips:
 */
public class Ex2 {
    String s1 = "Initialized at definition";
    String s2;
    public Ex2(String s2i) {
        s2 = s2i;
    }

    public static void main(String[] args) {
        Ex2 si = new Ex2("Initialized at construction");
        System.out.println("si.s1 = " + si.s1);
        System.out.println("si.s2 = " + si.s2);
    }
}
