package com.github.hackerwin7.thinking.in.java.chapter.interfaces;

import static com.github.hackerwin7.thinking.in.java.utils.Print.*;
/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/23
 * Time: 6:16 PM
 * Desc:
 * Tips:
 */
public class E01_AbstractRodent {
    public static void main(String[] args) {
        Rodent[] rodents = {
                new Mouse(),
                new Gerbil(),
                new Hamster()
        };
        for(Rodent r : rodents) {
            r.hop();
            r.scurry();
            r.reproduce();
            print(r);
        }
    }
}

abstract class Rodent {
    public abstract void hop();
    public abstract void scurry();
    public abstract void reproduce();
}

class Mouse extends Rodent {
    public void hop() { print("Mouse hopping"); }
    public void scurry() { print("Mouse scurrying"); }
    public void reproduce() { print("Making more Mice"); }
    public String toString() { return "Mouse"; }
}

class Gerbil extends Rodent {
    public void hop() { print("Gerbil hopping"); }
    public void scurry() { print("Gerbil scurrying"); }
    public void reproduce() { print("Making more Gerbils"); }
    public String toString() { return "Gerbil"; }
}

class Hamster extends Rodent {
    public void hop() { print("Hamster hopping"); }
    public void scurry() { print("Hamster scurrying"); }
    public void reproduce() { print("Making more Hamsters"); }
    public String toString() { return "Hamster"; }
}