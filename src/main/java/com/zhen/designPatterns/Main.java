package com.zhen.designPatterns;

import com.zhen.designPatterns.creational.factoryMethod.*;

public class Main {

    public static void main(String[] args) {
        ConcreteFactoryOne concreteFactoryOne = new ConcreteFactoryOne();
        Product product1 = concreteFactoryOne.createProduct();
        System.out.println(product1.getProductType());

        ConcreteFactoryTwo concreteFactoryTwo = new ConcreteFactoryTwo();
        Product product2 = concreteFactoryTwo.createProduct();
        System.out.println(product2.getProductType());
    }
}
