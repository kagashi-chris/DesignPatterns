package com.zhen.designPatterns.creational.factory;

public class ConcreteFactoryTwo extends Factory{

    public Product createProduct()
    {
        return new ConcreteProductTwo();
    }
}
