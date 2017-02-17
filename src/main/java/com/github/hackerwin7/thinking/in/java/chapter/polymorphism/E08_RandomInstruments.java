package com.github.hackerwin7.thinking.in.java.chapter.polymorphism;

import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/17
 * Time: 6:30 PM
 * Desc:
 * Tips:
 */
public class E08_RandomInstruments {
    public static void main(String[] args) {
        InstrumenttGenerator gen = new InstrumenttGenerator();
        for(int i = 0; i < 20; i++)
            System.out.println(gen.next());
    }
}

class InstrumenttGenerator {
    Random gen = new Random(47);
    public Instrument next() {
        switch (gen.nextInt(6)) {
            default:
            case 0: return new Wind();
            case 1: return new Percussion();
            case 2: return new Stringed();
            case 3: return new Brass();
            case 4: return new Woodwind();
            case 5: return new Electronic();
        }
    }
}