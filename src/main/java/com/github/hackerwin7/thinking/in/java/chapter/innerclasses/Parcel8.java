package com.github.hackerwin7.thinking.in.java.chapter.innerclasses;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/07/03
 * Time: 2:16 PM
 * Desc:
 * Tips:
 */
public class Parcel8 {
    public Wrapping wrapping(int x) {
        return new Wrapping(x) {
            public int value() {
                return super.value() * 47;
            }
        };
    }
    public static void main(String[] args) {
        Parcel8 p = new Parcel8();
        Wrapping w = p.wrapping(10);
    }
}
