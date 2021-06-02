package com.zhen.designPatterns.behavioral.Command;

public class FanOffCommand extends FanCommand implements Command{

    public FanOffCommand(Fan fan) {
        super(fan);
    }

    @Override
    public void execute() {
        System.out.println("Fan off pressed!");
        this.fanOff();
    }

    @Override
    public void undo() {
        System.out.println("Undo pressed!");
        this.fanOn();
    }
}
