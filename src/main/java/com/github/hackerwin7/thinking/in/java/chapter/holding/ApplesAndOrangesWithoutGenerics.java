package com.github.hackerwin7.thinking.in.java.chapter.holding;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/07/12
 * Time: 11:34 AM
 * Desc:
 * Tips:
 */
public class ApplesAndOrangesWithoutGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList apples = new ArrayList();
        for (int i = 0; i < 3; i++)
            apples.add(new Apple());
        apples.add(new Orange());
        for (int  i = 0; i < apples.size(); i++)
            ((Apple)apples.get(i)).id();
    }
}

class Apple {
    private static long counter;
    private final long id = counter++;
    public long id() { return id; }
}

class Orange {}