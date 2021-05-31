package com.zhen.designPatterns.behavioral.Command;

public class LightOffCommand implements Command{

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        if(light.isLightOn() == true)
        {
            light.setLight(false);
            System.out.println("Turning off light!");
        }
        else
        {
            System.out.println("Light is already off");
        }
    }

    @Override
    public void undo() {
        light.setLight(true);
    }
}
