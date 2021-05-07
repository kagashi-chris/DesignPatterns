package com.zhen.designPatterns.creational.factoryMethod;

public class ConcreteFactoryTwo extends Factory{

    public Product createProduct()
    {
        return new ConcreteProductTwo();
    }
}
