package com.zhen.designPatterns.creational.abstractFactory;

public class LockSetTwoAbstractFactory extends AbstractFactory{

    public Product getLock() {
        return new LockProductTwo();
    }

    public Product getKey() {
        return new KeyProductTwo();
    }
}
