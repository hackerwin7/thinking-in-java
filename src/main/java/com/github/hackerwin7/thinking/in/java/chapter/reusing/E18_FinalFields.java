package com.github.hackerwin7.thinking.in.java.chapter.reusing;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/15
 * Time: 8:03 PM
 * Desc:
 * Tips:
 */
public class E18_FinalFields {
    public static void main(String[] args) {
        System.out.println("First objects:");
        System.out.println(new WithFinalFields());
        System.out.println("Second object:");
        System.out.println(new WithFinalFields());
    }
}

class SelfCounter {
    private static int count;
    private int id = count++;
    public String toString() { return "SelfCounter " + id; }
}

class WithFinalFields {
    final SelfCounter scf = new SelfCounter();
    static final SelfCounter scsf = new SelfCounter();
    public String toString() {
        return "scf = " + scf + "\nscsf + " + scsf;
    }
}