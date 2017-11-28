package com.github.hackerwin7.thinking.in.java.chapter.holding;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/07/12
 * Time: 2:19 PM
 * Desc:
 * Tips:
 */
public class E01_Gerbil {
    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
        for (int i = 0; i < 10; i++)
            gerbils.add(new Gerbil(i));
        for (int i = 0; i < gerbils.size(); i++)
            gerbils.get(i).hop();
    }
}

class Gerbil {
    private final int gerbilNumber;
    Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }
    public String toString() {
        return "gerbil " + gerbilNumber;
    }
    public void hop() {
        System.out.println(this + " is hopping");
    }
}