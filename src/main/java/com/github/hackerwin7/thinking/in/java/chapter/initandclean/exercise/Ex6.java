package com.github.hackerwin7.thinking.in.java.chapter.initandclean.exercise;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/11/22
 * Time: 11:42 AM
 * Desc:
 * Tips:
 */
public class Ex6 {
    public static void main(String[] args) {
        Dog2 dog = new Dog2();
        dog.bark(1, 2.2);
        dog.bark(2.2, 1);
    }
}

class Dog2 {
    public void bark(int i, double d) {
        System.out.println("int, double bark");
    }

    public void bark(double d, int i) {
        System.out.println("double, int bark");
    }
}