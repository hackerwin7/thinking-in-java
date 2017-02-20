package com.github.hackerwin7.thinking.in.java.chapter.polymorphism;

import static com.github.hackerwin7.thinking.in.java.utils.Print.*;
/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/20
 * Time: 6:21 PM
 * Desc:
 * Tips:
 */
public class E12_RodentInitialization {
    public static void main(String[] args) {
        new Hamster2();
    }
}

class Member {
    public Member(String id) {
        print("Member constructor " + id);
    }
}

class Rodent2 {
    Member m1 = new Member("r1"), m2 = new Member("r2");
    public Rodent2() { print("Rodent constructor"); }
    public void hop() { print("Rodent hopping"); }
    public void scurry() { print("Rodent scurrying"); }
    public void reproduce() { print("Making more Rodents"); }
    public String toString() { return "Rodent"; }
}

class Mouse2 extends Rodent2 {
    Member m1 = new Member("m1"), m2 = new Member("m2");
    public Mouse2() { print("Mouse constructor"); }
    public void hop() { print("Mouse hopping"); }
    public void scurry() { print("Mouse scurrying"); }
    public void reproduce() { print("Making more Mice"); }
    public String toString() { return "Mouse"; }
}

class Gerbil2 extends Rodent2 {
    Member m1 = new Member("g1"), m2 = new Member("g2");
    public Gerbil2() { print("Gerbil constructor"); }
    public void hop() { print("Gerbil hopping"); }
    public void scurry() { print("Gerbil scuryying"); }
    public void reproduce() { print("Making more Gerbils"); }
    public String toString() { return "Gerbil"; }
}

class Hamster2 extends Rodent2 {
    Member m1 = new Member("m1"), m2 = new Member("m2");
    public Hamster2() { print("Hamster constructor"); }
    public void hop() { print("Hamster hopping"); }
    public void scurry() { print("Hamster scurrying"); }
    public void reproduce() { print("Making more Hamsters"); }
    public String toString() { return "Hamster"; }
}