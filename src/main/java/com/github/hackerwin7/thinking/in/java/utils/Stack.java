package com.github.hackerwin7.thinking.in.java.utils;

import java.util.LinkedList;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/10/13
 * Time: 3:17 PM
 * Desc:
 */
public class Stack<KI> { // not only T or E use as generic type
    private LinkedList<KI> storage = new LinkedList<>();
    public void push(KI v) { storage.addFirst(v); }
    public KI peek() { return storage.getFirst(); }
    public KI pop() { return storage.removeFirst(); }
    public boolean empty() { return storage.isEmpty(); }
    public String toString() { return storage.toString(); }
}
