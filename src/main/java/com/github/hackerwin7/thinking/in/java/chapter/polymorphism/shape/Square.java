package com.github.hackerwin7.thinking.in.java.chapter.polymorphism.shape;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/17
 * Time: 3:19 PM
 * Desc:
 * Tips:
 */
public class Square extends Shape {
    @Override public void draw() { System.out.println("Square.draw()"); }
    @Override public void erase() { System.out.println("Square.erase()"); }
}
