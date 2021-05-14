package com.zhen.designPatterns.creational.abstractFactory;

import com.zhen.designPatterns.creational.factory.Product;

public class LockSetOneAbstractFactory extends AbstractFactory{

    public LockSetOneAbstractFactory() {
        super('1');
    }

    public Lock getLock() {
        return new LockProductOne();
    }

    public Key getKey() {
        return new KeyProductOne();
    }
}
