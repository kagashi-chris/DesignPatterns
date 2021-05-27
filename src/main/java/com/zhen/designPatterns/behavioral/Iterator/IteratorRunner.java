package com.zhen.designPatterns.behavioral.Iterator;

import java.util.Iterator;

public class IteratorRunner {

    public static void main(String[] args) {
        PlayerInventory playerInventory = new PlayerInventory();

        Item sword= new Item("Sword");
        Item shield = new Item("Shield");
        Item potion = new Item("Potion");

        playerInventory.addInventoryItem(sword);
        playerInventory.addInventoryItem(shield);
        playerInventory.addInventoryItem(potion);

        int playerInvSize = playerInventory.getNumItems();
        System.out.println("Player has "+ playerInvSize +" Items in inventory.");

        InventoryIterator iterator = playerInventory.getInventoryIterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        //if implement iterable you can use your class in for loops like this
//
//        PetInventory petInventory = new PetInventory();
//
//        for (Item i : petInventory)
//        {
//            System.out.println(i);
//        }
    }
}
