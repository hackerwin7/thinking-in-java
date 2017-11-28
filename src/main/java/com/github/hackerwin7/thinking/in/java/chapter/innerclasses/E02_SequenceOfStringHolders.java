package com.github.hackerwin7.thinking.in.java.chapter.innerclasses;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/06/23
 * Time: 2:41 PM
 * Desc:
 * Tips:
 */
public class E02_SequenceOfStringHolders {
    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for(int i = 0; i < 10; i++)
            sequence.add(new StringHolder(Integer.toString(i)));
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}

class StringHolder {
    private String data;
    StringHolder(String data) { this.data = data; }
    public String toString() { return data; }
}