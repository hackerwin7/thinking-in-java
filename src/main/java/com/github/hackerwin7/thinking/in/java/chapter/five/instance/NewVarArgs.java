package com.github.hackerwin7.thinking.in.java.chapter.five.instance;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/11/21
 * Time: 3:00 PM
 * Desc:
 * Tips:
 */
public class NewVarArgs {
    static void printArray(Object... args) {
        for(Object obj : args)
            System.out.print(obj + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(new Integer(47), new Float(3.14), new Double(11.11));
        printArray(47, 3.14F, 11.11);
        printArray("one", "two", "three");
        printArray(new A(), new A(), new A());
        printArray((Object[]) new Integer[]{1, 2, 3, 4});
        printArray();
    }
}
