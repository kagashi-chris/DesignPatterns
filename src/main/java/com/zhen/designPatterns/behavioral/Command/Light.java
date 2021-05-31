package com.zhen.designPatterns.behavioral.Command;

public class Light {

    boolean lightOn;

    public Light() {
        lightOn = false;
    }

    public boolean isLightOn() {
        return lightOn;
    }

    public void setLight(boolean lightOn) {
        this.lightOn = lightOn;
    }
}
