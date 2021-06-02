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
        remote.setCommand(Button.ON, new LightOnCommand(light));
        System.out.println("setting remote control button 2 to light off");
        remote.setCommand(Button.OFF, new LightOffCommand(light));

        remote.buttonWasPressed(Button.ON);
        remote.buttonWasPressed(Button.ON);
        remote.buttonWasPressed(Button.OFF);
        remote.buttonWasPressed(Button.OFF);


        System.out.println("setting remote control button 1 to fan on");
        remote.setCommand(Button.ON, new FanOnCommand(fan));
        System.out.println("setting remote control button 2 to fan off");
        remote.setCommand(Button.OFF, new FanOffCommand(fan));

        remote.buttonWasPressed(Button.ON);
        remote.buttonWasPressed(Button.ON);
        remote.buttonWasPressed(Button.OFF);
        remote.buttonWasPressed(Button.OFF);



        remote.undoButtonWasPressed();
        fan.setFanSpeed(50);
    }
}
