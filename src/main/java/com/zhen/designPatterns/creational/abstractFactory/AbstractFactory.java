package com.zhen.designPatterns.creational.abstractFactory;

import com.zhen.designPatterns.creational.factory.Product;

public abstract class AbstractFactory {

    private char lockAndKeySetType;

    public AbstractFactory(char lockAndKeySetType) {
        this.lockAndKeySetType = lockAndKeySetType;
    }

    public abstract Lock getLock();

    public abstract Key getKey();

}
