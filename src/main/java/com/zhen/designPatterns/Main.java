package com.zhen.designPatterns;

import com.zhen.designPatterns.creational.abstractFactory.AbstractFactory;
import com.zhen.designPatterns.creational.abstractFactory.LockSetOneAbstractFactory;

public class Main {

    public static void main(String[] args) {
        AbstractFactory abstractFactory = new LockSetOneAbstractFactory();
        abstractFactory.getKey();
    }
}
