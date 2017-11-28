package com.github.hackerwin7.thinking.in.java.chapter.innerclasses;
import static com.github.hackerwin7.thinking.in.java.utils.Print.*;
/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/07/11
 * Time: 4:50 PM
 * Desc:
 * Tips:
 */
public class LocalInnerClass {
    private int count = 0;
    Counter getCounter(final String name) {
        class LocalCounter implements Counter {
            public LocalCounter() {
                print("LocalCounter()");
            }
            public int next() {
                print(name);
                return count++;
            }
        }
        return new LocalCounter();
    }
    Counter getCounter2(final String name) {
        return new Counter() {
            {
                print("Counter()");
            }
            public int next() {
                print(name);
                return count++;
            }
        };
    }
    public static void main(String[] args) {
        LocalInnerClass lic = new LocalInnerClass();
        Counter
                c1 = lic.getCounter("Local inner"),
                c2 = lic.getCounter2("Anonymous inner");
        for (int i = 0; i < 5; i++)
            print(c1.next());
        for (int i = 0; i < 5; i++)
            print(c2.next());
    }
}

interface Counter {
    int next();
}