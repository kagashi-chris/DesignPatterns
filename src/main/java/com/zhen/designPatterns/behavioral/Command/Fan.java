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
        if(Math.abs(fanSpeed - this.fanSpeed) > 10)
        {
            System.out.println("Fan exploded!!!");
            System.exit(1);
        }
        this.fanSpeed = fanSpeed;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "fanSpeed=" + fanSpeed +
                '}';
    }
}
