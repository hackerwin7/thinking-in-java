package com.github.hackerwin7.thinking.in.java.chapter.holding;

import static com.github.hackerwin7.thinking.in.java.utils.Print.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/10/13
 * Time: 4:37 PM
 * Desc:
 */
public class SetOperations {
    public static void main(String[] args) {
//        t1();
        Set<String> set1 = new HashSet<>();
        Collections.addAll(set1, "A B C D E F G H I J K L".split(" "));
        set1.add("M");
        print("H: " + set1.contains("H"));
        print("N: " + set1.contains("N"));
        Set<String> set2 = new HashSet<>();
        Collections.addAll(set2, "H I J K L".split(" "));
        print("set2 in set1: " + set1.containsAll(set2));
        print("- set2 in set1: " + set1.contains(set2));
        set1.remove("H");
        print("set1: " + set1);
        print("set2 in set1: " + set1.containsAll(set2));
        print("- set2 in set1: " + set1.contains(set2));
        set1.removeAll(set2);
        print("set2 removed from set1: " + set1);
        Collections.addAll(set1, "X Y Z".split(" "));
        print("X Y Z added to set1: " + set1);
    }

    public static void t1() {
        System.out.println(Arrays.toString("H J    K   L".split(" ")));
    }
}
