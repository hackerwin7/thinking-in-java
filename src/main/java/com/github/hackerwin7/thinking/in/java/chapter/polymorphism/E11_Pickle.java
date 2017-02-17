package com.github.hackerwin7.thinking.in.java.chapter.polymorphism;

import static com.github.hackerwin7.thinking.in.java.utils.Print.*;
/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/17
 * Time: 8:27 PM
 * Desc:
 * Tips:
 */
public class E11_Pickle {
    public static void main(String[] args) {
        new Sandwich2();
    }
}

class Pickle {
    Pickle() { print("Pickle()"); }
}

class Sandwich2 extends PortableLunch {
    Bread b = new Bread();
    Cheese c = new Cheese();
    Lettuce l = new Lettuce();
    Pickle p = new Pickle();
    Sandwich2() { print("Sandwich()"); }
}