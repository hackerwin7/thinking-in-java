package com.github.hackerwin7.thinking.in.java.chapter.two.instance;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/04/01
 * Time: 10:37 AM
 * Desc: chapter instance from theory
 */
public class ChapterInstance {
    public static void main(String[] args) {
        showPropertiesRun();
    }

    private static void helloDateRun() {
        System.out.println("Hello, it's: ");
        System.out.println(new Date());
    }

    private static void showPropertiesRun() {
        System.getProperties().list(System.out);
        System.out.println("---------------------------------------------------------------");
        System.out.println(System.getProperty("user.name"));
        System.out.println("---------------------------------------------------------------");
        System.out.println(System.getProperty("java.library.path"));
    }
}
