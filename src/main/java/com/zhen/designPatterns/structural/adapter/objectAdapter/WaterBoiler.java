package com.zhen.designPatterns.structural.adapter.objectAdapter;

public class WaterBoiler {

    //starting at 130 degrees; water boils at 212 fahrenheit degrees
    FahrenheitTemperature currentDegreesFahrenheit;

    public WaterBoiler(FahrenheitTemperature currentDegreesFahrenheit) {
        this.currentDegreesFahrenheit = currentDegreesFahrenheit;
    }

    public void makeBoiling()
    {
        System.out.printf("current temperature is : %f degrees fahrenheit\n", currentDegreesFahrenheit.getFahrenheitTemperature());
        double tempToAdd = 212 - currentDegreesFahrenheit.getFahrenheitTemperature();
        System.out.printf("heating up by %f degrees\n", tempToAdd);
        currentDegreesFahrenheit.setFahrenheitTemperature(currentDegreesFahrenheit.getFahrenheitTemperature()+tempToAdd);
        System.out.printf("temperature is now: %f degrees fahrenheit\n", currentDegreesFahrenheit.getFahrenheitTemperature());
    }
}
