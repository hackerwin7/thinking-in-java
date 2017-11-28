package com.github.hackerwin7.thinking.in.java.chapter.holding;
import static com.github.hackerwin7.thinking.in.java.utils.Print.*;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/07/20
 * Time: 5:44 PM
 * Desc:
 * Tips:
 */
public class E04_MovieNameGenerator {
    private static final MovieNameGenerator mng = new MovieNameGenerator();
    static String[] fill(String[] array) {
        for (int i = 0; i < array.length; i++)
            array[i] = mng.next();
        return array;
    }
    static Collection<String> fill(Collection<String> collection) {
        for (int i = 0; i < 5; i++)
            collection.add(mng.next());
        return collection; // value passing not reference passing
    }
    public static void main(String[] args) {
        print(Arrays.toString(fill(new String[5])));
        print(fill(new ArrayList<String>()));
        print(fill(new LinkedList<String>()));
        print(fill(new HashSet<String>()));
        print(fill(new LinkedHashSet<String>()));
        print(fill(new TreeSet<String>()));
    }
}

class MovieNameGenerator {
    String[] characters = {
            "Grumpy", "Happy", "Sleepy", "Dopey", "Doc", "Sneezy",
            "Bashful", "Snow White", "Witch Queen", "Prince"
    };
    int next;
    public String next() {
        String r = characters[next];
        next = (next + 1) % characters.length;
        return r;
    }
}