package com.github.hackerwin7.thinking.in.java.chapter.reusing;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/16
 * Time: 11:09 AM
 * Desc:
 * Tips:
 */
public class E20_OverrideAnnotation {
    public static void main(String[] args) {
        OverridingPrivate2E20 op2 = new OverridingPrivate2E20();
        op2.f();
        op2.g();
    }
}

class OverridingPrivateE20 extends WithFinals {
//    @Override
    private final void f() {
        System.out.println("OverridingPrivateE20.f()");
    }
//    @Override
    private void g() {
        System.out.println("OverridingPrivateE20.g()");
    }
}

class OverridingPrivate2E20 extends OverridingPrivateE20 {
//    @Override
    public final void f() {
        System.out.println("OverridingPrivate2E20.f()");
    }
//    @Override
    public void g() {
        System.out.println("OverridingPrivate2E20.g()");
    }
}