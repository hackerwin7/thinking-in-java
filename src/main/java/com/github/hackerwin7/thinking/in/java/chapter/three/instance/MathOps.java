package com.github.hackerwin7.thinking.in.java.chapter.three.instance;

import static com.github.hackerwin7.thinking.in.java.chapter.three.instance.Assignment.*;

import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/06/14
 * Time: 11:55 AM
 * Desc:
 * Tips:
 */
public class MathOps {
    public static void main(String[] args) throws Exception {
        Random rand = new Random(47);
        int i, j, k;
        j = rand.nextInt(100) + 1;
        print("j: " + j);
        k = rand.nextInt(100) + 1;
        print("k: " + k);
        i = j + k;
        print(j + " + " + k + " = " + i);
        i = j - k;
        print(j + " - " + k + " = " + i);
        i = k / j;
        print(j + " / " + k + " = " + i);
        i = k * j;
        print(j + " * " + k + " = " + i);
        i = k % j;
        print(j + " % " + k + " = " + i);
        j %= k;
        print(j + " %= " + k + " = " + j);
        float u, v, w;
        v = rand.nextFloat();
        print("v = " + v);
        w = rand.nextFloat();
        print("w = " + w);
        u = v + w;
        print(v + " + " + w + " = " + u);
        u = v - w;
        print(v + " - " + w + " = " + u);
        u = v / w;
        print(v + " / " + w + " = " + u);
        u = v * w;
        print(v + " * " + w + " = " + u);
    }
}
