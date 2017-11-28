package com.github.hackerwin7.thinking.in.java.chapter.holding;

import org.w3c.dom.ls.LSException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/10/12
 * Time: 2:55 PM
 * Desc:
 */
public class E07_TestList {
    public static void main(String[] args) {
        IDClass[] idc = new IDClass[10]; // new arrays would not new instance for single object
        for(int i = 0; i < idc.length; i++) {
            idc[i] = new IDClass();
        }
        List<IDClass> lst = new ArrayList<>(
                Arrays.asList(idc)
        );
        System.out.println("lst = " + lst);
        List<IDClass> subSet = lst.subList(lst.size()/4, lst.size()/2);
        System.out.println("subSet = " + subSet);
        //!lst.removeAll(subSet); // if origin changes, this operation becomes weird
        subSet.clear();
        System.out.println("lst = " + lst);
    }
}

class IDClass {
    private static int counter;
    private int count = counter++;
    public String toString() {
        return "IDClass" + count;
    }
}