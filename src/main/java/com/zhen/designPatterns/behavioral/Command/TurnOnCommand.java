package com.zhen.designPatterns.behavioral.Command;

public class TurnOnCommand implements Command {

    Receiver receiver;

    public TurnOnCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.turnOn();
    }

}
