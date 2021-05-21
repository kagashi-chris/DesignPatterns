package com.zhen.designPatterns.behavioral.Iterator;

public interface Inventory {

    InventoryIterator getInventoryIterator();
    void addInventoryItem(Item item);
    void removeInventoryItem(Item item);
    int getNumItems();
}
