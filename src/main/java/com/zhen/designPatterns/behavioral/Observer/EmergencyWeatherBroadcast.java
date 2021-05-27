package com.zhen.designPatterns.behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class EmergencyWeatherBroadcast {

    private List<com.zhen.designPatterns.behavioral.Observer.Observer> observerList = new ArrayList<>();
    private String weather;

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
        notifyObservers(weather);
    }

    public void subscribe(com.zhen.designPatterns.behavioral.Observer.Observer observer)
    {
        observerList.add(observer);
    }

    public void unsubscribe(com.zhen.designPatterns.behavioral.Observer.Observer observer)
    {
        observerList.remove(observer);
    }

    public void notifyObservers(String weather)
    {
        for(Observer observer: observerList)
        {
            observer.update(weather);
        }
    }








}
