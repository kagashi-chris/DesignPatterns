package com.zhen.designPatterns.structural.adapter.objectAdapter;

public class Celsius{

    private double currTemp;

    public Celsius(double currTemp) {
        this.currTemp = currTemp;
    }

    public double getTemperature() {
        return currTemp;
    }

    public void setTemperature(double temperature) {
        currTemp = temperature;
    }
}
