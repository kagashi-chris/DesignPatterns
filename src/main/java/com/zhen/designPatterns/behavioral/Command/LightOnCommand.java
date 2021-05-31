package com.zhen.designPatterns.behavioral.Command;

public class LightOnCommand implements Command{

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        if(light.isLightOn() == false)
        {
            light.setLight(true);
            System.out.println("Turning on light!");
        }
        else
        {
            System.out.println("Light is already on");
        }
    }

    @Override
    public void undo() {
        light.setLight(true);
    }
}
