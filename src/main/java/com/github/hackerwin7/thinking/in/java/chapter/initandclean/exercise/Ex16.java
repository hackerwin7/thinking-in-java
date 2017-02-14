package com.github.hackerwin7.thinking.in.java.chapter.initandclean.exercise;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/11/22
 * Time: 3:00 PM
 * Desc:
 * Tips:
 */
public class Ex16 {
    public static void main(String[] args) {
        String sa1[] = new String[4];
        sa1[0] = "These";
        sa1[1] = "are";
        sa1[2] = "some";
        sa1[3] = "strings";
        for(int i = 0; i < sa1.length; i++)
            System.out.println(sa1[i]);
        String sa2[] = {
                "These", "are", "some", "strings"
        };
        for(int i = 0; i < sa2.length; i++)
            System.out.println(sa2[i]);
    }
}
