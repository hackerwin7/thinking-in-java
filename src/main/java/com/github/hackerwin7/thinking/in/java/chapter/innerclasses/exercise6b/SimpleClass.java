package com.github.hackerwin7.thinking.in.java.chapter.innerclasses.exercise6b;

import com.github.hackerwin7.thinking.in.java.chapter.innerclasses.exercise6.SimpleInterface;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/06/30
 * Time: 2:53 PM
 * Desc:
 * Tips:
 */
public class SimpleClass {
    protected class Inner implements SimpleInterface {
        public Inner() {}
        public void f() {}
    }
}
