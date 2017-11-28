package com.github.hackerwin7.thinking.in.java.chapter.innerclasses;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/07/06
 * Time: 3:02 PM
 * Desc:
 * Tips:
 */
public class E23_UAB {
    public static void main(String[] args) {
        A1[] aa = {new A1(), new A1(), new A1()};
        B1 b = new B1(3);
        for(int  i = 0; i < aa.length; i++)
            b.add(aa[i].getU());
        b.callMethods();
        System.out.println("****");
        b.setNull(0);
        b.callMethods();
    }
}

interface U {
    void f();
    void g();
    void h();
}

class A1 {
    public U getU() {
        return new U() {
            public void f() {
                System.out.println("A.f");
            }

            public void g() {
                System.out.println("A.g");
            }

            public void h() {
                System.out.println("A.h");
            }
        };
    }
}

class B1 {
    U[] ua;
    public B1(int size) {
        ua = new U[size];
    }
    public boolean add(U elem) {
        for(int  i = 0; i < ua.length; i++) {
            if(ua[i] == null) {
                ua[i] = elem;
                return true;
            }
        }
        return false;
    }
    public boolean setNull(int i) {
        if(i < 0 || i >= ua.length)
            return false;
        ua[i] = null;
        return true;
    }
    public void callMethods() {
        for(int i = 0; i < ua.length; i++)
            if(ua[i] != null) {
                ua[i].f();
                ua[i].g();
                ua[i].h();
            }
    }
}