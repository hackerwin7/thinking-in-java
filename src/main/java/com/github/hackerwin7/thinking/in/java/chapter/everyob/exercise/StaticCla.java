package com.github.hackerwin7.thinking.in.java.chapter.everyob.exercise;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/04/01
 * Time: 3:28 PM
 * Desc:
 */
public class StaticCla {
    public static int si = 0;

    public StaticCla() {
        si++;
    }

    public static void main(String[] args) {
        StaticCla sc = null;
        for(int i = 0; i <= 5 - 1; i++) {
            sc = new StaticCla();
        }
        System.out.println(sc.si);
        System.out.println(StaticCla.si);
    }
}
