package com.github.hackerwin7.thinking.in.java.chapter.holding;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/12/08
 * Time: 2:59 PM
 * Desc:
 */
public class E23_MoreProbable {
    private static Random rand = new Random(47);
    public static void main(String[] args) {
        Map<Integer, Counter> m = new HashMap<>();
        for(int i = 0; i < 10000000; i++) {
            int r = rand.nextInt(100);
            if(m.containsKey(r))
                m.get(r).i++;
            else
                m.put(r, new Counter());
        }
        List<HistoUnit> lst = new ArrayList<>();
        Iterator<Map.Entry<Integer, Counter>> it = m.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, Counter> entry = it.next();
            lst.add(new HistoUnit(entry.getValue(), entry.getKey()));
        }
        Collections.sort(lst);
        System.out.println("lst = " + lst);
    }
}

class Counter {
    int i = 1;
    public String toString() { return Integer.toString(i); }
}

class HistoUnit implements Comparable<HistoUnit> {
    Counter counter;
    Integer val;
    public HistoUnit(Counter counter, Integer val) {
        this.counter = counter;
        this.val = val;
    }
    public int compareTo(HistoUnit o) {
        int lv = o.counter.i;
        int rv = counter.i;
        return Integer.compare(lv, rv); // return (lv < rv ? -1 : (lv == rv ? 0 : 1));
    }
    public String toString() {
        return "Value = " + val + ", Occurrences = " + counter.i + "\n";
    }
}