package com.github.hackerwin7.thinking.in.java.chapter.holding;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/07/12
 * Time: 4:28 PM
 * Desc:
 * Tips:
 */
public class AddingGroups {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        Integer[] moreInts = { 6, 7, 8, 9, 10 };
        collection.addAll(Arrays.asList(moreInts));
        Collections.addAll(collection, 11, 12, 13, 14, 15);
        Collections.addAll(collection, moreInts);
        List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
        list.set(1, 99);
        // ! list.add(21); // underlying array cannot be resized
    }
}
