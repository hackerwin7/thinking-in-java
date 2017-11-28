package com.github.hackerwin7.thinking.in.java.chapter.holding;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/11/28
 * Time: 4:44 PM
 * Desc:
 */
public class E22_WordsInfo2 {
    static void updateStat(Iterator<WordCounter> it, WordCounter wc) {
        while (it.hasNext()) {
            WordCounter currentWC = it.next();
            if(currentWC.equals(wc))
                currentWC.incFrequency();
        }
    }
    public static void main(String[] args) {
        Set<WordCounter> stat = new HashSet<>();
        for(String word : Arrays.asList(
                "code", "code", "case", "CASE", "CasE", "psd"
        )) {
            WordCounter wc = new WordCounter(word);
            if(stat.contains(wc))
                updateStat(stat.iterator(), wc);
            else
                stat.add(wc);
        }
        List<WordCounter> l = new ArrayList<>(stat);
        List<WordCounter> l1 = new ArrayList<>(stat);
        Collections.sort(l, WordCounter.CASE_INSENSITIVE_ORDER);
        Collections.sort(l1, WordCounter.CASE_SENSITIVE_ORDER);
        System.out.println("insensitive: ");
        for(WordCounter wc : l)
            System.out.println(wc.getWord() + " => " + wc.getFrequency());
        System.out.println("sensitive: ");
        for(WordCounter wc : l1)
            System.out.println(wc.getWord() + " => " + wc.getFrequency());
    }
}

class WordCounter {
    public static final Comparator<WordCounter> CASE_INSENSITIVE_ORDER = new Comparator<WordCounter>() {
        @Override
        public int compare(WordCounter o1, WordCounter o2) {
            return o1.word.compareToIgnoreCase(o2.word);
        }
    };
    public static final Comparator<WordCounter> CASE_SENSITIVE_ORDER = new Comparator<WordCounter>() {
        @Override
        public int compare(WordCounter o1, WordCounter o2) {
            return o1.word.compareTo(o2.word);
        }
    };
    private final String word;
    private int frequency;
    WordCounter(String word) {
        this.word = word;
        frequency = 1;
    }
    void incFrequency() { ++frequency; }
    String getWord() { return word; }
    int getFrequency() { return frequency; }
    public boolean equals(Object o) {
        return o instanceof WordCounter && word.equals(((WordCounter)o).word);
    }
    public int hashCode() { return word.hashCode(); }
}