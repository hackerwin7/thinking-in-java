package com.github.hackerwin7.thinking.in.java.chapter.holding;


import com.github.hackerwin7.thinking.in.java.chapter.innerclasses.Sequence;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/07/12
 * Time: 3:09 PM
 * Desc:
 * Tips:
 */
public class E03_UnlimitedSequence {
    public static void main(String[] args) {
        UnlimitedSequence sequence = new UnlimitedSequence();
        for (int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        UnlimitedSequence.SequenceSelector selector = sequence.selector();
        while (!selector.end()) {
            System.out.println(selector.current() + " ");
            selector.next();
        }
    }
}

class UnlimitedSequence {
    private final List<Object> items = new ArrayList<Object>();
    public void add(Object x) { items.add(x); }
    public class SequenceSelector {
        private int i;
        public boolean end() { return i == items.size(); }
        public Object current() { return items.get(i);}
        public void next() { if(i < items.size()) i++; }
    }
    public SequenceSelector selector() {
        return new SequenceSelector();
    }
}