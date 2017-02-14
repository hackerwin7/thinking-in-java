package com.github.hackerwin7.thinking.in.java.chapter.initandclean.instance;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/11/18
 * Time: 11:00 AM
 * Desc:
 * Tips:
 */
public class Book {
    boolean checkedOut = false;
    Book(boolean checkOut) {
        checkedOut = checkOut;
    }
    void checkIn() {
        checkedOut = false;
    }
    protected void finalize() {
        if(checkedOut)
            System.out.println("Error: checked out");
    }
    public static void main(String[] args) {
        Book novel = new Book(true);
        novel.checkIn();
        new Book(true); // not check in, it will be error when gc
        System.gc();
    }
}
