package com.github.hackerwin7.thinking.in.java.chapter.innerclasses;

import com.github.hackerwin7.thinking.in.java.chapter.innerclasses.exercise6.SimpleInterface;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/07/03
 * Time: 3:14 PM
 * Desc:
 * Tips:
 */
public class E13_AnonymousInnerClassInMethod {
    public SimpleInterface get() {
        return new SimpleInterface() {
            public void f() {
                System.out.println("SimpleInterface.f");
            }
        };
    }
    public static void main(String[] args) {
        SimpleInterface si = new E13_AnonymousInnerClassInMethod().get();
        si.f();
    }
}
