package com.github.hackerwin7.thinking.in.java.chapter.polymorphism;

import com.github.hackerwin7.thinking.in.java.chapter.polymorphism.newshape.*;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/17
 * Time: 4:19 PM
 * Desc:
 * Tips:
 */
public class E04_NewShapeType {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(), new Square(), new Triangle(),
                new Tetrahedron()
        };
        for(Shape shape : shapes) {
            shape.draw();
            shape.erase();
            shape.msg();
        }
    }
}
