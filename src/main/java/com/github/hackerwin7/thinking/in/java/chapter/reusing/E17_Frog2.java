package com.github.hackerwin7.thinking.in.java.chapter.reusing;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/15
 * Time: 7:05 PM
 * Desc:
 * Tips:
 */
public class E17_Frog2 {
    public static void main(String[] args) {
        Amphibian a = new Frog2();
        a.moveInWater();
        a.moveOnLand();
    }
}

class Frog2 extends Amphibian {
    public void moveInWater() {
        System.out.println("Frog swimming");
    }
    public void moveOnLand() {
        System.out.println("Frog jumping");
    }
}