package com.github.hackerwin7.thinking.in.java.chapter.holding;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/07/12
 * Time: 3:03 PM
 * Desc:
 * Tips:
 */
public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<Integer>();
        for (int i = 0; i < 10; i ++)
            c.add(i);
        for (Integer i : c)
            System.out.println(i + ", ");
    }
}
