package com.github.hackerwin7.thinking.in.java.chapter.reusing;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/14
 * Time: 7:50 PM
 * Desc:
 * Tips:
 */
public class E02_NewDetergent {
    public static void main(String[] args) {
        NewDetergent nd = new NewDetergent();
        nd.dilute();
        nd.scrub();
        nd.sterilize();
        System.out.println(nd);
    }
}

class NewDetergent extends Detergent {
    @Override
    public void scrub() {
        append(" NewDetergent.scrub()");
        super.scrub();
    }
    public void sterilize() { append(" sterilize()"); }
}