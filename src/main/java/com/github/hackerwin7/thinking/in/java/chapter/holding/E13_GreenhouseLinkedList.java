package com.github.hackerwin7.thinking.in.java.chapter.holding;

import com.github.hackerwin7.thinking.in.java.chapter.innerclasses.controller.Event;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/10/13
 * Time: 10:57 AM
 * Desc:
 */
public class E13_GreenhouseLinkedList {
    public static void main(String[] args) {
        GreenhouseControls gc = new GreenhouseControls();
        gc.addEvent(gc.new Bell(900));
        Event[] eventList = {
                gc.new ThermostatNight(0),
                gc.new LightOn(200),
                gc.new LightOff(400),
                gc.new WaterOn(600),
                gc.new WaterOff(800),
                gc.new ThermostatDay(1400)
        };
        gc.addEvent(gc.new Restart(2000, eventList));
        if(args.length == 1)
            gc.addEvent(new GreenhouseControls.Terminate(new Integer(args[0])));
        else
            gc.addEvent(new GreenhouseControls.Terminate(1000));
        gc.run();
    }
}

class Controller {
    private List<Event> events = new LinkedList<>();
    public void addEvent(Event e) { events.add(e); }
    public void run() {
        while (events.size() > 0) {
            Iterator<Event> it = new LinkedList<>(events).iterator();
            while (it.hasNext()) {
                Event e = it.next();
                if(e.ready()) {
                    System.out.println(e);
                    e.action();
                    it.remove();
                }
            }
        }
    }
}

class GreenhouseControls extends Controller {
    private boolean light = false;
    public class LightOn extends Event {
        public LightOn(long delayTime) { super(delayTime); }
        public void action() { light = true; }
        public String toString() { return "Light is on"; }
    }
    public class LightOff extends Event {
        public LightOff(long delayTime) { super(delayTime); }
        public void action() { light = false; }
        public String toString() { return "Light is off"; }
    }
    private boolean water = false;
    public class WaterOn extends Event {
        public WaterOn(long delayTime) { super(delayTime); }
        public void action() { water = true; }
        public String toString() {
            return "Greenhouse water is on";
        }
    }
    public class WaterOff extends Event {
        public WaterOff(long delayTime) { super(delayTime); }
        public void action() { water = false; }
        public String toString() {
            return "Greenhouse water is off";
        }
    }
    private String thermostat = "Day";
    public class ThermostatNight extends Event {
        public ThermostatNight(long delayTime) {
            super(delayTime);
        }
        public void action() { thermostat = "Night"; }
        public String toString() {
            return "Thermostat on night setting";
        }
    }
    public class ThermostatDay extends Event {
        public ThermostatDay(long delayTime) {
            super(delayTime);
        }
        public void action() { thermostat = "Day"; }
        public String toString() {
            return "Thermostat on day setting";
        }
    }
    public class Bell extends Event {
        public Bell(long delayTime) { super(delayTime); }
        public void action() {
            addEvent(new Bell(delayTime));
        }
        public String toString() {
            return "Bing";
        }
    }
    public class Restart extends Event {
        private Event[] events;
        public Restart(long delayTime, Event[] events) {
            super(delayTime);
            this.events = events;
            for(Event e : events)
                addEvent(e);
        }
        public void action() {
            for (Event e : events) {
                e.start();
                addEvent(e);
            }
            start();
            addEvent(this);
        }
        public String toString() {
            return "Restarting system";
        }
    }
    public static class Terminate extends Event {
        public Terminate(long delayTime) { super(delayTime); }
        public void action() { System.exit(0); }
        public String toString() { return "Terminating"; }
    }
}