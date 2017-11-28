package com.github.hackerwin7.thinking.in.java.chapter.holding;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/11/28
 * Time: 4:22 PM
 * Desc:
 */
public class E20_VowelsInfo {
    private final static Set<Character> vowels = new HashSet<>(Arrays.asList(
            'a', 'e', 'o', 'u', 'i', 'A', 'E', 'O', 'U', 'I'
    ));
    static void updateStat(Map<Character, Integer> stat, char letter) {
        Character ch = Character.toLowerCase(letter);
        Integer freq = stat.get(ch);
        stat.put(ch, freq == null ? 1 : freq + 1);
    }
    public static void main(String[] args) {
        HashMap<Character, Integer> fileStat = new HashMap<>();
        HashSet<String> processedWords = new HashSet<>();
        HashMap<Character, Integer> wordStat = new HashMap<>();
        for (String word : Arrays.asList(
                "code", "sara", "kiko", "fuck"
        )) {
            wordStat.clear();
            for (char letter : word.toCharArray())
                if(vowels.contains(letter)) {
                    updateStat(wordStat, letter);
                    updateStat(fileStat, letter);
                }
            if(!processedWords.contains(word)) {
                processedWords.add(word);
                System.out.println("Vowels in " + word + ": " + wordStat);
            }
        }
        System.out.println("**********************");
        System.out.println("Vowels in the whole file: " + fileStat);
    }
}
