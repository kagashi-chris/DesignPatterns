package com.zhen.designPatterns.structural.adapter.objectAdapter;

public class AdapterRunner {

    public static void main(String[] args) {

        //131 degrees fahrenheit = 55 celsius
        FahrenheitTemperature fahrenheitTemperature = new FahrenheitTemperatureImpl(131);
        WaterBoiler waterBoiler = new WaterBoiler(fahrenheitTemperature);
        waterBoiler.makeBoiling();

        ForeignWaterSource foreignWaterSource = new ForeignWaterSource();
        Celsius foreignWaterTemp = foreignWaterSource.getSpringWaterTemperature();

        FahrenheitTemperature fahrenheitTemperature2 = new CelsiusToFahrenheitAdapter(foreignWaterTemp);
        WaterBoiler waterBoiler2 = new WaterBoiler(fahrenheitTemperature2);
        waterBoiler2.makeBoiling();

    }

}
