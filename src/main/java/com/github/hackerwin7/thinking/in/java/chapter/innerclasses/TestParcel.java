package com.github.hackerwin7.thinking.in.java.chapter.innerclasses;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/06/26
 * Time: 10:53 AM
 * Desc:
 * Tips:
 */
public class TestParcel {
    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        Parcel1.Contents c = p.contents();
        Destination d = p.destination("Tasmania");
        // illegal -- cant access
        //! Parcel4.PContents pc = p.new PContents();
        //! Parcel4.PContents pc1 = p.contents();
    }
}

class Parcel4 {
    private Parcel1 parcel1 = new Parcel1();

    private class PContents extends Parcel1.Contents {
        PContents() {
            new Parcel1().super(); // no enclosing instance of outer class type in this scope
            // for inner class extends problem
            // new super(), and super() is Contents() and inner class of Parcel1
            // super() is PContents extends Contents class
            // Parcel1.super() is that Contents is inner class of the Parcel1
        }
        private int i = 11;
        public int value() { return i; }
    }
    protected class PDestination implements Destination {
        private String label;
        private PDestination(String whereTo) {
            label = whereTo;
        }
        public String readLabel() { return label; }
    }
    public Destination destination(String s) {
        return new PDestination(s);
    }
    public Parcel1.Contents contents() {
        return new PContents();
    }
}