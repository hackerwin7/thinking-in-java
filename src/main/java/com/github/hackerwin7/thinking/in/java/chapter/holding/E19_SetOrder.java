package com.github.hackerwin7.thinking.in.java.chapter.holding;

import net.mindview.util.Countries;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/11/28
 * Time: 4:19 PM
 * Desc:
 */
public class E19_SetOrder {
    public static void main(String[] args) {
        Set<String> s1 = new HashSet<>(Countries.names(25));
        System.out.println(s1);
        String[] elements = s1.toArray(new String[0]);
        Arrays.sort(elements);
        Set<String> s2 = new LinkedHashSet<>();
        for(String element : elements)
            s2.add(element);
        System.out.println(s2);
    }
}
