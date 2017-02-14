package com.github.hackerwin7.thinking.in.java.chapter.initandclean.exercise;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/11/22
 * Time: 11:33 AM
 * Desc:
 * Tips:
 */
public class Ex4 {
    Ex4() {
        System.out.println("Default constructor");
    }

    Ex4(String s) {
        System.out.println("String are constructor");
        System.out.println(s);
    }

    public static void main(String[] args) {
        new Ex4();
        new Ex4("Overloaded");
    }
}
