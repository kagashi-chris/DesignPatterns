package com.zhen.designPatterns.behavioral.CommandPattern;

public class TurnOnCommand implements ICommand{

    Receiver receiver;

    public TurnOnCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.turnOn();
    }

}
