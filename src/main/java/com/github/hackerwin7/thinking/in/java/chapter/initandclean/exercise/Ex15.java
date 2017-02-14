package com.github.hackerwin7.thinking.in.java.chapter.initandclean.exercise;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/11/22
 * Time: 2:57 PM
 * Desc:
 * Tips:
 */
public class Ex15 {
    String s;
    {
        s = "'instance initialization'";
    }
    public Ex15() {
        System.out.println("Default constructor; s = " + s);
    }
    public Ex15(int i) {
        System.out.println("int constructor; s = " + s);
    }
    public static void main(String args[]) {
        new Ex15();
        new Ex15(1);
    }
}
