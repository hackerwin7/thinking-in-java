package com.github.hackerwin7.thinking.in.java.chapter.three.instance;

import static com.github.hackerwin7.thinking.in.java.chapter.three.instance.Assignment.*;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/06/14
 * Time: 11:50 AM
 * Desc:
 * Tips:
 */
public class PassObject {
    static void f(Letter y) {
        y.c = 'z';
    }

    public static void main(String[] args) throws Exception {
        Letter x = new Letter();
        x.c = 'a';
        print("1: x.c: " + x.c);
        f(x);
        print("2: x.c: " + x.c);
    }
}

class Letter {
    char c;
}
