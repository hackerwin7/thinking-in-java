package com.github.hackerwin7.thinking.in.java.chapter.interfaces;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/06/15
 * Time: 3:31 PM
 * Desc:
 * Tips:
 */
public class E18_CycleFactories {
    public static void ride(CycleFactory fact) {
        Cycle c = fact.getCycle();
        System.out.println("Num. of wheels: " + c.wheels());
    }

    public static void main(String[] args) {
        ride(new UnicycleFactory());
        ride(new BicycleFactory());
        ride(new TricycleFactory());
    }
}

interface Cycle {
    int wheels();
}

interface CycleFactory {
    Cycle getCycle();
}

class Unicycle implements Cycle {
    public int wheels() { return 1; }
}

class UnicycleFactory implements CycleFactory {
    public Unicycle getCycle() { return new Unicycle(); }
}

class Bicycle implements Cycle {
    public int wheels() { return 2; }
}

class BicycleFactory implements CycleFactory {
    public Bicycle getCycle() { return new Bicycle(); }
}

class Tricycle implements Cycle {
    public int wheels() { return 3; }
}

class TricycleFactory implements CycleFactory {
    public Tricycle getCycle() { return new Tricycle(); }
}