package com.github.hackerwin7.thinking.in.java.chapter.three.instance;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/06/14
 * Time: 11:44 AM
 * Desc:
 * Tips:
 */
public class Assignment {
    public static void main(String[] args) throws Exception {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 9;
        t2.level = 47;
        print("1: t1.level: " + t1.level + ", t2.level: " + t2.level);
        t1 = t2;
        print("2: t1.level: " + t1.level + ", t2.level: " + t2.level);
        t1.level = 27;
        print("3: t1.level: " + t1.level + ", t2.level: " + t2.level);
    }

    public static void print(String s) {
        System.out.println(s);
    }
}

class Tank {
    int level;
}
