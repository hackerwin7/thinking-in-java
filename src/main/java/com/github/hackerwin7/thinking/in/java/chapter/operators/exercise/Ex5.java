package com.github.hackerwin7.thinking.in.java.chapter.operators.exercise;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/08/22
 * Time: 4:57 PM
 * Desc:
 * Tips:
 */
class Dog {
    String name;
    String says;
}

public class Ex5 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        dog1.name = "spot";     dog1.says = "ruff!";
        dog2.name = "scruffy";  dog2.says = "wurf!";
        System.out.println(dog1.name + " says " + dog1.says);
        System.out.println(dog2.name + " says " + dog2.says);
    }
}
