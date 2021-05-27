package com.zhen.designPatterns.behavioral.Observer;

public class ObserverTwo extends Observer{

    public ObserverTwo() {
    }

    @Override
    public void update(String weather) {
        System.out.println("Observer two sees weather is :" + weather );
    }
}
