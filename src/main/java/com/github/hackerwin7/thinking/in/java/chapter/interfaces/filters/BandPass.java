package com.github.hackerwin7.thinking.in.java.chapter.interfaces.filters;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/24
 * Time: 7:40 PM
 * Desc:
 * Tips:
 */
public class BandPass extends Filter {
    double lowCutoff, highCutoff;
    public BandPass(double lowCut, double highCut) {
        lowCutoff = lowCut;
        highCutoff = highCut;
    }
    public Waveform process(Waveform input) { return input; }
}
