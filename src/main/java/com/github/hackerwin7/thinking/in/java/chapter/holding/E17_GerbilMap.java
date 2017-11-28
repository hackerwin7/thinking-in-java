package com.github.hackerwin7.thinking.in.java.chapter.holding;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/11/28
 * Time: 3:43 PM
 * Desc:
 */
public class E17_GerbilMap {
    public static void main(String[] args) {
        Map<String, Gerbil> map = new HashMap<>();
        map.put("Fuzzy", new Gerbil(1));
        map.put("Spot", new Gerbil(2));
        map.put("Joe", new Gerbil(3));
        map.put("Ted", new Gerbil(4));
        map.put("Heather", new Gerbil(5));
        Iterator<Map.Entry<String, Gerbil>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Gerbil> entry = it.next();
            System.out.println(entry.getKey() + ": ");
            entry.getValue().hop();
        }
    }
}
