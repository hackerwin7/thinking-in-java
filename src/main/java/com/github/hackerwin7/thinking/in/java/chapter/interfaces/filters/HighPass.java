package com.github.hackerwin7.thinking.in.java.chapter.interfaces.filters;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/24
 * Time: 7:37 PM
 * Desc:
 * Tips:
 */
public class HighPass extends Filter {
    double cutoff;
    public HighPass(double cutoff) { this.cutoff = cutoff; }
    public Waveform process(Waveform input) { return input; }
}
