package com.github.hackerwin7.thinking.in.java.chapter.reusing;

import com.github.hackerwin7.thinking.in.java.chapter.reusing.protect.E15_Protected;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/15
 * Time: 6:21 PM
 * Desc:
 * Tips:
 */
public class E15_ProtectedTest {
    public static void main(String[] args) {
        //! new E15_Protected().f();
        new Derived().g();
    }
}

class Derived extends E15_Protected {
    public void g() {
        f();
    }
}