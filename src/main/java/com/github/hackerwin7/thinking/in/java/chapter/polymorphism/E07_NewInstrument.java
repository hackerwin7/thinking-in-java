package com.github.hackerwin7.thinking.in.java.chapter.polymorphism;

import static com.github.hackerwin7.thinking.in.java.utils.Print.*;
import com.github.hackerwin7.thinking.in.java.chapter.polymorphism.music.Note;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/17
 * Time: 6:24 PM
 * Desc:
 * Tips:
 */
public class E07_NewInstrument {
    static Instrument[] orchestra = {
            new Wind(),
            new Percussion(),
            new Stringed(),
            new Brass(),
            new Woodwind(),
            new Electronic()
    };
    public static void main(String[] args) {
        for(Instrument i : orchestra) {
            i.play(Note.MIDDLE_C);
            i.adjust();
            print(i);
        }
    }
}

class Electronic extends Instrument {
    void play(Note n) { print("Electronic.play() " + n); }
    public String toString() { return "Electronic"; }
}