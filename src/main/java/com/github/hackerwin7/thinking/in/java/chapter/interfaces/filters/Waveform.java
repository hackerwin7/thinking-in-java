package com.github.hackerwin7.thinking.in.java.chapter.interfaces.filters;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/24
 * Time: 7:34 PM
 * Desc:
 * Tips:
 */
public class Waveform {
    private static long counter;
    private final long id = counter++;
    public String toString() { return "Waveform " + id; }
}