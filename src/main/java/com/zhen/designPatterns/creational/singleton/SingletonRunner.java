package com.zhen.designPatterns.creational.singleton;

public class SingletonRunner {


    public static void main(String[] args) {
        System.out.println(Singleton.getInstance().doSomething());
    }
}
