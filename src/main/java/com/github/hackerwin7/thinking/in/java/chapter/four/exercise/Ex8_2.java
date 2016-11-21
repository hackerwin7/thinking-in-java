package com.github.hackerwin7.thinking.in.java.chapter.four.exercise;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/11/16
 * Time: 4:05 PM
 * Desc:
 * Tips:
 */
public class Ex8_2 {
    public static void main(String[] args) {
        for(int i = 0; i <= 6; i++) {
            switch (i) {
                case 1: System.out.println("case 1");
                case 2: System.out.println("case 2");
                case 3: System.out.println("case 3");
                case 4: System.out.println("case 4");
                case 5: System.out.println("case 5");
                    default: System.out.println("default");
            }
        }
    }
}
