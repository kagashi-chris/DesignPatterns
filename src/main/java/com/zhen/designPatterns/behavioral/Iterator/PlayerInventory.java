package com.zhen.designPatterns.behavioral.Iterator;

import java.util.ArrayList;
import java.util.List;

public class PlayerInventory implements Inventory{

    private List<Item> itemList = new ArrayList<>();
    private int itemListSize = 0;

    @Override
    public void addInventoryItem(Item item) {
        if(itemList.add(item)) itemListSize++;
    }

    @Override
    public void removeInventoryItem(Item item) {
        if(itemList.remove(item)) itemListSize--;
    }

    @Override
    public int getNumItems() {
        return itemListSize;
    }

    @Override
    public InventoryIterator getInventoryIterator() {
        return new PlayerInventoryIterator();
    }

    private class PlayerInventoryIterator implements InventoryIterator{

        private int currentIndex = -1;

        @Override
        public boolean hasNext() {
            if(currentIndex+1<itemListSize)
            {
                System.out.println("true");
                return true;
            }
            else
            {
                System.out.println("false");
                return false;
            }
        }

        @Override
        public Object next() {
            if(currentIndex+1<itemListSize)
            {
                currentIndex++;
                return itemList.get(currentIndex);
            }
            else
            {
                return null;
            }
        }


    }
}
