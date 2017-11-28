package com.github.hackerwin7.thinking.in.java.chapter.holding;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/07/12
 * Time: 11:49 AM
 * Desc:
 * Tips:
 */
public class ApplesAndOrangeWithGenerics {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<Apple>();
        for (int  i = 0; i < 3; i++)
            apples.add(new Apple());
        for (int i = 0; i < apples.size(); i++)
            System.out.println(apples.get(i).id());
        for (Apple c : apples)
            System.out.println(c.id());
    }
}
