package com.github.hackerwin7.thinking.in.java.chapter.interfaces;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/03/03
 * Time: 7:54 PM
 * Desc:
 * Tips:
 */
public class InterfaceCollision {
}

interface I1 { void f(); }
interface I2 { int f(int i); }
interface I3 { int f(); }
class C { public int f() { return 1; } }

class C2 implements I1, I2 {
    public void f() {}
    public int f(int i) { return 1; }
}

class C3 extends C implements I2 {
    public int f(int i) { return 1; }
}

class C4 extends C implements I3 {
    public int f() { return 1; }
}

//! class C5 extends C implements I1 {} // ambiguity return type
//! interface I4 extends I1, I3 {} // ambiguity return type (how to call differently, own return type f() also can call with f();)
interface I5 extends I1, I2 {}
interface I6 extends I2, I3 {}