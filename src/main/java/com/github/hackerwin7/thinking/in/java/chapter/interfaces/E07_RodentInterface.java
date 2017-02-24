package com.github.hackerwin7.thinking.in.java.chapter.interfaces;

import static com.github.hackerwin7.thinking.in.java.utils.Print.*;
/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/24
 * Time: 6:06 PM
 * Desc:
 * Tips:
 */
public class E07_RodentInterface {
    public static void main(String[] args) {
        Rodent2[] rodents = {
                new Mouse2(),
                new Gerbil2(),
                new Hamster2()
        };
        for (Rodent2 r : rodents) {
            r.hop();
            r.scurry();
            r.reproduce();
            print(r);
        }
    }
}

interface Rodent2 {
    void hop();
    void scurry();
    void reproduce();
}

class Mouse2 implements Rodent2 {
    public void hop() { print("Mouse hopping"); }
    public void scurry() { print("Mouse scurrying"); }
    public void reproduce() { print("Making more Mice"); }
    public String toString() { return "Mouse"; }
}

class Gerbil2 implements Rodent2 {
    public void hop() { print("Gerbil hopping"); }
    public void scurry() { print("Gerbil scurrying"); }
    public void reproduce() { print("Making more Gerbils"); }
    public String toString() { return "Gerbil"; }
}

class Hamster2 implements Rodent2 {
    public void hop() { print("Hamster hopping"); }
    public void scurry() { print("Hamster scurrying"); }
    public void reproduce() { print("Making more Hamsters"); }
    public String toString() { return "Hamster"; }
}