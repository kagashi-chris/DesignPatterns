package com.zhen.designPatterns.structural.adapter.objectAdapter;

public class ForeignWaterSource {

    public Celsius getSpringWaterTemperature(){return new Celsius(55);}
}
