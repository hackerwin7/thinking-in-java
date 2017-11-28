package com.github.hackerwin7.thinking.in.java.chapter.holding;

import java.util.List;
import java.util.ListIterator;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/10/12
 * Time: 4:26 PM
 * Desc:
 */
public class ListIteration {
    public static void main(String[] args) {
        List<Pet> pets = Pets.arrayList(8);
        System.out.println(pets);
        ListIterator<Pet> it = pets.listIterator();
        while (it.hasNext())
            System.out.print(it.next() + ", " + it.nextIndex() + ", " + it.previousIndex() + "; ");
        System.out.println();
        while (it.hasPrevious())
            System.out.print(it.previous().id() + " ");
        System.out.println();
        System.out.println(pets);
        it = pets.listIterator(3);
        while (it.hasNext()) {
            it.next();
            it.set(Pets.randomPet());
        }
        System.out.println(pets);
    }
}
