package com.zhen.designPatterns.behavioral.Command;

public class FanOnCommand extends FanCommand implements Command{

    public FanOnCommand(Fan fan) {
        super(fan);
    }

    @Override
    public void execute() {
        System.out.println("Fan on pressed!");
        this.fanOn();
    }

    @Override
    public void undo() {
        System.out.println("Undo pressed!");
        this.fanOff();
    }
}
