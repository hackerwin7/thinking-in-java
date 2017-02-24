package com.github.hackerwin7.thinking.in.java.chapter.interfaces;

import static com.github.hackerwin7.thinking.in.java.utils.Print.*;
import com.github.hackerwin7.thinking.in.java.chapter.polymorphism.music.Note;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/24
 * Time: 6:35 PM
 * Desc:
 * Tips:
 */
public class E09_AbstractMusic5 {
    static void tune(Instrument i) {
        i.adjust();
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument[] e) {
        for (Instrument i : e)
            tune(i);
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
}

abstract class Instrument {
    public void play(Note n) {
        print(this + ".play() " + n);
    }
    public void adjust() { print(this + ".adjust()"); }
    public abstract String toString();
}

class Wind extends Instrument {
    public String toString() { return "Wind"; }
}

class Percussion extends Instrument {
    public String toString() { return "Percussion"; }
}

class Stringed extends Instrument {
    public String toString() { return "Stringed"; }
}

class Brass extends Wind {
     public String toString() { return "Brass"; }
}

class Woodwind extends Wind {
    public String toString() { return "Woodwind"; }
}