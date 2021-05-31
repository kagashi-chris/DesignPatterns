package com.zhen.designPatterns.behavioral.Command;

import javax.sound.midi.Receiver;

public class CommandRunner {

    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Fan fan = new Fan();
        Light light = new Light();

        //remote has 2 buttons, Button 1 and Button 2
        //setCommand takes in an int and command. The int decide which button to put it on (1 or 2)
        //and Command type as the other param
        //same for buttonWasPressed method

        System.out.println("setting remote control button 1 to light on");
        remote.setCommand(1, new LightOnCommand(light));
        System.out.println("setting remote control button 2 to light off");
        remote.setCommand(2, new LightOffCommand(light));

        remote.buttonWasPressed(1);
        remote.buttonWasPressed(1);
        remote.buttonWasPressed(2);
        remote.buttonWasPressed(2);


        System.out.println("setting remote control button 1 to fan on");
        remote.setCommand(1, new FanOnCommand(fan));
        System.out.println("setting remote control button 2 to fan off");
        remote.setCommand(2, new FanOffCommand(fan));

        remote.buttonWasPressed(1);
        remote.buttonWasPressed(1);
        remote.buttonWasPressed(1);
        remote.buttonWasPressed(2);
        remote.buttonWasPressed(2);
        remote.buttonWasPressed(2);


        remote.undoButtonWasPressed();
    }
}
