package com.zhen.designPatterns.creational.singleton;

import java.util.Arrays;

public class Singleton {


    private static Singleton singleton;

    private Singleton()
    {
    }

    public static synchronized Singleton getInstance()
    {
        if(singleton == null)
        {
            singleton = new Singleton();
        }

        return singleton;
    }

    public String doSomething()
    {
        return "singleton string";
    }
}
