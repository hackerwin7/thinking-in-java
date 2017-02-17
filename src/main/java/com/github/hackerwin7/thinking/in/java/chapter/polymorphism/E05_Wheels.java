package com.github.hackerwin7.thinking.in.java.chapter.polymorphism;

import com.github.hackerwin7.thinking.in.java.chapter.polymorphism.cycle2.Bicycle;
import com.github.hackerwin7.thinking.in.java.chapter.polymorphism.cycle2.Cycle;
import com.github.hackerwin7.thinking.in.java.chapter.polymorphism.cycle2.Tricycle;
import com.github.hackerwin7.thinking.in.java.chapter.polymorphism.cycle2.Unicycle;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/17
 * Time: 4:28 PM
 * Desc:
 * Tips:
 */
public class E05_Wheels {
    public static void ride(Cycle c) {
        System.out.println("Num. of wheels: " + c.wheels());
    }
    public static void main(String[] args) {
        ride(new Unicycle());
        ride(new Bicycle());
        ride(new Tricycle());
    }
}
