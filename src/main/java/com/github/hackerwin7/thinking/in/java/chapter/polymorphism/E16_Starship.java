package com.github.hackerwin7.thinking.in.java.chapter.polymorphism;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/21
 * Time: 8:40 PM
 * Desc:
 * Tips:
 */
public class E16_Starship {
    public static void main(String[] args) {
        Starship eprise = new Starship();
        System.out.println(eprise);
        eprise.setStatus(new YellowAlertStatus());
        System.out.println(eprise);
        eprise.setStatus(new RedAlertStatus());
        System.out.println(eprise);
    }
}

class AlertStatus {
    public String getStatus() { return "None"; }
}

class RedAlertStatus extends AlertStatus {
    public String getStatus() { return "Red"; }
}

class YellowAlertStatus extends AlertStatus {
    public String getStatus() { return "Yellow"; }
}

class GreenAlertStatus extends AlertStatus {
    public String getStatus() { return "Green"; }
}

class Starship {
    private AlertStatus status = new GreenAlertStatus();
    public void setStatus(AlertStatus istatus) {
        status = istatus;
    }
    public String toString() { return status.getStatus(); }
}