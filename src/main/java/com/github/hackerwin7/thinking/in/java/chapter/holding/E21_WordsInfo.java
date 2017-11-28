package com.github.hackerwin7.thinking.in.java.chapter.holding;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/11/28
 * Time: 4:38 PM
 * Desc:
 */
public class E21_WordsInfo {
    public static void main(String[] args) {
        Map<String, Integer> wordsStat = new HashMap<>();
        for(String word : Arrays.asList("code", "wake", "up", "do", "come")) {
            Integer freq = wordsStat.get(word);
            wordsStat.put(word, freq == null ? 1 : freq + 1);
        }
        List<String> keys = new ArrayList<>(wordsStat.keySet());
        Collections.sort(keys, String.CASE_INSENSITIVE_ORDER);
        for(String key : keys)
            System.out.println(key + " => " + wordsStat.get(key));
    }
}
