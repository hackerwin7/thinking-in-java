package com.github.hackerwin7.thinking.in.java.chapter.initandclean.exercise;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/11/22
 * Time: 2:36 PM
 * Desc:
 * Tips:
 */
public class Ex12 {
    public static void main(String[] args) {
        new Tank().empty();
        new Tank();
        System.gc();
        System.runFinalization();
    }
}

class Tank {
    static int counter;
    int id = counter++;
    boolean full;
    public Tank() {
        System.out.println("Tank " + id + " created");
        full = true;
    }
    public void empty() {
        full = false;
    }
    protected void finalize() {
        if(full)
            System.out.println("Error: tank " + id + " must be empty at cleanup");
        else
            System.out.println("Tank " + id + " cleaned up OK");
    }
    public String toString() { return "Tank " + id; }
}