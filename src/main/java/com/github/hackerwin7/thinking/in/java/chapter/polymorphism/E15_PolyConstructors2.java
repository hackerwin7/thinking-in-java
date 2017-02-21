package com.github.hackerwin7.thinking.in.java.chapter.polymorphism;

import static com.github.hackerwin7.thinking.in.java.utils.Print.*;
/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/21
 * Time: 7:55 PM
 * Desc:
 * Tips:
 */
public class E15_PolyConstructors2 {
    public static void main(String[] args) {
        new RoundGlyph(5);
        new RectangularGlyph(2, 2);
    }
}

class RectangularGlyph extends Glyph {
    private int width = 4;
    private int height = 5;
    RectangularGlyph(int width, int height) {
        this.width = width;
        this.height = height;
        print("RectangularGlyph.RectangularGlyph(), width = " + width + ", height = " + height);
    }
    void draw() {
        print("RectangularGlyph.draw(), area = " + width * height);
    }
}