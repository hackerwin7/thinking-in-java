package com.github.hackerwin7.thinking.in.java.chapter.polymorphism;

import static com.github.hackerwin7.thinking.in.java.utils.Print.*;
/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/20
 * Time: 8:43 PM
 * Desc:
 * Tips:
 */
public class E13_VerifiedRefCounting {
    public static void main(String[] args) {
        Shared1 shared = new Shared1();
        Composing1[] composings = {
                new Composing1(shared),
                new Composing1(shared),
                new Composing1(shared),
                new Composing1(shared),
                new Composing1(shared)
        };
        for(Composing1 c : composings)
            c.dispose();
        System.gc();
        new Composing1(new Shared1());
        System.gc();
    }
}

class Shared1 {
    private int refcount = 0;
    private static int counter = 0;
    private int id = counter++;
    public Shared1() {
        print("Creating " + this);
    }
    public void addRef() { refcount++; }
    protected void dispose() {
        if(--refcount == 0)
            print("Disposing " + this);
    }
    protected void finalize() {
        if(refcount != 0)
            print("Error: object is not properly cleaned-up!");
    }
    public String toString() { return "Shared " + id; }
}

class Composing1 {
    private Shared1 shared;
    private static int counter = 0;
    private int id = counter++;
    public Composing1(Shared1 shared) {
        print("Creating " + this);
        this.shared = shared;
        this.shared.addRef();
    }
    protected void dispose() {
        print("disposing " + this);
        shared.dispose();
    }
    public String toString() { return "Composing " + id; }
}