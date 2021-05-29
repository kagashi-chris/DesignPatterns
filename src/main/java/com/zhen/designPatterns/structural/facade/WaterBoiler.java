package com.zhen.designPatterns.structural.facade;

public class WaterBoiler {

    private Water water;

    public void pourInWater(Water water)
    {
        this.water = water;
    }

    public void boilWater()
    {
        if(water == null)
        {
            System.out.println("no water");
        }
        else
        {
            water.setTemperature("Hot");
        }

    }
}
