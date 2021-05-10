package com.zhen.designPatterns.behavioral.CommandPattern;

public class TurnOffCommand implements ICommand{
    Receiver receiver;

    public TurnOffCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.turnOff();
    }
}
