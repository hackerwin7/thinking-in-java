package com.github.hackerwin7.thinking.in.java.chapter.reusing;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/15
 * Time: 8:18 PM
 * Desc:
 * Tips:
 */
public class E19_BlankFinalField {
    public static void main(String[] args) {
        WithBlankFinalField wbff = new WithBlankFinalField(10);
        System.out.println(wbff.geti());
    }
}

class WithBlankFinalField {
    private final Integer i;
    public WithBlankFinalField(int ii) {
        i = ii;
    }
    public Integer geti() {
//        if(i == null)
//            i = new Integer(47);
        return i;
    }
}