package com.github.hackerwin7.thinking.in.java.chapter.holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/12/08
 * Time: 3:19 PM
 * Desc:
 */
public class E25_WordsInfo3 {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> stat = new HashMap<>();
        int wordCount = 0;
        for(String word : Arrays.asList("kky", "code", "sara", "dota", "lol", "tga")) {
            ArrayList<Integer> loc = stat.get(word);
            if(loc == null) {
                loc = new ArrayList<>();
                stat.put(word, loc);
            }
            loc.add(++wordCount);
        }
        System.out.println(stat);
    }
}
