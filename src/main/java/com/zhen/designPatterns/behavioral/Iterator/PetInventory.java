package com.zhen.designPatterns.behavioral.Iterator;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class PetInventory implements Iterable{

    @Override
    public void forEach(Consumer action) {

    }

    @Override
    public Spliterator spliterator() {
        return null;
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
