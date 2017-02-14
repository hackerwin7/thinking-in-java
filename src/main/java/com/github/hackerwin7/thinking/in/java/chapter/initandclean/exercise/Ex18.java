package com.github.hackerwin7.thinking.in.java.chapter.initandclean.exercise;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/11/22
 * Time: 3:16 PM
 * Desc:
 * Tips:
 */
public class Ex18 {
    public static void main(String args[]) {
        Test[] array = new Test[5];
        for(int i = 0; i < array.length; i++)
            array[i] = new Test(Integer.toString(i));
    }
}
