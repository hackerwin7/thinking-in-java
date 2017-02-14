package com.github.hackerwin7.thinking.in.java.chapter.initandclean.exercise;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/11/22
 * Time: 11:36 AM
 * Desc:
 * Tips:
 */
public class Ex5 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.bark(1);
        dog.bark(1.1);
    }
}

class Dog {
    public void bark() {
        System.out.println("Default bark!");
    }

    public void bark(int i) {
        System.out.println("int bark = howl");
    }

    public void bark(double d) {
        System.out.println("double bark = yip");
    }
}