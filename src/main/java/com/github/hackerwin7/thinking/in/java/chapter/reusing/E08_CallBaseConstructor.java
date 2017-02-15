package com.github.hackerwin7.thinking.in.java.chapter.reusing;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/15
 * Time: 10:27 AM
 * Desc:
 * Tips:
 */
public class E08_CallBaseConstructor {
    public static void main(String[] args) {
        new DerivedTwoConstructors();
        new DerivedTwoConstructors(74);
    }
}

class BaseNonDefault {
    public BaseNonDefault(int i) {}
}

class DerivedTwoConstructors extends BaseNonDefault {
    public DerivedTwoConstructors() { super(47); }
    public DerivedTwoConstructors(int i) {super(i);}
}