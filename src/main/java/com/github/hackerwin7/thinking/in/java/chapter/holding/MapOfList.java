package com.github.hackerwin7.thinking.in.java.chapter.holding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/11/28
 * Time: 3:24 PM
 * Desc:
 */
public class MapOfList {
    public static Map<Person, List<? extends Pet>> petPeople = new HashMap<>();
    static {
        petPeople.put(new Person("Dawn"), Arrays.asList(new Cymric("Molly"), new Mutt("Spot")));
        petPeople.put(new Person("Kate"),
                Arrays.asList(new Cat("Shackleton"),
                        new Cat("Elsie May"), new Dog("Margrett")));
        petPeople.put(new Person("Marilyn"), Arrays.asList(
                new Pug("Louie aka louis Snorkelstein Dupree"),
                new Cat("Stanford aka Stinky el Negro"),
                new Cat("Pinkola")
        ));
        petPeople.put(new Person("Luke"),
                Arrays.asList(new Rat("Fuzzy"), new Rat("Fizzy")));
        petPeople.put(new Person("Isaac"),
                Arrays.asList(new Rat("Freckly")));
    }
    public static void main(String[] args) {
        System.out.println("People: " + petPeople.keySet());
        System.out.println("Pets: " + petPeople.values());
        for(Person person : petPeople.keySet()) {
            System.out.print(person + " has: ");
            for(Pet pet : petPeople.get(person))
                System.out.print("\t" + pet);
            System.out.println();
        }
    }
}

class Person {
    Person(String name) {
        this.name = name;
    }
    String name;

    @Override
    public String toString() {
        return name;
    }
}
