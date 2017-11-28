package com.github.hackerwin7.thinking.in.java.chapter.holding;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/11/28
 * Time: 2:53 PM
 * Desc:
 */
public class UniqueWordsAlphabetic {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        words.addAll(Arrays.asList("a" ,"c", "A", "k", "K", "c"));
        System.out.println(words);
    }
}
