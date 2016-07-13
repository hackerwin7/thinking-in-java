package com.github.hackerwin7.thinking.in.java.chapter.three.instance;

import static com.github.hackerwin7.thinking.in.java.chapter.three.instance.Assignment.*;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/06/14
 * Time: 2:34 PM
 * Desc:
 * Tips:
 */
public class AutoInc {
    public static void main(String[] args) throws Exception {
        int i = 1;
        print("i = " + i);
        print("++i = " + ++i);
        print("i++ = " + i++);
        print("i = " + i);
        print("--i = " + --i);
        print("i-- = " + i--);
        print("i = " + i);
        print("++i + i++ = " + (++i + i++));
    }
}
