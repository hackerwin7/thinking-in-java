package com.github.hackerwin7.thinking.in.java.chapter.interfaces.filters;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/24
 * Time: 7:35 PM
 * Desc:
 * Tips:
 */
public class Filter {
    public String name() {
        return getClass().getSimpleName();
    }

    public Waveform process(Waveform input) { return input; }
}
