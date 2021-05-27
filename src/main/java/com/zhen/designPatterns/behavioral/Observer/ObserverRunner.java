package com.zhen.designPatterns.behavioral.Observer;

public class ObserverRunner {

    public static void main(String[] args) {
        //creating the observable
        EmergencyWeatherBroadcast emergencyWeatherBroadcast = new EmergencyWeatherBroadcast();

        //creating the observers
        ObserverOne observerOne = new ObserverOne();
        ObserverTwo observerTwo = new ObserverTwo();

        //subscribing the observers
        emergencyWeatherBroadcast.subscribe(observerOne);
        emergencyWeatherBroadcast.subscribe(observerTwo);

        //notify the observers whenever there is change
        emergencyWeatherBroadcast.setWeather("sunny");
        emergencyWeatherBroadcast.setWeather("raining");

        //observer two left!
        emergencyWeatherBroadcast.unsubscribe(observerTwo);

        emergencyWeatherBroadcast.setWeather("thunder storm!");


    }
}
