package com.github.hackerwin7.thinking.in.java.chapter.holding;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/11/28
 * Time: 2:44 PM
 * Desc:
 */
public class UniqueWords {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<>(
                Arrays.asList("Z", "C", "B", "A", "K", "o")
        );
        Set<String> wordsA = new TreeSet<>();
        wordsA.add("Z");
        wordsA.add("C");
        wordsA.add("B");
        wordsA.add("A");
        wordsA.add("K");
        wordsA.add("o");
        System.out.println(words);
        System.out.println(wordsA);

    }
}
