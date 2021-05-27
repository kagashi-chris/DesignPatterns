package com.zhen.designPatterns.structural.adapter.objectAdapter;

public class CelsiusToFahrenheitAdapter implements FahrenheitTemperature {

    Celsius celsius;

    public CelsiusToFahrenheitAdapter(Celsius celsius) {
        this.celsius = celsius;
    }

    @Override
    public double getFahrenheitTemperature() {
        double celTemp = celsius.getTemperature();
        return (celTemp * 9/5) + 32;
    }

    @Override
    public void setFahrenheitTemperature(double temperature) {
        celsius.setTemperature((temperature - 32 ) * 5/9);
    }
}
