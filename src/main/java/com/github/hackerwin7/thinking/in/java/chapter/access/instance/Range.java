package com.github.hackerwin7.thinking.in.java.chapter.access.instance;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/12/30
 * Time: 11:40 AM
 * Desc:
 * Tips:
 */
public class Range {
    public static int[] range(int n) {
        int[] result = new int[n];
        for(int i = 0; i < n; i++) {
            result[i] = i;
        }
        return result;
    }

    //[start, end)
    public static int[] range(int start, int end) {
        int sz = end - start;
        int [] result = new int[sz];
        for(int i = 0; i < sz; i++) {
            result[i] = start + i;
        }
        return result;
    }

    public static int[] range(int start, int end, int step) {
        int sz = (end - start) / step;
        int[] result = new int[sz];
        for(int i = 0; i < sz; i++) {
            result[i] = start + (i * step);
        }
        return result;
    }
}
