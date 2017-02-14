package com.github.hackerwin7.thinking.in.java.chapter.initandclean.exercise;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/11/22
 * Time: 3:28 PM
 * Desc:
 * Tips:
 */
public class Ex22 {
    static void describe(PaperCurrencyTypes pct) {
        System.out.print(pct + " has a portrait of ");
        switch (pct) {
            case ONE:
                System.out.print("George Washington");
                break;
            case TWO:
                System.out.print("Thomas Jefferson");
                break;
            case FIVE:
                System.out.print("Abraham Lincoln");
                break;
            case TEN:
                System.out.print("Alexander Hamilton");
                break;
            case TWENTY:
                System.out.print("Andrew Jackson");
                break;
            case FIFTY:
                System.out.print("U.S. Grant");
                break;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        for(PaperCurrencyTypes s : PaperCurrencyTypes.values())
            describe(s);
    }
}
