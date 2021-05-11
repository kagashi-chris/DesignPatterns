package com.zhen.designPatterns.structural.adapter.objectAdapter;

public class TemperatureAdapterImpl implements TemperatureAdapter{

    private Temperature temperatureF;

    public TemperatureAdapterImpl(Temperature temperatureF) {
        this.temperatureF = temperatureF;
    }

    @Override
    public double getTemperature() {
        return convertFahrToCel(temperatureF.getTemperature());
    }

    public double convertFahrToCel(double tempF)
    {
        return (tempF - 32 ) * 5/9;
    }
}
