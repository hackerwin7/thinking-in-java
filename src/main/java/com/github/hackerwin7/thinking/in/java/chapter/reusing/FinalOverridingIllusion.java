package com.github.hackerwin7.thinking.in.java.chapter.reusing;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/16
 * Time: 10:41 AM
 * Desc:
 * Tips:
 */
public class FinalOverridingIllusion {
    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();
        OverridingPrivate op = op2;
        //! op.f();
        //! op.g();
        WithFinals wf = op2;
        //! wf.f();
        //! wf.g();
    }
}

class WithFinals {
    private final void f() { System.out.println("WithFinals.f()"); }
    private void g() { System.out.println("WithFinals.g()"); }
}

class InheritPricateCall extends WithFinals {
    private void go() {
        //! g();
        //! super.g();
    }
}

class OverridingPrivate extends WithFinals {
    private final void f() {
        System.out.println("OverridingPrivate.f()");
    }
    private void g() {
        System.out.println("OverridingPrivate.g()");
    }
}

class OverridingPrivate2 extends OverridingPrivate {
    public final void f() {
        System.out.println("OverridingPrivate2.f()");
    }
    public void g() {
        System.out.println("OverridingPrivate2.g()");
    }
}