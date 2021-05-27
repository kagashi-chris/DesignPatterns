package com.zhen.designPatterns.behavioral.Observer;

public class ObserverOne extends Observer{

    public ObserverOne(){}

    @Override
    public void update(String weather) {
        System.out.println("Observer one sees weather is :" + weather );
    }
}
