package com.github.hackerwin7.thinking.in.java.chapter.interfaces;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/03/06
 * Time: 6:22 PM
 * Desc:
 * Tips:
 */
public class E17_ImplicitStaticFinal {
    public static void main(String[] args) {
        System.out.println("StaticFinalTest.RED = " +
                StaticFinalTest.RED);
    }
}

interface StaticFinalTest {
    String RED = "Red";
}

class Test implements StaticFinalTest {
    public Test () {
//  !      RED = "Blue";
    }
}