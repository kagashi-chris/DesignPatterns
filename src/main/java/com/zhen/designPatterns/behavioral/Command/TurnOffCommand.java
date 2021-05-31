package com.zhen.designPatterns.behavioral.Command;

public class TurnOffCommand implements Command {
    Receiver receiver;

    public TurnOffCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.turnOff();
    }

    @Override
    public void undo() {
        receiver.turnOn();
    }
}
