package com.github.hackerwin7.thinking.in.java.chapter.interfaces;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/23
 * Time: 6:39 PM
 * Desc:
 * Tips:
 */
public class E03_Initialization {
    public static void main(String[] args) {
        DerivedWithPrint dp = new DerivedWithPrint();
        dp.print();
//        BaseWithPrint bp = new DerivedWithPrint();
//        bp.print();
    }
}

abstract class BaseWithPrint {
    public BaseWithPrint() { print(); }
    public abstract void print();
}

class DerivedWithPrint extends BaseWithPrint {
    int i = 47;
    public void print() {
        System.out.println("i = " + i);
    }
}