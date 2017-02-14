package com.github.hackerwin7.thinking.in.java.chapter.initandclean.exercise;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/11/22
 * Time: 3:06 PM
 * Desc: create only array references not object instances
 * Tips:
 */
public class Ex17 {
    Test[] array1 = new Test[5];
    public static void main(String[] args) {
        Test[] array2 = new Test[5];
    }
}

class Test {
    Test(String s) {
        System.out.println("String  constructor; s = " + s);
    }
}