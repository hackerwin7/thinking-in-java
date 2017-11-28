package com.github.hackerwin7.thinking.in.java.chapter.holding;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/10/12
 * Time: 4:37 PM
 * Desc:
 */
public class E12_ListIterator {
    static void reverse(List<Integer> list) {
        ListIterator<Integer> fwd = list.listIterator();
        ListIterator<Integer> rev = list.listIterator(list.size());
        int mid = list.size() >> 1;
        for(int i = 0; i < mid; i++) {
            Integer tmp = fwd.next();
            fwd.set(rev.previous());
            rev.set(tmp);
        }
    }
    public static void main(String[] args) {
        List<Integer> src = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> dest = new LinkedList<>(src); // deep copy
        System.out.println("source: " + src);
        System.out.println("destination: " + dest);
        reverse(dest);
        System.out.println("source: " + src);
        System.out.println("destination: " + dest);
    }
}
