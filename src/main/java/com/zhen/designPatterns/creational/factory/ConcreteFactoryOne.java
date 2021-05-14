package com.zhen.designPatterns.creational.factory;

public class ConcreteFactoryOne extends Factory {

    public Product createProduct()
    {
        return new ConcreteProductOne();
    }
}
