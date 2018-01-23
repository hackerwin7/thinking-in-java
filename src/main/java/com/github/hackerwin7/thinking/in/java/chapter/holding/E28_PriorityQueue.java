package com.github.hackerwin7.thinking.in.java.chapter.holding;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2018/01/23
 * Time: 3:35 PM
 * Desc:
 */
public class E28_PriorityQueue {
    static Random rand = new Random(47);
    public static void printQ(Queue<?> queue) {
        for(Object data = queue.poll(); data != null;
                data = queue.poll())
            System.out.print(data + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        PriorityQueue<Double> priorityQueue = new PriorityQueue<>();
        for(int i = 0; i < 10; i++)
            priorityQueue.offer(rand.nextDouble());
        printQ(priorityQueue);
    }
}
