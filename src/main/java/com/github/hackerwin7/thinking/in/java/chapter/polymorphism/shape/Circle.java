package com.github.hackerwin7.thinking.in.java.chapter.polymorphism.shape;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/17
 * Time: 3:17 PM
 * Desc:
 * Tips:
 */
public class Circle extends Shape {
    @Override public void draw() { System.out.println("Circle.draw()"); }
    @Override public void erase() { System.out.println("Circle.erase()"); }
}
