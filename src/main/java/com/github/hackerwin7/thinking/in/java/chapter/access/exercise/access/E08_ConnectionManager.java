package com.github.hackerwin7.thinking.in.java.chapter.access.exercise.access;

import com.github.hackerwin7.thinking.in.java.chapter.access.exercise.access.connection.Connection;
import com.github.hackerwin7.thinking.in.java.chapter.access.exercise.access.connection.ConnectionManager;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/14
 * Time: 11:08 AM
 * Desc:
 * Tips:
 */
public class E08_ConnectionManager {
    public static void main(String[] args) {
        //! Connection c = new Connection();
        Connection c = ConnectionManager.getConnection();
        while (c != null) {
            System.out.println(c);
            c.doSomething();
            c = ConnectionManager.getConnection();
        }
    }
}
