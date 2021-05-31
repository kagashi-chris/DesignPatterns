package com.zhen.designPatterns.behavioral.Command;

public class SimpleRemoteControl {

    Command[] commands = new Command[2];

    public SimpleRemoteControl() {
    }

    public void setCommand(int buttonNumber, Command command)
    {
        if(buttonNumber > 2)
        {
            System.out.println("There are only 2 buttons!");
            return;
        }
        else if(buttonNumber < 1)
        {
            System.out.println("That's not a real button!");
            return;
        }
        commands[buttonNumber-1] = command;
    }

    public void buttonWasPressed(int buttonNumber)
    {
        commands[buttonNumber-1].execute();
    }

    public void undoButtonWasPressed()
    {
    }

}
