package com.zhen.designPatterns.creational.abstractFactory;

public class LockSetOneAbstractFactory extends AbstractFactory{

    public Product getLock() {
        return new LockProductOne();
    }

    public Product getKey() {
        return new KeyProductOne();
    }
}
