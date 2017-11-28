package com.github.hackerwin7.thinking.in.java.chapter.holding;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/10/13
 * Time: 2:42 PM
 * Desc:
 */
public class E14_MiddleInsertion {
    public static void main(String[] args) {
//        t0();
//        t1();
        LinkedList<Integer> list = new LinkedList<>();
        ListIterator<Integer> it = list.listIterator();
        for(int i = 1; i <= 10; i++) {
            it.add(i); // before next, after previous, implicit cursor at unaffected next previously (between unaffected next and new insert previous)
            if(i % 2 == 0)
                it.previous();
        }
        System.out.println(list);
        System.out.println(it.previousIndex() + " " + it.nextIndex());
    }

    public static void t0() {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        ListIterator<Integer> it = list.listIterator();
        while (it.hasNext()) {
            Integer i = it.next();
            System.out.println(i + " " + it.previousIndex() + " " + it.nextIndex());
        }
    }

    public static void t1() {
        LinkedList<Integer> list = new LinkedList<>();
        ListIterator<Integer> it = list.listIterator();
        it.add(1);
        System.out.println(it.nextIndex());
        System.out.println(it.previousIndex());
    }
}
