package com.github.hackerwin7.thinking.in.java.chapter.holding;
import static com.github.hackerwin7.thinking.in.java.utils.Print.*;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/07/20
 * Time: 4:07 PM
 * Desc:
 * Tips:
 */
public class PrintingContainers {
    static Collection fill(Collection<String> collection) {
        collection.add("rat");
        collection.add("cat");
        collection.add("dog");
        collection.add("dog");
        return collection;
    }

    static Map fill(Map<String, String> map) {
        map.put("rat", "Fuzzy");
        map.put("cat", "Rags");
        map.put("dog", "Bosco");
        map.put("dog", "Spot");
        return map;
    }

    public static void main(String[] args) {
        print(fill(new ArrayList<String>()));
        print(fill(new LinkedList<String>()));
        print(fill(new HashSet<String>()));
        print(fill(new TreeSet<String>()));
        print(fill(new LinkedHashSet<String>()));
        print(fill(new HashMap<String, String>()));
        print(fill(new TreeMap<String, String>()));
        print(fill(new LinkedHashMap<String, String>()));
    }
}
