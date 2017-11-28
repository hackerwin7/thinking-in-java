package com.github.hackerwin7.thinking.in.java.chapter.holding;

import java.util.Iterator;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/10/12
 * Time: 3:22 PM
 * Desc:
 */
public class SimpleIteration {
    public static void main(String[] args) {
        List<Pet> pets = Pets.arrayList(12);
        Iterator<Pet> it = pets.iterator();
        while (it.hasNext()) {
            Pet p = it.next();
            System.out.print(p.id() + ":" + p + " ");
        }
        System.out.println();
        for(Pet p : pets)
            System.out.print(p.id() + ":" + p + " ");
        System.out.println();
        it = pets.iterator();
        for(int i = 0; i < 6; i++) {
            it.next();
            it.remove();
        }
        System.out.println(pets);
    }
}
