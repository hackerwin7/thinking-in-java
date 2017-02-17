package com.github.hackerwin7.thinking.in.java.chapter.polymorphism;

import com.github.hackerwin7.thinking.in.java.chapter.polymorphism.shape.RandomShapeGenerator;
import com.github.hackerwin7.thinking.in.java.chapter.polymorphism.shape.Shape;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/17
 * Time: 3:31 PM
 * Desc:
 * Tips:
 */
public class E02_Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();
    public static void main(String[] args) {
        Shape[] shapes = new Shape[9];
        for(int i = 0; i < shapes.length; i++)
            shapes[i] = gen.next();
        for(Shape shape : shapes)
            shape.draw();
    }
}
