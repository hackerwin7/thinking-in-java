package com.github.hackerwin7.thinking.in.java.chapter.reusing;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/15
 * Time: 6:48 PM
 * Desc:
 * Tips:
 */
public class E16_Frog {
    public static void main(String[] args) {
        Amphibian a = new Frog();
        a.moveInWater();
        a.moveOnLand();
    }
}

class Amphibian {
    public void moveInWater() {
        System.out.println("Moving in Water");
    }
    public void moveOnLand() {
        System.out.println("Moving on Land");
    }
}

class Frog extends Amphibian {}