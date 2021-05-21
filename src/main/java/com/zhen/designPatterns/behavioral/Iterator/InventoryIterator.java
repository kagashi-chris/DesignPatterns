package com.zhen.designPatterns.behavioral.Iterator;

public interface InventoryIterator {

    boolean hasNext();
    String getCurrentItem();
    String next();



}
