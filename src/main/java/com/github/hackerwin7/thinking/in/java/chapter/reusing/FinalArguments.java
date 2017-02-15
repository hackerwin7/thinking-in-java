package com.github.hackerwin7.thinking.in.java.chapter.reusing;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/15
 * Time: 8:25 PM
 * Desc:
 * Tips:
 */
public class FinalArguments {
    void with(final Gizmo g) {
        //! g = new Gizmo();
    }
    void without(Gizmo g) {
        g = new Gizmo();
        g.spin();
    }
    int g(final int i) { return i + 1; }
    public static void main(String[] args) {
        FinalArguments bf = new FinalArguments();
        bf.without(null);
        bf.with(null);
    }
}

class Gizmo {
    public void spin() {}
}