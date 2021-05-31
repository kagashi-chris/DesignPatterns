package com.zhen.designPatterns.behavioral.Command;

public class FanOffCommand implements Command{

    private Fan fan;

    public FanOffCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        if (fan.getFanSpeed()>0)
        {
            fan.setFanSpeed(fan.getFanSpeed() - 10);
            System.out.println("Fans speed - was pressed");
            System.out.println("Fan speed: " + fan.getFanSpeed());
        }
        else
        {
            System.out.println("fan cant go lower than 0!");
            System.out.println("Fan speed: " + fan.getFanSpeed());
        }
    }

    @Override
    public void undo() {
        if (fan.getFanSpeed()<100)
        {
            fan.setFanSpeed(fan.getFanSpeed() + 10);
            System.out.println("Undo fan speed - was pressed");
            System.out.println("Fan speed: " + fan.getFanSpeed());
        }
    }
}
