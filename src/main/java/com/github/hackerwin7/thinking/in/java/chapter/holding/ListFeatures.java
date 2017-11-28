package com.github.hackerwin7.thinking.in.java.chapter.holding;
import static com.github.hackerwin7.thinking.in.java.utils.Print.*;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/07/21
 * Time: 10:50 AM
 * Desc:
 * Tips:
 */
public class ListFeatures {
    public static void main(String[] args) {
        Random rand = new Random(47);
        List<Pet> pets = Pets.arrayList(7);
        print("1: " + pets);
        Hamster h = new Hamster();
        pets.add(h);
        print("2: " + pets);
        print("3: " + pets.contains(h));
        pets.remove(h);
        Pet p = pets.get(2);
        print("4: " + p + " " + pets.indexOf(p));
        Pet cymric = new Cymric();
        print("5: " + pets.indexOf(cymric));
        print("6: " + pets.remove(cymric));
        print("7: " + pets.remove(p));
        print("8: " + pets);
        pets.add(3, new Mouse());
        print("9: " + pets);
        List<Pet> sub = pets.subList(1, 4);
        print("subList: " + sub);
        print("10: " + pets.containsAll(sub));
        Collections.sort(sub);
        print("sorted subList: " + sub);
        print("pets: " + pets);
        print("11: " + pets.containsAll(sub));
        Collections.shuffle(sub, rand);
        print("shuffled subList: " + sub);
        print("pets: " + pets);
        print("12: " + pets.containsAll(sub));
        List<Pet> copy = new ArrayList<Pet>(pets);
        sub = Arrays.asList(pets.get(1), pets.get(4));
        print("sub: " + sub);
        copy.retainAll(sub);
        print("13 pre pets: " + pets);
        print("13: " + copy);
        copy = new ArrayList<Pet>(pets);
        copy.remove(2);
        print("14: " + copy);
        copy.removeAll(sub);
        print("15: " + copy);
        copy.set(1, new Mouse());
        print("16: " + copy);
        copy.addAll(2, sub);
        print("17: " + copy);
        print("18: " + pets.isEmpty());
        pets.clear();
        print("19: " + pets);
        print("20: " + pets.isEmpty());
        pets.addAll(Pets.arrayList(4));
        print("21: " + pets);
        Object[] o = pets.toArray();
        print("22: " + o[3]);
        Pet[] pa = pets.toArray(new Pet[0]);
        print("23: " + pa[3].id());
    }
}

class Individual implements Comparable<Individual> {
    private static long counter = 0;
    private final long id = counter++;
    private String name;
    public Individual(String name) { this.name = name; }
    public Individual() {}
    public String toString() {
        return getClass().getSimpleName() + (name == null ? "" : " " + name);
    }
    public long id() { return id; }
    public boolean equals(Object o) {
        return o instanceof Individual && id == ((Individual)o).id;
    }
    public int hashCode() {
        int result = 17;
        if(name != null)
            result = 37 * result + name.hashCode();
        result = 37 * result + (int) id;
        return result;
    }
    public int compareTo(Individual arg) {
        String first = getClass().getSimpleName();
        String argFirst = arg.getClass().getSimpleName();
        int firstCompare = first.compareTo(argFirst);
        if(firstCompare != 0)
            return firstCompare;
        if(name != null && arg.name != null) {
            int secondCompare = name.compareTo(arg.name);
            if(secondCompare != 0)
                return secondCompare;
        }
        return (arg.id < id ? -1 : (arg.id == id ? 0 : 1));
    }
}

class Pet extends Individual {
    public Pet(String name) { super(name); }
    public Pet() { super(); }
}

class Dog extends Pet {
    public Dog(String name) { super(name); }
    public Dog() { super(); }
}

class Mutt extends Dog {
    public Mutt(String name) { super(name); }
    public Mutt() { super(); }
}

class Pug extends Dog {
    public Pug(String name) { super(name); }
    public Pug() { super(); }
}

class Cat extends Pet {
    public Cat(String name) { super(name); }
    public Cat() { super(); }
}

class EgyptianMau extends Cat {
    public EgyptianMau(String name) { super(name); }
    public EgyptianMau() { super(); }
}

class Manx extends Cat {
    public Manx(String name) { super(name); }
    public Manx() { super(); }
}

class Cymric extends Manx {
    public Cymric(String name) { super(name); }
    public Cymric() { super(); }
}

class Rodent extends Pet {
    public Rodent(String name) { super(name); }
    public Rodent() { super(); }
}

class Rat extends Rodent {
    public Rat(String name) { super(name); }
    public Rat() { super(); }
}

class Mouse extends Rodent {
    public Mouse(String name) { super(name); }
    public Mouse() { super(); }
}

class Hamster extends Rodent {
    public Hamster(String name) { super(name); }
    public Hamster() { super(); }
}

abstract class PetCreator {
    private Random rand = new Random(47);
    public abstract List<Class<? extends Pet>> types();
    public Pet randomPet() {
        int n = rand.nextInt(types().size());
        try {
            return types().get(n).newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
    public Pet[] createArray(int size) {
        Pet[] result = new Pet[size];
        for(int i = 0; i < size; i++)
            result[i] = randomPet();
        return result;
    }
    public ArrayList<Pet> arrayList(int size) {
        ArrayList<Pet> result = new ArrayList<Pet>();
        Collections.addAll(result, createArray(size));
        return result;
    }
}

class LiteralPetCreator extends PetCreator {
    public static final List<Class<? extends Pet>> allTypes = Collections.unmodifiableList(Arrays.asList(
            Pet.class, Dog.class, Cat.class, Rodent.class,
            Mutt.class, Pug.class, EgyptianMau.class, Manx.class,
            Cymric.class, Rat.class, Mouse.class, Hamster.class
    ));
    private static final List<Class<? extends Pet>> types = allTypes.subList(allTypes.indexOf(Mutt.class), allTypes.size());
    public List<Class<? extends Pet>> types() {
        return types;
    }
    public static void main(String[] args) {
        System.out.println(types);
    }
}

class Pets {
    public static final PetCreator creator = new LiteralPetCreator();
    public static Pet randomPet() {
        return creator.randomPet();
    }
    public static Pet[] createArray(int size) {
        return creator.createArray(size);
    }
    public static ArrayList<Pet> arrayList(int size) {
        return creator.arrayList(size);
    }
}