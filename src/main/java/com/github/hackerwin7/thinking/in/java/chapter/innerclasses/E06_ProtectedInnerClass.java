package com.github.hackerwin7.thinking.in.java.chapter.innerclasses;

import com.github.hackerwin7.thinking.in.java.chapter.innerclasses.exercise6.SimpleInterface;
import com.github.hackerwin7.thinking.in.java.chapter.innerclasses.exercise6b.SimpleClass;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/06/30
 * Time: 2:52 PM
 * Desc:
 * Tips:
 */
public class E06_ProtectedInnerClass extends SimpleClass {
    public SimpleInterface get() {
        return new Inner(); // have access to protected Inner class because of extends
    }
    public static void main(String[] args) {
        new E06_ProtectedInnerClass().get().f();
    }
}
