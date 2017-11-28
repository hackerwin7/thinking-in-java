package com.github.hackerwin7.thinking.in.java.chapter.holding;

import java.util.Collection;
import java.util.HashSet;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/07/12
 * Time: 3:06 PM
 * Desc:
 * Tips:
 */
public class E02_SimpleCollection2 {
    public static void main(String[] args) {
        Collection<Integer> c = new HashSet<Integer>();
        for (int i = 0; i < 10; i++)
            c.add(i);
        for (Integer i : c)
            System.out.println(i + ", ");
    }
}
