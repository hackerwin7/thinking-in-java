package com.github.hackerwin7.thinking.in.java.chapter.polymorphism;

import com.github.hackerwin7.thinking.in.java.chapter.polymorphism.newshape.Circle;
import com.github.hackerwin7.thinking.in.java.chapter.polymorphism.newshape.Shape;
import com.github.hackerwin7.thinking.in.java.chapter.polymorphism.newshape.Square;
import com.github.hackerwin7.thinking.in.java.chapter.polymorphism.newshape.Triangle;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/17
 * Time: 3:35 PM
 * Desc:
 * Tips:
 */
public class E03_NewShapeMethod {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(), new Square(), new Triangle()
        };
        for(Shape shape : shapes) {
            shape.draw();
            shape.erase();
            shape.msg();
        }
    }
}
