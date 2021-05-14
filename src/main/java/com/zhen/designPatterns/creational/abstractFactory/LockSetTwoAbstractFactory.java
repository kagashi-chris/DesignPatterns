package com.zhen.designPatterns.creational.abstractFactory;

import com.zhen.designPatterns.creational.factory.Product;

public class LockSetTwoAbstractFactory extends AbstractFactory{

    public LockSetTwoAbstractFactory() {
        super('2');
    }

    public Lock getLock() {
        return new LockProductTwo();
    }

    public Key getKey() {
        return new KeyProductTwo();
    }
}
