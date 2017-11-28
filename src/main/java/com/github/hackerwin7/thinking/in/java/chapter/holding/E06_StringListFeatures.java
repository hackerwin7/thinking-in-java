package com.github.hackerwin7.thinking.in.java.chapter.holding;

import static com.github.hackerwin7.thinking.in.java.utils.Print.*;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/10/12
 * Time: 2:43 PM
 * Desc:
 */
public class E06_StringListFeatures {
    static Random random = new Random(47);
    public static void main(String[] args) {
        List<String> strs = new ArrayList<>(
                Arrays.asList("A", "B", "C", "D", "E", "F", "G")
        );
        print("1: " + strs);
        strs.add("H");
        print("2: " + strs);
        print("3: " + strs.contains("H"));
        strs.remove("H");
        String s1 = strs.get(2);
        print("4: " + s1 + " " + strs.indexOf(s1));
        String s2 = "A";
        print("5: " + strs.indexOf(s2));
        print("6: " + strs.remove(s2));
        print("7: " + strs.remove(s1));
        print("8: " + strs);
        strs.add(3, "0");
        print("9: " + strs);
        List<String> sub = strs.subList(1, 4);
        print("subList: " + sub);
        print("10: " + strs.containsAll(sub));
        Collections.sort(sub);
        print("sorted subList: " + sub);
        print("11: " + strs.containsAll(sub));
        Collections.shuffle(sub, random);
        print("shuffled subList: " + sub);
        print("12: " + strs.containsAll(sub));
        List<String> copy = new ArrayList<>(strs);
        sub = Arrays.asList(strs.get(1), strs.get(4));
        print("sub: " + copy);
        copy.retainAll(sub);
        print("13: " + copy);
        copy = new ArrayList<>(strs);
        copy.remove(2);
        print("14: " + copy);
        copy.removeAll(sub);
        print("15: " + copy);
        copy.set(1, "I");
        print("16: " + copy);
        copy.addAll(2, sub);
        print("17: " + copy);
        print("18: " + strs.isEmpty());
        strs.clear();
        print("19: " + strs);
        print("20: " + strs.isEmpty());
        strs.addAll(Arrays.asList("A", "B", "C", "D"));
        print("21: " + strs);
        Object[] o = strs.toArray();
        print("22: " + o[3]);
        String[] sa = strs.toArray(new String[0]);
        print("23: " + sa[3]);
    }
}
