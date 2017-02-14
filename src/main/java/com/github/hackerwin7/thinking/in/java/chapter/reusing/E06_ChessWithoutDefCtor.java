package com.github.hackerwin7.thinking.in.java.chapter.reusing;
// {CompileTimeError}
/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/14
 * Time: 8:45 PM
 * Desc:
 * Tips:
 */
public class E06_ChessWithoutDefCtor {
    public static void main(String[] args) {
        new ChessWithoutDefCtor();
    }
}

class ChessWithoutDefCtor extends BoardGame {
//    ChessWithoutDefCtor() {
//        System.out.println("ChessWithoutDefCtor constructor");
//        super(11);
//    }

    ChessWithoutDefCtor() {
        super(11);
        System.out.println("ChessWithoutDefCtor constructor");
    }
}