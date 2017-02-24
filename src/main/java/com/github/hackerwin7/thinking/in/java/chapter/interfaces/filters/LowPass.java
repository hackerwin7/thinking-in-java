package com.github.hackerwin7.thinking.in.java.chapter.interfaces.filters;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/24
 * Time: 7:36 PM
 * Desc:
 * Tips:
 */
public class LowPass extends Filter {
    double cutoff;
    public LowPass(double cutoff) { this.cutoff = cutoff; }
    public Waveform process(Waveform input) {
        return input;
    }
}
