package com.github.hackerwin7.thinking.in.java.chapter.holding;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/10/12
 * Time: 3:52 PM
 * Desc:
 */
public class E09_SequenceIterator {
    public static void main(String[] args) {
        Sequence2 sequence = new Sequence2(10);
        for(int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        for(Iterator<Object> it = sequence.iterator(); it.hasNext(); System.out.print(it.next() + " "));
    }
}

class Sequence2 {
    private Object[] items;
    private int next;
    public Sequence2(int size) { items = new Object[size]; }
    public void add(Object x) {
        if(next < items.length)
            items[next++] = x;
    }
    private class SequenceIterator implements Iterator<Object> {
        private int i;
        public boolean hasNext() { return i < items.length; }
        public Object next() {
            if(hasNext())
                return items[i++];
            throw new NoSuchElementException();
        }
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
    public Iterator<Object> iterator() {
        return new SequenceIterator();
    }
}