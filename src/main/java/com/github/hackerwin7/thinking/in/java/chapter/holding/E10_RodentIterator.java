package com.github.hackerwin7.thinking.in.java.chapter.holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import static com.github.hackerwin7.thinking.in.java.utils.Print.*;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/10/12
 * Time: 4:02 PM
 * Desc:
 */
public class E10_RodentIterator {
    static class Rodent {
        public void hop() { print("Rodent hopping"); }
        public void scurry() { print("Rodent scurrying"); }
        public void reproduce() { print("Making more Rodents"); }
        public String toString() { return "Rodent"; }
    }

    static class Mouse extends Rodent {
        public void hop() { print("Mouse hopping"); }
        public void scurry() { print("Mouse scurrying"); }
        public void reproduce() { print("Making more Mice"); }
        public String toString() { return "Mouse"; }
    }

    static class Hamster extends Rodent {
        public void hop() { print("Hamster hopping"); }
        public void scurry() { print("Hamster scurrying"); }
        public void reproduce() { print("Making more Hamster"); }
        public String toString() { return "Hamster"; }
    }

    public static void main(String[] args) {
        ArrayList<Rodent> rodents = new ArrayList<>(
                Arrays.asList(new Rodent(), new Mouse(), new Hamster())
        );
        Rodent r;
        for(Iterator<Rodent> it = rodents.iterator(); it.hasNext(); ) {
            r = it.next();
            r.hop();
            r.scurry();
            r.reproduce();
            print(r);
        }
    }
}