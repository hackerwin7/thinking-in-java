package com.github.hackerwin7.thinking.in.java.chapter.holding;

import net.mindview.util.Countries;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/11/28
 * Time: 3:50 PM
 * Desc:
 */
public class E18_MapOrder {
    public static void main(String[] args) {
        Map<String, String> m1 = new HashMap<>(Countries.capitals(25));
        System.out.println(m1);
        String[] keys = m1.keySet().toArray(new String[0]); // new String[0] is specific type here.
        Arrays.sort(keys);
        Map<String, String> m2 = new LinkedHashMap<>();
        for (String key : keys)
            m2.put(key, m1.get(key));
        System.out.println(m2);
    }
}
