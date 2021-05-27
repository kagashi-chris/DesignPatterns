package com.zhen.designPatterns.creational.factory;

public class FactoryRunner {

    public static void main(String[] args) {

        //Creating factories!
        Factory concreteFactoryOne = new ConcreteFactoryOne();
        Factory concreteFactoryTwo = new ConcreteFactoryTwo();

        //Factories are creating product!
        System.out.println(concreteFactoryOne.createProduct().getProductType());
        System.out.println(concreteFactoryTwo.createProduct().getProductType());

    }
}
