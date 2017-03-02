package com.github.hackerwin7.thinking.in.java.chapter.interfaces;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/03/02
 * Time: 6:59 PM
 * Desc:
 * Tips:
 */
public class E12_CanClimb {
    static void t(CanFight x) { x.fight(); }
    static void u(CanSwim x) { x.swim(); }
    static void v(CanFly x) { x.fly(); }
    static void z(CanClimb x) { x.climb(); }
    static void w(ActionCharacter x) { x.fight(); }
    public static void main(String[] args) {
        Hero2 h = new Hero2();
        t(h);
        u(h);
        v(h);
        z(h);
        w(h);
    }
}

interface CanClimb {
    void climb();
}

class Hero2 extends ActionCharacter
        implements CanFight, CanSwim, CanFly, CanClimb {
    public void swim() {}
    public void fly() {}
    public void climb() {}
}