package com.github.hackerwin7.thinking.in.java.chapter.reusing;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/14
 * Time: 4:30 PM
 * Desc:
 * Tips:
 */
public class E01_Composition {

}

class Simple {
    String s;
    public Simple(String si) {s = si;}
    public String toString() {return s;}
    public void setString(String sNew) {s = sNew;}
}

class Second {
    Simple simple;
    String s;
    public Second(String si) {s = si;}
}