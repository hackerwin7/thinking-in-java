package com.github.hackerwin7.thinking.in.java.chapter.interfaces.interfaceprocessor;

import static com.github.hackerwin7.thinking.in.java.utils.Print.*;
/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/03/01
 * Time: 6:36 PM
 * Desc:
 * Tips:
 */
public class Apply {
    public static void process(Processor p, Object s) {
        print("Using Processor " + p.name());
        print(p.process(s));
    }
}
