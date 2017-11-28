package com.github.hackerwin7.thinking.in.java.chapter.innerclasses.controller;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/07/07
 * Time: 3:23 PM
 * Desc:
 * Tips:
 */
public class Controller {
    private List<Event> eventList = new ArrayList<Event>();
    public void addEvent(Event c) { eventList.add(c); }
    public void run() {
        while (eventList.size() > 0)
            for(Event e : new ArrayList<Event>(eventList))
                if(e.ready()) {
                    System.out.println(e);
                    e.action();
                    eventList.remove(e);
                }
    }
}
