package com.github.hackerwin7.thinking.in.java.chapter.access.exercise.access;

import com.github.hackerwin7.thinking.in.java.chapter.access.exercise.access.connection2.Connection;
import com.github.hackerwin7.thinking.in.java.chapter.access.exercise.access.connection2.ConnectionManager;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/14
 * Time: 11:25 AM
 * Desc:
 * Tips:
 */
public class E08_ConnectionManager2 {
    public static void main(String[] args) {
        Connection[] ca = new Connection[10];
        for(int i = 0; i < 10; i++)
            ca[i] = ConnectionManager.getConnection();
        System.out.println(ConnectionManager.getConnection());
        for(int i = 0; i < 5; i++) {
            ca[i].checkIn();
            Connection c = ConnectionManager.getConnection();
            System.out.println(c);
            c.doSomething();
            c.checkIn();
        }
    }
}
