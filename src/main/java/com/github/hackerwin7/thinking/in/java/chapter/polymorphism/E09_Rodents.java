package com.github.hackerwin7.thinking.in.java.chapter.polymorphism;

import static com.github.hackerwin7.thinking.in.java.utils.Print.*;
/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/17
 * Time: 6:45 PM
 * Desc:
 * Tips:
 */
public class E09_Rodents {
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

class Rodent {
    public void hop() { print("Rodent hopping"); }
    public void scurry() { print("Rodent scurrying"); }
    public void reproduce() { print("Making more Rodents"); }
    public String toString() { return "Rodent"; }
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