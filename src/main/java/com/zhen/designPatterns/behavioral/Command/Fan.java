package com.zhen.designPatterns.behavioral.Command;

public class Fan {

    private int fanSpeed;

    public Fan() {
        fanSpeed = 0;
    }

    public int getFanSpeed() {
        return fanSpeed;
    }

    public void setFanSpeed(int fanSpeed) {
        this.fanSpeed = fanSpeed;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "fanSpeed=" + fanSpeed +
                '}';
    }
}
