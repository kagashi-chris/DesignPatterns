package com.zhen.designPatterns.structural.facade;

public class Water extends Liquid{

    public Water() {
        temperature = "Room Temperature";
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Water{}";
    }
}
