package com.github.hackerwin7.thinking.in.java.chapter.innerclasses;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/07/11
 * Time: 3:43 PM
 * Desc:
 * Tips:
 */
public class InheritInner extends WithInner.Inner {
    InheritInner(WithInner wi) {
        wi.super(); // inherit inner class syntax outerclass.super() in constructor
    }
    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);
    }
}

class WithInner {
    class Inner {}
}