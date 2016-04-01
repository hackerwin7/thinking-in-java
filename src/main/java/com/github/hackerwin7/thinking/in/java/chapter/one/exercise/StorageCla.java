package com.github.hackerwin7.thinking.in.java.chapter.one.exercise;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/04/01
 * Time: 3:21 PM
 * Desc:
 */
public class StorageCla {
    public static void main(String[] args) {
        String text = "kky extension.";
        StorageCla sc = new StorageCla();
        int n = sc.storage(text);
        System.out.println(n);
    }

    public int storage(String s) {
        return s.length() * 2;
    }
}
