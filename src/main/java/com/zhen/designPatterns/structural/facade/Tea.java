package com.zhen.designPatterns.structural.facade;

public class Tea extends Liquid{

    String tea = "This is tea";
    String temperature = "Hot";


    public String getTea() {
        return tea;
    }

    public String getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "Tea{" +
                "tea='" + tea + '\'' +
                ", temperature='" + temperature + '\'' +
                '}';
    }
}
