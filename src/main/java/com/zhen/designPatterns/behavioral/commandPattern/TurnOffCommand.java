package com.zhen.designPatterns.behavioral.commandPattern;

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
