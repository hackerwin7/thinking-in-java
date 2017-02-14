package com.github.hackerwin7.thinking.in.java.chapter.initandclean.exercise;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/11/22
 * Time: 3:26 PM
 * Desc:
 * Tips:
 */
public class Ex21 {
    public static void main(String[] args) {
        for(PaperCurrencyTypes s : PaperCurrencyTypes.values())
            System.out.println(s + ". ordinal " + s.ordinal());
    }
}

enum PaperCurrencyTypes {
    ONE, TWO, FIVE, TEN, TWENTY, FIFTY
}