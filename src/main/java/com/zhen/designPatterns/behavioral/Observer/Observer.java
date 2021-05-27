package com.zhen.designPatterns.behavioral.Observer;

public abstract class Observer {

    protected EmergencyWeatherBroadcast emergencyWeatherBroadcast;
    public abstract void update(String weather);
}
