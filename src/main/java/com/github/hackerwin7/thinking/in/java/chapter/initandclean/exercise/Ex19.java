package com.github.hackerwin7.thinking.in.java.chapter.initandclean.exercise;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/11/22
 * Time: 3:23 PM
 * Desc:
 * Tips:
 */
public class Ex19 {
    static void printStrings(String... strs) {
        for(String s : strs)
            System.out.println(s);
    }

    public static void main(String[] args) {
        printStrings("These", "are", "some", "strings");
        printStrings(new String[] {
                "These", "are", "some", "strings"
        });
    }
}
