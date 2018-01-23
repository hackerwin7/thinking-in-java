package com.github.hackerwin7.thinking.in.java.chapter.holding;

import java.util.AbstractCollection;
import java.util.Iterator;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2018/01/23
 * Time: 4:25 PM
 * Desc:
 */
public class CollectionSequence extends AbstractCollection<Pet> {
    private Pet[] pets = Pets.createArray(8);
    public int size() { return pets.length; }

    @Override
    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < pets.length;
            }

            @Override
            public Pet next() { // return current index point object, and move next index pointer
                return pets[index++];
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        CollectionSequence c = new CollectionSequence();
        InterfaceVsIterator.display(c);
        InterfaceVsIterator.display(c.iterator());
    }
}
