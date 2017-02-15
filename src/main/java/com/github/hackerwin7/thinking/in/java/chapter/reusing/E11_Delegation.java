package com.github.hackerwin7.thinking.in.java.chapter.reusing;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/15
 * Time: 11:55 AM
 * Desc:
 * Tips:
 */
public class E11_Delegation {
    public static void main(String[] args) {
        DetergentDelegation.main(args);
    }
}

class DetergentDelegation {
    public void append(String a) {
        cleanser.append(a);
    }

    public void dilute() {
        cleanser.dilute();
    }

    public void apply() {
        cleanser.apply();
    }

    public void scrub() {
        append(" DetergentDelegation.scrub()");
        cleanser.scrub();
    }

    @Override
    public String toString() {
        return cleanser.toString();
    }

    public void foam() { append(" foam()"); }

    public static void main(String[] args) {
        DetergentDelegation x = new DetergentDelegation();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Testing base class:");
        Cleanser.main(args);
    }

    private Cleanser cleanser = new Cleanser();
}
