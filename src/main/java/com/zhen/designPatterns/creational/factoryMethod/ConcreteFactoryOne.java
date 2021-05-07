package com.zhen.designPatterns.creational.factoryMethod;

public class ConcreteFactoryOne extends Factory {

    public Product createProduct()
    {
        return new ConcreteProductOne();
    }
}
