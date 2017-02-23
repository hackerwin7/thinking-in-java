package com.github.hackerwin7.thinking.in.java.chapter.interfaces;

import com.github.hackerwin7.thinking.in.java.chapter.interfaces.ownpackage.AnInterface;

import static com.github.hackerwin7.thinking.in.java.utils.Print.*;
/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/23
 * Time: 8:53 PM
 * Desc:
 * Tips:
 */
public class E05_ImplementInterface {
    public static void main(String[] args) {
        ImplementInterface imp = new ImplementInterface();
        imp.f();
        imp.g();
        imp.h();
    }
}

class ImplementInterface implements AnInterface {
    public void f() { print("ImplementInterface.f"); }
    public void g() { print("ImplementInterface.g"); }
    public void h() { print("ImplementInterface.h"); }
}