package com.github.hackerwin7.thinking.in.java.chapter.five.instance;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/11/17
 * Time: 3:39 PM
 * Desc:
 * Tips:
 */
public class Flower {
    int petalCount = 0;
    String s = "initial value";
    Flower(int petals) {
        petalCount = petals;
        System.out.println("Constructor w/ int arg only, petalCounts = " + petalCount);
    }

    Flower(String ss) {
        System.out.println("Constructor w/ String  arg only, s = " + ss);
    }

    Flower(String s, int petals) {
        this(petals);
        // this(s); // can not call two constructors
        this.s = s; // argument diff
        System.out.println("String & int args");
    }

    Flower() {
        this("hi", 47);
        System.out.println("default constructor (no args)");
    }

    void printPetalCount() {
        // this(11); // Not inside non-constructor!
        System.out.println("petalCount = " + petalCount + " s = " + s);
    }

    public static void main(String[] args) {
        Flower x = new Flower();
        x.printPetalCount();
    }
}
