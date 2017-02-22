package com.github.hackerwin7.thinking.in.java.chapter.polymorphism;

import static com.github.hackerwin7.thinking.in.java.utils.Print.*;
/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/22
 * Time: 11:03 AM
 * Desc:
 * Tips:
 */
public class PolyConstructors1 {
    public static void main(String[] args) { new RoundGlyph1(5); }
}

class Glyph1 {
    void draw() { print("Glyph.draw()"); }
    Glyph1(int r) {
        print("Glyph() before draw()");
        print("r = " + r);
        draw();
        print("Glyph() after draw()");
    }
}

class RoundGlyph1 extends Glyph1 {
    private int radius = 1;
    RoundGlyph1(int r) {
        super(r);
        print("radius firstly = " + radius);
        radius = r;
        print("RoundGlyph.RoundGlyph(), radius = " + radius);
    }
    void draw() { print("RoundGlyph.draw(), radius = " + radius); }
}