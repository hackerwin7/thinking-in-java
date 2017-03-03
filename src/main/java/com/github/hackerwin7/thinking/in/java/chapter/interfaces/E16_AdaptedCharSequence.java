package com.github.hackerwin7.thinking.in.java.chapter.interfaces;

import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/03/03
 * Time: 8:43 PM
 * Desc:
 * Tips:
 */
public class E16_AdaptedCharSequence extends CharSequence
        implements Readable {
    private int count;
    public E16_AdaptedCharSequence(int count) {
        this.count = count;
    }
    public int read(CharBuffer cb) {
        if(count-- == 0)
            return -1;
        char[] buffer = generate();
        cb.put(buffer);
        return buffer.length;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(new E16_AdaptedCharSequence(10));
        while (s.hasNext())
            System.out.println(s.next());
    }
}

class CharSequence {
    private static Random rand = new Random(47);
    private static final char[] capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static final char[] lowers = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static final char[] vowels = "aeiou".toCharArray();
    char[] generate() {
        char[] buffer = new char[10];
        int idx = 0;
        buffer[idx++] = capitals[rand.nextInt(capitals.length)];
        for(int i = 0; i < 4; i++) {
            buffer[idx++] = vowels[rand.nextInt(vowels.length)];
            buffer[idx++] = lowers[rand.nextInt(lowers.length)];
        }
        buffer[idx] = ' ';
        return buffer;
    }
}