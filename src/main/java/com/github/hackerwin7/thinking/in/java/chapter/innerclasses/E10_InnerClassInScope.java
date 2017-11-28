package com.github.hackerwin7.thinking.in.java.chapter.innerclasses;

import com.github.hackerwin7.thinking.in.java.chapter.innerclasses.exercise6.SimpleInterface;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/06/30
 * Time: 4:13 PM
 * Desc:
 * Tips:
 */
public class E10_InnerClassInScope {
    public SimpleInterface get() {
        {
            class SI implements SimpleInterface {
                public void f() {
                    System.out.println("SI.f");
                }
            }
            return new SI();
        }
    }
    public static void main(String[] args) {
        SimpleInterface si = new E10_InnerClassInScope().get();
        si.f();
    }
}