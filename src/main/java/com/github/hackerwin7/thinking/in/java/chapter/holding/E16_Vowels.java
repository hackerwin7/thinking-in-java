package com.github.hackerwin7.thinking.in.java.chapter.holding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/11/28
 * Time: 2:57 PM
 * Desc:
 */
public class E16_Vowels {
    private final static Set<Character> vowels = new HashSet<Character>(
            Arrays.asList('a', 'e', 'o', 'u', 'i', 'A', 'E', 'O', 'U', 'I'));
    public static void main(String[] args) {
        HashSet<String> processedWords = new HashSet<>();
        int fileVowels = 0;
        int wordVowels = 0;
        for(String word : Arrays.asList("code", "language", "loop", "open", "change")) {
            wordVowels = 0;
            for(char letter : word.toCharArray())
                if(vowels.contains(letter))
                    wordVowels++;
            if(!processedWords.contains(word)) {
                processedWords.add(word);
                System.out.println(word + " has " + wordVowels + " vowel(s) ");
            }
            fileVowels += wordVowels;
        }
        System.out.println("Total number of vowels in file: " + fileVowels);
    }
}
