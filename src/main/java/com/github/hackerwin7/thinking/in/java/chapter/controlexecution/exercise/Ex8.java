package com.github.hackerwin7.thinking.in.java.chapter.controlexecution.exercise;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/11/16
 * Time: 4:00 PM
 * Desc:
 * Tips:
 */
public class Ex8 {
    public static void main(String[] args) {
        for(int i = 0; i <= 6; i++) {
            switch (i) {
                case 1: System.out.println("case 1");
                    break;
                case 2: System.out.println("case 2");
                    break;
                case 3: System.out.println("case 3");
                    break;
                case 4: System.out.println("case 4");
                    break;
                case 5: System.out.println("case 5");
                    break;
                default: System.out.println("default");
            }
        }
    }
}
