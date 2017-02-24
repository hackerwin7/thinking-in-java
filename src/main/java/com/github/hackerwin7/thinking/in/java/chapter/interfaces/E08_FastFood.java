package com.github.hackerwin7.thinking.in.java.chapter.interfaces;

import com.github.hackerwin7.thinking.in.java.chapter.polymorphism.Sandwich;

import static com.github.hackerwin7.thinking.in.java.utils.Print.*;
/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/24
 * Time: 6:14 PM
 * Desc:
 * Tips:
 */
public class E08_FastFood {
    public static void main(String[] args) {
        FastSandwich burger = new FastSandwich();
        print("Fries with that?");
        print("Super Size?");
        burger.rushOrder();
        burger.gobble();
    }
}

interface FastFood {
    void rushOrder();
    void gobble();
}

class FastSandwich extends Sandwich implements FastFood {
    public void rushOrder() {
        print("Rushing your sandwich order");
    }
    public void gobble() { print("Chomp! Snort! Gobble!"); }
}