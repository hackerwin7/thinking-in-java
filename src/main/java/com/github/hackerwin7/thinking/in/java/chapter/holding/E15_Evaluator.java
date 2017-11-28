package com.github.hackerwin7.thinking.in.java.chapter.holding;

import com.github.hackerwin7.thinking.in.java.utils.Stack;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/10/13
 * Time: 4:08 PM
 * Desc:
 */
public class E15_Evaluator {
    private final static Stack<Character> stack = new Stack<>();
    private static void evaluate(String expr) {
        char data[] = expr.toCharArray();
        for(int i = 0; i < data.length;)
            switch (data[i++]) {
                case '+': stack.push(data[i++]);
                break;
                case '-': System.out.print(stack.pop());
            }
    }
    public static void main(String[] args) {
        evaluate("+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---");
    }
}
