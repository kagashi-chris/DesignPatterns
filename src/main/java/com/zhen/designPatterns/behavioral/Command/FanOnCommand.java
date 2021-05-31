package com.zhen.designPatterns.behavioral.Command;

public class FanOnCommand implements Command{

    private Fan fan;
    private int fanSpeed;

    public FanOnCommand(Fan fan, Receiver receiver) {
        this.fan = fan;
        fanSpeed = fan.getFanSpeed();
    }

    @Override
    public void execute() {
        if(fanSpeed<100)
        {
            fan.setFanSpeed(fanSpeed + 10);
        }
    }

    @Override
    public void undo() {
        if (fanSpeed>0)
        {
            fan.setFanSpeed(fanSpeed - 10);
        }
    }
}
