package com.zhen.designPatterns.structural.facade;

public class Facade {

    public Facade() {

    }

    public void doSomething()
    {
        Object1 object1 = new Object1();
        Object2 object2 = new Object2();
        Object3 object3 = new Object3();

        System.out.println(object1.object1DoSomething() + object2.object2DoSomething() + object3.object3DoSomething());
    }


}
