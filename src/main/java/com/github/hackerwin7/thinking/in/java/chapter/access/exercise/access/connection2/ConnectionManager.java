package com.github.hackerwin7.thinking.in.java.chapter.access.exercise.access.connection2;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/14
 * Time: 11:27 AM
 * Desc:
 * Tips:
 */
public class ConnectionManager {
    private static Connection[] pool = new Connection[10];
    static {
        for(int i = 0; i < pool.length; i++)
            pool[i] = new Connection();
    }
    public static Connection getConnection() {
        for(int i = 0; i < pool.length; i++)
            if(pool[i] != null) {
                Connection c = pool[i];
                pool[i] = null;
                return c;
            }
        return null;
    }
    public static void checkIn(Connection c) {
        for(int i = 0; i < pool.length; i++)
            if(pool[i] == null) {
                pool[i] = c;
                return;
            }
    }
}
