package com.github.hackerwin7.thinking.in.java.chapter.initandclean.instance;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/11/18
 * Time: 5:37 PM
 * Desc: initialization sort is:
 *          jvm load .class file:
 *              init static member (remark: if there is no access to the class or access to the static domain, the static member or method would not init, to see ExplicitStatic class)
 *              init static method (remark: member is in front of method)
 *          when call new constructor method:
 *              non-static member init (default value: null, 0, 0.0 etc.)
 *              specific constructor method
 * Tips:
 */
public class StaticInitialization {
    public static void main(String[] args) {
        System.out.println("Creating new Cupboard() in main");
        new Cupboard();
        System.out.println("Creating new Cupboard() in main");
        new Cupboard();
        table.f2(1);
        cupboard.f3(1);
    }

    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();
}

class Bowl {
    Bowl(int marker) {
        System.out.println("Bowl(" + marker + ")");
    }

    void f1(int marker) {
        System.out.println("f1(" + marker + ")");
    }
}

class Table {
    static Bowl bowl1 = new Bowl(1);
    Table() {
        System.out.println("Table()");
        bowl2.f1(1);
    }

    void f2(int marker) {
        System.out.println("f2(" + marker + ")");
    }

    static Bowl bowl2 = new Bowl(2);
}

class Cupboard {
    Bowl bowl3 = new Bowl(3); // non-static is every time with constructor, but static is first time with constructor or access the static member(base class)
    static Bowl bowl4 = new Bowl(4); // static is in front of non-static member initialization
    Cupboard() {
        System.out.println("Cupboard()");
        bowl4.f1(2);
    }

    void f3(int marker) {
        System.out.println("f3(" + marker + ")");
    }

    static Bowl bowl5 = new Bowl(5);
}