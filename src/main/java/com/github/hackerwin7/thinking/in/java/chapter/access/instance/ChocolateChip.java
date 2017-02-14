package com.github.hackerwin7.thinking.in.java.chapter.access.instance;

import com.github.hackerwin7.thinking.in.java.chapter.access.instance.dessert.Cookie;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/13
 * Time: 3:05 PM
 * Desc:
 * Tips:
 */
public class ChocolateChip extends Cookie {
    public ChocolateChip() {
        System.out.println("ChocolateChip constructor");
    }

    public void chomp() {
        //! bite();
    }

    public static void main(String[] args) {
        ChocolateChip x = new ChocolateChip();
        x.chomp();
    }
}
