package com.github.hackerwin7.thinking.in.java.chapter.reusing;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/15
 * Time: 6:27 PM
 * Desc:
 * Tips:
 */
public class Wind extends Instrument {
    public static void main(String[] args) {
        Wind flute = new Wind();
        Instrument.tune(flute);
    }
}

class Instrument {
    public void play() {}
    static void tune(Instrument i) {
        i.play();
    }
}