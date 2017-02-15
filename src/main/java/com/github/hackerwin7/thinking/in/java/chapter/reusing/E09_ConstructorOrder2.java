package com.github.hackerwin7.thinking.in.java.chapter.reusing;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/15
 * Time: 10:43 AM
 * Desc:
 * Tips:
 */
public class E09_ConstructorOrder2 {
    public static void main(String[] args) {
        new Stem();
    }
}

class Component1 {
    public Component1() { System.out.println("Component1"); }
}

class Component2 {
    public Component2() { System.out.println("Component2"); }
}

class Component3 {
    public Component3() { System.out.println("Component3"); }
}

class Root {
    Component1 c1 = new Component1();
    Component2 c2 = new Component2();
    Component3 c3 = new Component3();
    public Root() { System.out.println("Root"); }
}

class Stem extends Root {
    Component1 c1 = new Component1();
    Component2 c2 = new Component2();
    Component3 c3 = new Component3();
    public Stem() { System.out.println("Stem"); }
}