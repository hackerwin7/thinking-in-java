package com.github.hackerwin7.thinking.in.java.chapter.innerclasses;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/07/03
 * Time: 2:28 PM
 * Desc:
 * Tips:
 */
public class Parcel9 {
    public Destination destination(final String dest) {
        return new Destination() {
            private String label = dest;
            public String readLabel() {
                return null;
            }
        };
    }
    public static void main(String[] args) {
        Parcel9 p = new Parcel9();
        Destination d = p.destination("Tasmania");
    }
}
