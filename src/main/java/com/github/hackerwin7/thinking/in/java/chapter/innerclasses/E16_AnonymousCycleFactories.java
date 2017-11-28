package com.github.hackerwin7.thinking.in.java.chapter.innerclasses;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/07/03
 * Time: 4:39 PM
 * Desc:
 * Tips:
 */
public class E16_AnonymousCycleFactories {
    public static void ride(CycleFactory fact) {
        Cycle c = fact.getCycle();
        System.out.println("Num. of wheels: " + c.wheels());
    }
    public static void main(String[] args) {
        ride(Unicycle.factory);
        ride(Bicycle.factory);
        ride(Tricycle.factory);
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
    public static CycleFactory factory = new CycleFactory() {
        public Cycle getCycle() {
            return new Unicycle();
        }
    };
}

class Bicycle implements Cycle {
    public int wheels() { return 2; }
    public static CycleFactory factory = new CycleFactory() {
        public Cycle getCycle() {
            return new Bicycle();
        }
    };
}

class Tricycle implements Cycle {
    public int wheels() { return 3; }
    public static CycleFactory factory = new CycleFactory() {
        public Cycle getCycle() {
            return new Tricycle();
        }
    };
}