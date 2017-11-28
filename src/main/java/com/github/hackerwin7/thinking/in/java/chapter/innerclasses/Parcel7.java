package com.github.hackerwin7.thinking.in.java.chapter.innerclasses;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/07/03
 * Time: 11:12 AM
 * Desc:
 * Tips:
 */
public class Parcel7 {
    public Contents contents() {
        return new Contents() {
            private int i = 11;
            public int value() {
                return i;
            }
        };
    }
    public static void main(String[] args) {
        Parcel7 p = new Parcel7();
        Contents c = p.contents();
    }
}
