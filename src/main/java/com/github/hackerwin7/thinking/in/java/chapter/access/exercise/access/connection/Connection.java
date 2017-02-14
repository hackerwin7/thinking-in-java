package com.github.hackerwin7.thinking.in.java.chapter.access.exercise.access.connection;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/14
 * Time: 11:09 AM
 * Desc:
 * Tips:
 */
public class Connection {
    private static int counter = 0;
    private int id = counter++;
    Connection() {}

    @Override
    public String toString() {
        return "Connection " + id;
    }

    public void doSomething() {}
}
