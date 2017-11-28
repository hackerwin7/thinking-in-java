package com.github.hackerwin7.thinking.in.java.chapter.holding;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/10/13
 * Time: 3:24 PM
 * Desc:
 */
public class StackCollision {
    public static void main(String[] args) {
        com.github.hackerwin7.thinking.in.java.utils.Stack<String> stack =
                new com.github.hackerwin7.thinking.in.java.utils.Stack<>();
        for(String s : "My dog has fleas".split(" "))
            stack.push(s);
        while (!stack.empty())
            System.out.print(stack.pop() + " ");
        System.out.println();
        java.util.Stack<String> stack1 = new java.util.Stack<>();
        for(String s : "My dog has fleas".split(" "))
            stack1.push(s);
        while (!stack1.empty())
            System.out.print(stack1.pop() + " ");
    }
}
