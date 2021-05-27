package com.zhen.designPatterns.structural.adapter.objectAdapter;

public class FahrenheitTemperatureImpl implements FahrenheitTemperature {

    private double currTemp;

    public FahrenheitTemperatureImpl(double currTemp) {
        this.currTemp = currTemp;
    }

    @Override
    public double getFahrenheitTemperature() {
        return currTemp;
    }

    @Override
    public void setFahrenheitTemperature(double temperature) {
        currTemp = temperature;
    }
}
