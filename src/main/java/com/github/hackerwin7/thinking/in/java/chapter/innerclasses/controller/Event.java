package com.github.hackerwin7.thinking.in.java.chapter.innerclasses.controller;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/07/07
 * Time: 3:10 PM
 * Desc:
 * Tips:
 */
public abstract class Event {
    private long eventTime;
    protected final long delayTime;
    public Event(long delayTime) {
        this.delayTime = delayTime;
        start();
    }
    public void start() {
        eventTime = System.nanoTime() + delayTime;
    }
    public boolean ready() {
        return System.nanoTime() >= eventTime;
    }
    public abstract void action();
}
