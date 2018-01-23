package com.github.hackerwin7.thinking.in.java.chapter.holding;

import java.util.Iterator;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2018/01/23
 * Time: 4:53 PM
 * Desc:
 */
public class NonCollectionSequence extends PetSequence {
    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < pets.length;
            }

            @Override
            public Pet next() {
                return pets[index++];
            }
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        NonCollectionSequence nc = new NonCollectionSequence();
        InterfaceVsIterator.display(nc.iterator());
    }
}

class PetSequence {
    protected Pet[] pets = Pets.createArray(8);
}