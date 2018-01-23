package com.github.hackerwin7.thinking.in.java.chapter.holding;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/12/08
 * Time: 3:25 PM
 * Desc:
 */
public class E26_wordsInfo4 {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> stat = new HashMap<>();
        int wordCount = 0;
        List<String> origWrods = Arrays.asList("code", "java", "clojure", "scala", "py", "salt");
        for(String word : origWrods) {
            ArrayList<Integer> loc = stat.get(word);
            if(loc == null) {
                loc = new ArrayList<>();
                stat.put(word, loc);
            }
            loc.add(++wordCount);
        }
        TreeMap<Integer, String> words = new TreeMap<>();
        for(Map.Entry<String, ArrayList<Integer>> entry : stat.entrySet())
            for(Integer pos : entry.getValue())
                words.put(pos, entry.getKey());
        System.out.println(origWrods);
        System.out.println(words.values());
    }
}
