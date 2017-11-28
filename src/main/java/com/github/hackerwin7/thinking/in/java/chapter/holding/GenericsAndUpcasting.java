package com.github.hackerwin7.thinking.in.java.chapter.holding;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/07/12
 * Time: 2:14 PM
 * Desc:
 * Tips:
 */
public class GenericsAndUpcasting {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<Apple>();
        apples.add(new GrannySmith());
        apples.add(new Gala());
        apples.add(new Fuji());
        apples.add(new Braeburn());
        for (Apple c : apples)
            System.out.println(c);
    }
}

class GrannySmith extends Apple {}
class Gala extends Apple {}
class Fuji extends Apple {}
class Braeburn extends Apple {}