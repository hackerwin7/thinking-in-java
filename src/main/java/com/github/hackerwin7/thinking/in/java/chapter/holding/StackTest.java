package com.github.hackerwin7.thinking.in.java.chapter.holding;

import com.github.hackerwin7.thinking.in.java.utils.Stack;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/10/13
 * Time: 3:21 PM
 * Desc:
 */
public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        for(String s : "My dog has fleas".split(" "))
            stack.push(s);
        while (!stack.empty())
            System.out.print(stack.pop() + " ");
    }
}
