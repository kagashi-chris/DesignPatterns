package com.zhen.designPatterns.creational.abstractFactory;

public class AbstractFactoryRunner {

    public static void main(String[] args) {
        System.out.println("Starting Factories DEMO!");
        AbstractFactory setOneFactory = new LockSetOneAbstractFactory();
        AbstractFactory setTwoFactory = new LockSetTwoAbstractFactory();
        Lock lockOne = setOneFactory.getLock();
        Key keyTwo = setTwoFactory.getKey();
        System.out.printf("Made lock %c and key %c\n", lockOne.getLockAndKeySetType(), keyTwo.getLockAndKeySetType());
        System.out.printf("is locked one locked? %b\n",  lockOne.isLocked());

        System.out.println("inserting key into lock");
        lockOne.acceptKey(keyTwo);
        System.out.println("turning key!");
        lockOne.turnKey();
        System.out.printf("is locked one locked? %b\n",  lockOne.isLocked());

        System.out.println("Creating key 1!");
        Key keyOne = setOneFactory.getKey();
        System.out.printf("Made key %c\n",keyTwo.getLockAndKeySetType());
        System.out.println("inserting new key into lock!");
        lockOne.acceptKey(keyOne);
        System.out.println("turning key!");
        lockOne.turnKey();
        System.out.printf("is locked one locked? %b\n",  lockOne.isLocked());

        System.out.println("Ending Factories DEMO!");


    }
}
