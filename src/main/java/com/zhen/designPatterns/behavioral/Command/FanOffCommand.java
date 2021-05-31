package com.zhen.designPatterns.behavioral.Command;

public class FanOffCommand implements Command{

    private Fan fan;
    private int fanSpeed;

    public FanOffCommand(Fan fan, Receiver receiver) {
        this.fan = fan;
        fanSpeed = fan.getFanSpeed();
    }

    @Override
    public void execute() {
        if (fanSpeed>0)
        {
            fan.setFanSpeed(fanSpeed - 10);
        }
    }

    @Override
    public void undo() {
        if (fanSpeed<100)
        {
            fan.setFanSpeed(fanSpeed + 10);
        }
    }
}
