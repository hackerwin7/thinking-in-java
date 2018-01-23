package com.github.hackerwin7.thinking.in.java.chapter.holding;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/12/08
 * Time: 4:30 PM
 * Desc:
 */
public class E27_CommandQueue {
    public static void main(String[] args) {
        Queue<Command> cmds = new LinkedList<>();
        Producer.produce(cmds);
        Consumer.consume(cmds);
    }
}

class Command {
    private final String cmd;
    Command(String cmd) { this.cmd = cmd; }
    public void operation() { System.out.println(cmd); }
}

class Producer {
    public static void produce(Queue<Command> q) {
        q.offer(new Command("load"));
        q.offer(new Command("delete"));
        q.offer(new Command("save"));
        q.offer(new Command("exit"));
    }
}

class Consumer {
    public static void consume(Queue<Command> q) {
        while (q.peek() != null)
            q.remove().operation();
    }
}