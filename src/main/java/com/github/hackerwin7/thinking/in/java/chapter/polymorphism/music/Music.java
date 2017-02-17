package com.github.hackerwin7.thinking.in.java.chapter.polymorphism.music;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/17
 * Time: 2:20 PM
 * Desc:
 * Tips:
 */
public class Music {
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }
    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute);
    }
}
