package com.github.hackerwin7.thinking.in.java.chapter.four.exercise;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/11/16
 * Time: 3:55 PM
 * Desc:
 * Tips:
 */
public class Ex6 {
    public static boolean test(int testval, int begin, int end) {
        boolean result = false;
        if(testval >= begin && testval <= end)
            result = true;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(test(10, 5, 15));
        System.out.println(test(5, 10, 15));
        System.out.println(test(5, 5, 5));
    }
}
