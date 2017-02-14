package com.github.hackerwin7.thinking.in.java.chapter.operators.exercise;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/08/22
 * Time: 5:00 PM
 * Desc:
 * Tips:
 */
public class Ex6 {
    static void compare(Dog dog1, Dog dog2) {
        System.out.println("==: " + (dog1 == dog2));
        System.out.println("equals: " + dog1.equals(dog2));
        System.out.println("== on name: " + (dog1.name == dog2.name));
        System.out.println("equals on name: " + dog1.name.equals(dog2.name));
        System.out.println("== on says: " + (dog1.says == dog2.says));
        System.out.println("equals on says: " + dog1.says.equals(dog2.says));
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = dog1;
        dog1.name = "spot";         dog1.says = "ruff!";
        dog2.name = "scruffy";      dog2.says = "wurf!";
        compare(dog1, dog2);
        compare(dog1, dog3);
        compare(dog2, dog3);
    }
}
