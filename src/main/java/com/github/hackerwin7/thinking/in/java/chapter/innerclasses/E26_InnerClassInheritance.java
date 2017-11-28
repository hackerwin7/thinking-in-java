package com.github.hackerwin7.thinking.in.java.chapter.innerclasses;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/07/11
 * Time: 3:48 PM
 * Desc:
 * Tips:
 */
public class E26_InnerClassInheritance {
    class Inner2 extends WithNonDefault.Inner {
        public Inner2(WithNonDefault wnd, int i) {
            wnd.super(i);
        }
        public void f() {
            System.out.println("Inner2.f");
            super.f();
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        WithNonDefault wnd = new WithNonDefault();
        E26_InnerClassInheritance ici = new E26_InnerClassInheritance();
        Inner2 i2 = ici.new Inner2(wnd, 32);
        i2.f();
    }
}

class WithNonDefault {
    class Inner {
        int i;
        public Inner(int i) { this.i = i; }
        public Inner() { i = 47; }
        public void f() { System.out.println("Inner.f"); }
    }
}