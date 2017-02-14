package com.github.hackerwin7.thinking.in.java.chapter.access.exercise.access.connection;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/14
 * Time: 11:11 AM
 * Desc:
 * Tips:
 */
public class ConnectionManager {
    private static Connection[] pool = new Connection[10];
    private static int counter = 0;
    static {
        for(int i = 0; i < pool.length; i++)
            pool[i] = new Connection();
    }

    public static Connection getConnection() {
        if(counter < pool.length)
            return pool[counter++];
        return null;
    }
}
