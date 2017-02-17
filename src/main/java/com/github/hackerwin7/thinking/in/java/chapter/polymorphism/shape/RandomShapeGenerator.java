package com.github.hackerwin7.thinking.in.java.chapter.polymorphism.shape;

import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/17
 * Time: 3:21 PM
 * Desc:
 * Tips:
 */
public class RandomShapeGenerator {
    private Random rand = new Random(47);
    public Shape next() {
        switch (rand.nextInt(3)) {
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
        }
    }
}
