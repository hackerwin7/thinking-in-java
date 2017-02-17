package com.github.hackerwin7.thinking.in.java.chapter.polymorphism;

import com.github.hackerwin7.thinking.in.java.chapter.polymorphism.cycle.Bicycle;
import com.github.hackerwin7.thinking.in.java.chapter.polymorphism.cycle.Cycle;
import com.github.hackerwin7.thinking.in.java.chapter.polymorphism.cycle.Tricycle;
import com.github.hackerwin7.thinking.in.java.chapter.polymorphism.cycle.Unicycle;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/17
 * Time: 2:39 PM
 * Desc:
 * Tips:
 */
public class E01_Upcasting {
    public static void ride(Cycle c) {}
    public static void main(String[] args) {
        ride(new Cycle());
        ride(new Unicycle());
        ride(new Bicycle());
        ride(new Tricycle());
    }
}
