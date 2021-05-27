package com.zhen.designPatterns.behavioral.Command;

public class Receiver {

    public void turnOn()
    {
        System.out.println("turned on");
    }

    public void turnOff()
    {
        System.out.println("turned off");
    }
}
