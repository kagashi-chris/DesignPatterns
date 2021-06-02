package com.zhen.designPatterns.behavioral.Command;

public abstract class FanCommand implements Command{

    protected Fan fan;

    public FanCommand(Fan fan) {
        this.fan = fan;
    }

    public void fanOn()
    {
        if(fan.getFanSpeed()>=100)
        {
            System.out.println("fan cant go higher than 100!");
            System.out.println("Fan speed: " + fan.getFanSpeed());
        }
        else
        {
            while(fan.getFanSpeed()<100)
            {
                fan.setFanSpeed(fan.getFanSpeed() + 10);
                System.out.println("Fan speed: " + fan.getFanSpeed());
            }
        }
    }

    public void fanOff()
    {
        if(fan.getFanSpeed()<=0)
        {
            System.out.println("fan cant go lower than 0!");
            System.out.println("Fan speed: " + fan.getFanSpeed());
        }
        else
        {
            while(fan.getFanSpeed()>0)
            {
                fan.setFanSpeed(fan.getFanSpeed() - 10);
                System.out.println("Fan speed: " + fan.getFanSpeed());
            }
        }
    }

    @Override
    public abstract void execute();

    @Override
    public abstract void undo();
}
