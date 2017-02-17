package com.github.hackerwin7.thinking.in.java.chapter.polymorphism;

import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/17
 * Time: 6:36 PM
 * Desc:
 * Tips:
 */
public class E08_RandomInstruments2 {
    public static void main(String[] args) {
        InstrumentGenerator2 gen = new InstrumentGenerator2();
        for(int i = 0; i < 20; i++)
            System.out.println(gen.next());
    }
}

class InstrumentGenerator2 {
    Random gen = new Random(47);
    Class<?> instruments[] = {
            Wind.class,
            Percussion.class,
            Stringed.class,
            Brass.class,
            Woodwind.class,
            Electronic.class
    };
    public Instrument next() {
        try {
            int idx = Math.abs(gen.nextInt(instruments.length));
            return (Instrument) instruments[idx].newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Cannot Create", e);
        }
    }
}