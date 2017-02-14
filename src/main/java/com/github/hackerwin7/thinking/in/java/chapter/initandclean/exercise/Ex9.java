package com.github.hackerwin7.thinking.in.java.chapter.initandclean.exercise;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/11/22
 * Time: 11:51 AM
 * Desc:
 * Tips:
 */
public class Ex9 {
     public Ex9(String s) {
         System.out.println("s = " + s);
     }

     public Ex9(int i) {
         this("i = " + i);
     }

     public static void main(String[] args) {
         new Ex9("String call");
         new Ex9(47);
     }
}
