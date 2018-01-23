package com.github.hackerwin7.thinking.in.java.chapter.holding;

import java.util.PriorityQueue;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2018/01/23
 * Time: 3:50 PM
 * Desc:
 */
public class E29_PriorityQueueSubtlety {
    public static void main(String[] args) {
        PriorityQueue<Dummy> priorityQueue = new PriorityQueue<>();
        System.out.println("Adding 1st instance...");
        priorityQueue.offer(new Dummy());
        System.out.println("Adding 2nd instance...");
        priorityQueue.offer(new Dummy());
    }
}

class Dummy {}