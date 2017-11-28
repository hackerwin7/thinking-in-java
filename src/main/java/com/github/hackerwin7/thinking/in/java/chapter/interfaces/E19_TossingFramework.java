package com.github.hackerwin7.thinking.in.java.chapter.interfaces;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/06/15
 * Time: 3:50 PM
 * Desc:
 * Tips:
 */
public class E19_TossingFramework {
    public static void simulate(TossingFactory fact) {
        Tossing t = fact.getTossing();
        while (t.event())
            ;
    }

    public static void main(String[] args) {
        simulate(new CoinTossingFactory());
        simulate(new DiceTossingFactory());
    }
}

interface Tossing { boolean event(); }

interface TossingFactory { Tossing getTossing(); }

class CoinTossing implements Tossing {
    private int events;
    private static final int EVENTS = 2;
    public boolean event() {
        System.out.println("Coin tossing event " + events);
        return ++events != EVENTS;
    }
}

class CoinTossingFactory implements TossingFactory {
    public CoinTossing getTossing() {
        return new CoinTossing();
    }
}

class DiceTossing implements Tossing {
    private int events;
    private static final int EVENTS = 6;
    public boolean event() {
        System.out.println("Dice tossing event " + events);
        return ++events != EVENTS;
    }
}

class DiceTossingFactory implements TossingFactory {
    public DiceTossing getTossing() {
        return new DiceTossing();
    }
}