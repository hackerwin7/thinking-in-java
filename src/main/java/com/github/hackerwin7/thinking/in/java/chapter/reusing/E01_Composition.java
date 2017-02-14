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
    public static void main(String[] args) {
        Second second = new Second("Init String");
        second.check();
        System.out.println(second.getSimple());
        second.check();
        System.out.println(second);
        second.setSimple("New String");
        System.out.println(second);
    }
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
    public void check() {
        if(simple == null) System.out.println("not initialized");
        else System.out.println("initialized");
    }
    private Simple lazy() {
        if(simple == null) {
            System.out.println("Creating Simple");
            simple = new Simple(s);
        }
        return simple;
    }
    public Simple getSimple() {return lazy();}
    public String toString() { return lazy().toString(); }
    public void setSimple(String sNew) { lazy().setString(sNew); }
}