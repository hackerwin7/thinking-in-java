package com.github.hackerwin7.thinking.in.java.chapter.interfaces;

import static com.github.hackerwin7.thinking.in.java.utils.Print.*;
import com.github.hackerwin7.thinking.in.java.chapter.polymorphism.music.Note;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/24
 * Time: 6:44 PM
 * Desc:
 * Tips:
 */
public class E10_PlayableMusic5 {
    static void tune(Playable p) { p.play(Note.MIDDLE_C); }
    static void tuneAll(Playable[] e) {
        for(Playable p : e)
            tune(p);
    }
    public static void main(String[] args) {
        Playable[] orchestra = {
                new Wind2(),
                new Percussion2(),
                new Stringed2(),
                new Brass2(),
                new Woodwind2()
        };
        tuneAll(orchestra);
    }
}

interface Instrument2 {
    void adjust();
}

interface Playable {
    void play(Note n);
}

class Wind2 implements Instrument2, Playable {
    public void play(Note n) {
        print(this + ".play() " + n);
    }
    public String toString() { return "Wind"; }
    public void adjust() { print(this + ".adjust()"); }
}

class Percussion2 implements Instrument2, Playable {
    public void play(Note n) {
        print(this + ".play() " + n);
    }
    public String toString() { return "Percussion"; }
    public void adjust() { print(this + ".adjust()"); }
}

class Stringed2 implements Instrument2, Playable {
    public void play(Note n) {
        print(this + ".play() " + n);
    }
    public String toString() { return "Stringed"; }
    public void adjust() { print(this + ".adjust()"); }
}

class Brass2 extends Wind2 {
    public String toString() { return "Brass"; }
}

class Woodwind2 extends Wind2 {
    public String toString() { return "Woodwind"; }
}