package com.github.hackerwin7.thinking.in.java.chapter.polymorphism.music;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/17
 * Time: 2:19 PM
 * Desc:
 * Tips:
 */
public class Wind extends Instrument {
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }
}
